package com.echotown.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@Table(name = "certifications")
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certification_id")
    private Long certificationId;

    @Column(name = "certification_name")
    private String certificationName;

    @Column(name = "cert_description")
    private String certDescription;

    @Column(name = "authority")
    private String authority;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Builder
    private Certification(String certificationName, String certDescription, String authority, LocalDateTime createdAt) {
        this.certificationName = certificationName;
        this.certDescription = certDescription;
        this.authority = authority;
        this.createdAt = createdAt;
    }
}
