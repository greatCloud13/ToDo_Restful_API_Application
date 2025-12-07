# 🗒 ToDo 관리 REST API 서버

> Spring Security 인증부터 AWS 배포까지 전체 개발 주기를 경험한 실무 중심 학습 프로젝트

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.6-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Docker](https://img.shields.io/badge/Docker-Latest-blue.svg)](https://www.docker.com/)
[![AWS](https://img.shields.io/badge/AWS-EC2-orange.svg)](https://aws.amazon.com/ec2/)

## 📋 목차

- [프로젝트 소개](#-프로젝트-소개)
- [핵심 성과](#-핵심-성과)
- [기술 스택](#-기술-스택)
- [주요 기능](#-주요-기능)

---

## 🎯 프로젝트 소개

.NET 인턴 경험 후 Spring Boot 생태계 재학습을 위해 진행한 프로젝트.  
인증 시스템부터 실제 운영 환경 배포까지 전 과정을 직접 구현하며 실무 역량 강화.

### 프로젝트 기간
2024-06-08 ~ 2024-10-19

---

## 🚀 핵심 성과

### 1. JWT 기반 인증 시스템 구현

**Access Token / Refresh Token 전략**
- Access Token: 짧은 만료 시간 (1시간) → 보안 강화
- Refresh Token: 긴 만료 시간 (2주) → 사용자 편의성
- Token 재발급 엔드포인트로 세션 유지

**Spring Security Filter Chain 커스터마이징**
- JwtAuthenticationFilter로 토큰 검증 자동화
- 인증 실패 시 명확한 에러 응답 (401 Unauthorized)
- 역할 기반 접근 제어 (USER, ADMIN)

**학습 성과**
- JWT의 보안 취약점 및 대응 방법 학습
- Filter Chain 동작 원리 체득

---

### 2. CI/CD 파이프라인 구축

**자동화된 배포 프로세스**
```
코드 푸시 (GitHub)
    ↓
자동 테스트 실행
    ↓
Docker 이미지 빌드
    ↓
DockerHub 푸시
    ↓
EC2 자동 배포
```

**배포 자동화 효과**
| 항목 | 수동 배포 | 배포 자동화 | 개선 효과 |
|------|----------|-------------|-----------|
| 배포 시간 | ~8분 | ~2분 | **75% 단축** |
| 휴먼 에러 | 빈번함 | 없음 | **안정성 향상** |
| 테스트 실행 | 수동 | 설정한 작업마다 진행 | **코드 품질 보장** |

---

## 🛠 기술 스택

### Backend
- **Framework**: Spring Boot 3.4.6
- **Language**: Java 17
- **Security**: Spring Security, JWT (Access/Refresh Token)
- **ORM**: Hibernate/JPA

### Database
- **RDBMS**: MySQL 8.0

### Infrastructure
- **Cloud**: AWS EC2 (Ubuntu)
- **Containerization**: Docker, Docker Compose
- **Web Server**: Nginx
- **CI/CD**: GitHub Actions

---

## ✨ 주요 기능

### 1. 인증 시스템
- Spring Security + JWT 기반 Stateless 인증
- Access Token (1시간) / Refresh Token (2주) 이중 토큰 전략
- Filter Chain 커스터마이징으로 인증/인가 로직 분리

### 2. ToDo CRUD
- RESTful API 설계 (GET, POST, PUT, DELETE)
- 사용자별 ToDo 격리 (인증된 사용자만 자신의 데이터 접근)
- 완료/미완료 상태 관리

### 3. 프로덕션 배포 환경
- Docker 멀티 스테이지 빌드로 이미지 경량화
- Nginx 리버스 프록시 (정적 파일 서빙 + API 라우팅)
- Docker Compose로 다중 컨테이너 오케스트레이션
- AWS EC2 Ubuntu 환경 운영

---

## 🔗 링크
- **Backend Repository**: https://github.com/greatCloud13/ToDo_Restful_API_Application
- **Frontend Repository**: https://github.com/greatCloud13/ToDo_Restful_API_Application_Front

---

## 📝 개선 방향 (향후 계획)
- [ ] Spring Boot 테스트 커버리지 확대 (JUnit 5, Mockito)
- [ ] Redis Session Storage 도입 (Refresh Token 관리)
- [ ] 로그 모니터링 (ELK Stack)
