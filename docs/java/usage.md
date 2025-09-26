## 사용 가이드

### 1) 전체 컴파일 후 원하는 예제 실행
```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out basic.Basic23_if
```

### 2) 입력을 사용하는 예제 실행 팁
- 표준 입력을 요구하는 예제(`Scanner`)는 실행 후 콘솔에 안내된 형식대로 값을 입력합니다.
- 예: `basic.Basic23_if`
  - 입력: `1 홍길동 90 90 90`

### 3) 난수/수학 예제
`basic.Basic37_random` 은 난수 생성 패턴을 보여줍니다.
```bash
java -cp out basic.Basic37_random
```

### 4) 자주 쓰는 클래스별 시나리오
- 조건문 학습: `basic.Basic22_if`, `basic.Basic23_if`
- 반복문 학습: `basic.Basic32_while`, `basic.Basic33_for`, `basic.Basic36_for`
- 입력/출력: `basic.Basic09_scanner`, `basic.Basic05_printf`

