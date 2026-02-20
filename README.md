# Spring Boot + Jenkins CI/CD Pipeline 🔧

> Automated CI/CD pipeline for Spring Boot — code pushed to GitHub triggers
> Jenkins to build, test, and deploy automatically. Reduced manual deployment
> from 45 minutes to under 15 minutes.

---

## What This Demonstrates

This repo shows the CI/CD pipeline pattern I implemented at Apple — automated
builds that eliminate manual deployment steps and human error.

---

## Pipeline Flow
```
Developer pushes code
        │
        ▼
  GitHub Webhook
        │
        ▼
  Jenkins Pipeline
  ┌─────────────┐
  │ 1. Checkout │
  │ 2. Build    │  mvn clean install
  │ 3. Test     │  mvn test
  │ 4. Package  │  Docker image build
  │ 5. Deploy   │  Push to registry
  └─────────────┘
        │
        ▼
  Application Running
```

## Tech Stack
- Java 21 / Spring Boot 3
- Jenkins (Declarative Pipeline)
- Maven
- Docker

## Jenkinsfile Highlights
- Declarative pipeline syntax
- Parallel test execution
- Docker image build & push
- Environment-specific deployment stages

## Key Learnings
This pattern directly mirrors production CI/CD at enterprise scale —
the same approach used to reduce deployment time at Apple from 45 min → 15 min.
