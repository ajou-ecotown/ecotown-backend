package com.echotown.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_description")
    private String brandDescription;

    @Column(name = "esg_rating")
    private String esgRating;

    @Column(name = "website")
    private String website;

    @Column(name = "brand_image", columnDefinition="TEXT")
    private String brandImage;

    @JoinColumn(name = "certification_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Certification certification;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

    @Builder
    private Brand(String brandName, String brandDescription, String esgRating, String website, String brandImage,
                  Certification certification) {
        this.brandName = brandName;
        this.brandDescription = brandDescription;
        this.esgRating = esgRating;
        this.website = website;
        this.brandImage = brandImage;
        this.certification = certification;
    }

}
