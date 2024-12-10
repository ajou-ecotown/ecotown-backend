INSERT INTO Users (user_id, username, created_at, email, password)
VALUES (1, '김종민', '2024-07-15 10:00:00', 'jwinser0@skype.com', 'sC6$UIbuX0<'),
       (2, '서민지', '2024-09-24 14:30:0', 'pmerchant1@blogger.com', 'bL8+VDsaCa*8tTR0'),
       (3, '이민서', '2024-05-26 12:15:00', 'mgorusso2@privacy.gov.au', 'fM1\\Ke@''<Tcg'),
       (4, '정현지', '2024-06-20 18:45:00', 'bmatuschek3@qq.com', 'uG5{0/gm#GK*`q'),
       (5, '유재석', '2024-06-21 09:20:00', 'efathers4@unc.edu', 'mD5~srF@!#_q5B>'),
        (6, '김아주', '2024-12-04 21:08:07', 'asd@asd.com', 'asd123!');

INSERT INTO Categories (category_id, category_name) VALUES
    (1, 'Semiconductor'),
    (2, 'financial instruments'),
    (3, 'Electronic Materials'),
    (4, 'Lifestyle'),
    (5, 'card products');
INSERT INTO Certifications (certification_id, certification_name, cert_description, authority, created_at)
VALUES (101, '통합', 'Quality Management Systems Certification', 'International Organization for Standardization',
        '2024-01-01 00:00:00'),
       (102, 'G 일반', 'Leadership in Energy and Environmental Design', 'U.S. Green Building Council',
        '2024-02-15 00:00:00'),
       (103, 'ESG일반', 'Certification for ethical production and trade', 'Fair Trade USA', '2024-03-10 00:00:00'),
       (104, 'G 금융', 'Energy efficiency certification for products and buildings',
        'U.S. Environmental Protection Agency', '2024-04-20 00:00:00'),
       (105, 'G 금융', 'Certification for organic agricultural products', 'USDA Organic', '2024-05-05 00:00:00');


INSERT INTO Brands (brand_id, brand_name, esg_rating, brand_description, certification_id, website, brand_image)
VALUES (1, 'SC제일은행', '명예기업', '2024 대한민국 최고의 경영대상', 101, 'https://www.standardchartered.co.kr/np/kr/Intro.jsp',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3.png'),
       (2, '롯데정밀화학', '최우수기업', '시대적 요구를 읽어 인류에 이로운 오늘 그 너머 지속 가능한 지구의 내일을 만드는 화학 기업', 102,
        'https://www.lottefinechem.com/',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__1_.png'),
       (3, '케이티앤지', '최우수기업', '바른, 깨어있는, 함께하는 기업 KT&G입니다', 103, 'https://www.ktng.com/',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__2_.png'),
       (4, 'JB금융지주', '우수기업', '내일을 보는 젊고 강한 금융', 104, 'https://www.jbfg.com/main/index.do',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__3_.png'),
       (5, '삼성카드', '우수기업', '나의 관심사를 넓히고 내가 좋아하는 걸 끊임없이 찾게 해주는 CREATE MY UNIVERSE', 105,
        'https://www.samsungcard.com/personal/main/UHPPCO0101M0.jsp',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__4_.png'),
       (6, '현대이지웰', '우수기업', '기업의 성공과 성장을 돕는 Good Partner', 103, 'https://www.hyundaiezwel.com/renew/main.ez',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__5_.png'),
       (7, 'SK가스', '우수기업', '우리는 에너지의 미래를 만듭니다', 104, 'https://skgas.co.kr/main/index.html',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3.jpeg'),
       (8, 'HD현대건설기계', '개선기업', '모두를 위한 안락한 내일,우리가 가장 앞서 만들어 갑니다.', 102, 'https://www.hd-hyundaice.com/ko',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__6_.png'),
       (9, 'KB국민카드', '우수기업', '언제 어디서나 편하게 KB pay로 다 됩니다!', 101, 'https://card.kbcard.com/CMN/DVIEW/HOAMCXPRIZZC0002',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__1_.jpeg'),
       (10, '현대캐피탈', '우수기업', '', 101, 'https://www.hyundaicapital.com/main/main/CPMNMN0101.hc',
        'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3__7_.png');
INSERT INTO Products (product_id, product_name, brand_id, category_id, product_image) VALUES
                                                                                          (1, '녹색체크카드', 1, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/SC%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B3%E1%86%AB%E1%84%92%E1%85%A2%E1%86%BC_%E1%84%82%E1%85%A9%E1%86%A8%E1%84%89%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8F%E1%85%B3%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.jpeg'),
                                                                                          (2, '친환경 신용카드', 1, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/SC%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B3%E1%86%AB%E1%84%92%E1%85%A2%E1%86%BC_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%89%E1%85%B5%E1%86%AB%E1%84%8B%E1%85%AD%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.jpeg'),
                                                                                          (3, '녹색예금', 1, 2, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/SC%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B3%E1%86%AB%E1%84%92%E1%85%A2%E1%86%BC_%E1%84%82%E1%85%A9%E1%86%A8%E1%84%89%E1%85%A2%E1%86%A8%E1%84%8B%E1%85%A8%E1%84%80%E1%85%B3%E1%86%B7.jpeg'),
                                                                                          (4, '팍한 숲 프로젝트', 1, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%A1%E1%86%A8%E1%84%92%E1%85%A1%E1%86%B7%E1%84%89%E1%85%AE%E1%87%81.png'),
                                                                                          (5, '친환경체크카드', 1, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/SC%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B3%E1%86%AB%E1%84%92%E1%85%A2%E1%86%BC_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC%E1%84%8E%E1%85%A6%E1%84%8F%E1%85%B3%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.png'),
                                                                                          (6, '친환경 전자재료', 2, 3, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%85%E1%85%A9%E1%86%BA%E1%84%83%E1%85%A6%E1%84%8C%E1%85%A5%E1%86%BC%E1%84%86%E1%85%B5%E1%86%AF%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%8C%E1%85%A1%E1%84%8C%E1%85%A2%E1%84%85%E1%85%AD.jpeg'),
                                                                                          (7, '친환경 OLED', 2, 3, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%85%E1%85%A9%E1%86%BA%E1%84%83%E1%85%A6%E1%84%8C%E1%85%A5%E1%86%BC%E1%84%86%E1%85%B5%E1%86%AF%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_OLED.jpeg'),
                                                                                          (8, '친환경 화학제품', 2, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%85%E1%85%A9%E1%86%BA%E1%84%83%E1%85%A6%E1%84%8C%E1%85%A5%E1%86%BC%E1%84%86%E1%85%B5%E1%86%AF%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%89%E1%85%A2%E1%86%BC%E1%84%92%E1%85%AA%E1%86%AF%E1%84%8B%E1%85%AD%E1%86%BC_%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8%E1%84%8C%E1%85%A6%E1%84%91%E1%85%AE%E1%86%B7.jpeg?ref_type=heads'),
                                                                                          (9, '지속가능한 소재 상품', 2, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%85%E1%85%A9%E1%86%BA%E1%84%83%E1%85%A6%E1%84%8C%E1%85%A5%E1%86%BC%E1%84%86%E1%85%B5%E1%86%AF%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8_%E1%84%8C%E1%85%B5%E1%84%89%E1%85%A9%E1%86%A8%E1%84%80%E1%85%A1%E1%84%82%E1%85%B3%E1%86%BC%E1%84%92%E1%85%A1%E1%86%AB_%E1%84%89%E1%85%A9%E1%84%8C%E1%85%A2.jpeg?ref_type=heads'),
                                                                                          (10, '친환경 생활용 화학제품', 2, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%92%E1%85%AA%E1%84%92%E1%85%A1%E1%86%A8%E1%84%8C%E1%85%A6%E1%84%91%E1%85%AE%E1%86%B7.jpeg'),
                                                                                          (11, '친환경 전자담배', 3, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%8C%E1%85%A1%E1%84%83%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A2.jpeg'),
                                                                                          (12, '친환경 담배', 3, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%83%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A2.jpeg'),
                                                                                          (13, '친환경 건강보험 상품', 3, 2, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/KT_G_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%80%E1%85%A5%E1%86%AB%E1%84%80%E1%85%A1%E1%86%BC%E1%84%87%E1%85%A9%E1%84%92%E1%85%A5%E1%86%B7_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7.png'),
                                                                                          (14, '친환경 초슬림 담배', 3, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/KT_G_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%8E%E1%85%A9%E1%84%89%E1%85%B3%E1%86%AF%E1%84%85%E1%85%B5%E1%86%B7_%E1%84%83%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A2.jpeg'),
                                                                                          (15, '친환경 라이터', 3, 4, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8C%E1%85%A2%E1%84%92%E1%85%AA%E1%86%AF%E1%84%8B%E1%85%AD%E1%86%BC_%E1%84%80%E1%85%A1%E1%84%82%E1%85%B3%E1%86%BC%E1%84%92%E1%85%A1%E1%86%AB_%E1%84%85%E1%85%A1%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A5.jpeg?ref_type=heads'),
                                                                                          (16, '친환경 대출상품', 4, 2, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/JB%E1%84%80%E1%85%B3%E1%86%B7%E1%84%8B%E1%85%B2%E1%86%BC%E1%84%8C%E1%85%B5%E1%84%8C%E1%85%AE_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%83%E1%85%A2%E1%84%8E%E1%85%AE%E1%86%AF%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7.jpeg'),
                                                                                          (17, '친환경 신용카드', 4, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/JB%E1%84%80%E1%85%B3%E1%86%B7%E1%84%8B%E1%85%B2%E1%86%BC%E1%84%8C%E1%85%B5%E1%84%8C%E1%85%AE_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%89%E1%85%B5%E1%86%AB%E1%84%8B%E1%85%AD%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.jpeg'),
                                                                                          (18, '녹색 정기 예금', 4, 2, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/JB%E1%84%80%E1%85%B3%E1%86%B7%E1%84%8B%E1%85%B2%E1%86%BC%E1%84%8C%E1%85%B5%E1%84%8C%E1%85%AE_%E1%84%82%E1%85%A9%E1%86%A8%E1%84%89%E1%85%A2%E1%86%A8%E1%84%8B%E1%85%A8%E1%84%80%E1%85%B3%E1%86%B7%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7.jpeg'),
                                                                                          (19, '친환경 체크카드', 4, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%8E%E1%85%A6%E1%84%8F%E1%85%B3_%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.jpeg'),
                                                                                          (20, '친환경 신용카드 2', 4, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%89%E1%85%B5%E1%86%AB%E1%84%8B%E1%85%AD%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B32.jpeg'),
                                                                                          (21, '그린포인트 카드', 5, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%80%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%91%E1%85%A9%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%90%E1%85%B3_%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.jpeg'),
                                                                                          (22, '친환경 포인트 적립 카드', 5, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%89%E1%85%A1%E1%86%B7%E1%84%89%E1%85%A5%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%91%E1%85%A9%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%90%E1%85%B3_%E1%84%8C%E1%85%A5%E1%86%A8%E1%84%85%E1%85%B5%E1%86%B8_%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3.png'),
                                                                                          (23, '친환경 카드 패키지', 5, 5, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%89%E1%85%A1%E1%86%B7%E1%84%89%E1%85%A5%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3_%E1%84%91%E1%85%A2%E1%84%8F%E1%85%B5%E1%84%8C%E1%85%B5.jpeg'),
                                                                                          (24, '친환경 보일러 구메 상품', 5, 2, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%89%E1%85%A1%E1%86%B7%E1%84%89%E1%85%A5%E1%86%BC%E1%84%8F%E1%85%A1%E1%84%83%E1%85%B3_%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%87%E1%85%A9%E1%84%8B%E1%85%B5%E1%86%AF%E1%84%85%E1%85%A5_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%91%E1%85%AE%E1%86%B7.jpeg'),
                                                                                          (25, '친환경 반도체', 5, 1, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%87%E1%85%A1%E1%86%AB%E1%84%83%E1%85%A9%E1%84%8E%E1%85%A6.jpeg');

INSERT INTO Reviews (review_id, user_id, product_id, rating, title, content, like_count, dislike_count, created_at, review_image) VALUES
                                                                                                                                      (1, 1, 1, 10, '훌륭한 제품!', '이 제품은 기대 이상이었습니다. 강력 추천합니다!', 10, 0, '2024-11-01 10:00:00', 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%90%E1%85%A2%E1%84%8B%E1%85%A3%E1%86%BC%E1%84%80%E1%85%AA%E1%86%BC_%E1%84%8E%E1%85%AE%E1%86%BC%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%80%E1%85%B5.jpeg'),
                                                                                                                                      (2, 2, 2, 7, '좋은 품질', '제품은 좋았지만 배송이 느렸습니다.', 8, 1, '2024-11-02 14:30:00', 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8E%E1%85%B5%E1%86%AB%E1%84%92%E1%85%AA%E1%86%AB%E1%84%80%E1%85%A7%E1%86%BC_%E1%84%87%E1%85%A9%E1%84%8C%E1%85%A9%E1%84%87%E1%85%A2%E1%84%90%E1%85%A5%E1%84%85%E1%85%B5.jpeg'),
                                                                                                                                      (3, 3, 3, 5, '보통의 경험', '잘 작동하지만 몇 가지 결함을 발견했습니다.', 5, 2, '2024-11-03 12:15:00','https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8C%E1%85%A2%E1%84%92%E1%85%AA%E1%86%AF%E1%84%8B%E1%85%AD%E1%86%BC_%E1%84%91%E1%85%B3%E1%86%AF%E1%84%85%E1%85%A1%E1%84%89%E1%85%B3%E1%84%90%E1%85%B5%E1%86%A8_%E1%84%8C%E1%85%B5%E1%84%80%E1%85%A1%E1%86%B8.jpeg'),
                                                                                                                                      (4, 4, 4, 2, '별로예요', '한 번 사용 후 제품이 부셔졌습니다.', 2, 5, '2024-11-04 18:45:00', 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%89%E1%85%A2%E1%86%BC%E1%84%87%E1%85%AE%E1%86%AB%E1%84%92%E1%85%A2%E1%84%89%E1%85%A5%E1%86%BC_%E1%84%92%E1%85%B2%E1%84%83%E1%85%A2%E1%84%91%E1%85%A9%E1%86%AB_%E1%84%8F%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%89%E1%85%B3.jpeg'),
                                                                                                                                      (5, 5, 5, 1, '끔찍해요', '이 제품은 전혀 추천하지 않습니다.', 1, 10, '2024-11-05 09:20:00', 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%8C%E1%85%B5%E1%84%89%E1%85%A9%E1%86%A8%E1%84%80%E1%85%A1%E1%84%82%E1%85%B3%E1%86%BC%E1%84%92%E1%85%A1%E1%86%AB_%E1%84%83%E1%85%A2%E1%84%82%E1%85%A1%E1%84%86%E1%85%AE_%E1%84%8F%E1%85%B5%E1%84%87%E1%85%A9%E1%84%83%E1%85%B3.jpeg');


INSERT INTO Points (point_id, user_id, activity, point, created_at)
VALUES (1, 1, 'Review Posted', 50, '2024-11-01 10:00:00'),
       (2, 2, 'Review Posted', 80, '2024-11-02 14:30:00'),
       (3, 3, 'Review Posted', 20, '2024-11-03 12:15:00'),
       (4, 4, 'Review Liked', 10, '2024-11-04 18:45:00'),
       (5, 5, 'Review Liked', 5, '2024-11-05 09:20:00');
-- INSERT INTO Products (product_id, product_name, brand_id, category_id, product_image) VALUES
--                                                                                           (1, '태양광 충전기', 1, 1, 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%90%E1%85%A2%E1%84%8B%E1%85%A3%E1%86%BC%E1%84%80%E1%85%AA%E1%86%BC_%E1%84%8E%E1%85%AE%E1%86%BC%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%80%E1%85%B5.jpeg');
-- INSERT INTO Reviews (review_id, user_id, product_id, rating, title, content, like_count, dislike_count, created_at, review_image) VALUES
--                                                                                                                               (1, 1, 1, 10, '훌륭한 제품!', '이 제품은 기대 이상이었습니다. 강력 추천합니다!', 0, 0, '2024-11-01 10:00:00', 'https://git.ajou.ac.kr/minmin3927/eco-town/-/raw/main/%E1%84%90%E1%85%A2%E1%84%8B%E1%85%A3%E1%86%BC%E1%84%80%E1%85%AA%E1%86%BC_%E1%84%8E%E1%85%AE%E1%86%BC%E1%84%8C%E1%85%A5%E1%86%AB%E1%84%80%E1%85%B5.jpeg');


