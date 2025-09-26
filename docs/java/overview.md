## Java 모듈 및 실행 개요

### 모듈 정보
`src/module-info.java` 에서 다음과 같이 정의되어 있습니다:

```7:10:/workspace/src/module-info.java
module java {
	  requires java.sql;     // SQL API 사용
	  
}
```

학습 예제 중심의 프로젝트이므로 모듈 시스템을 사용하지 않고 클래스패스 기반으로 컴파일/실행하는 것을 권장합니다.

### 컴파일과 실행 예시

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out basic.Basic01_print
```

> Windows PowerShell 환경이라면 `$(...)` 대신 `Get-ChildItem src -Recurse -Filter *.java | % FullName` 형태를 사용할 수 있습니다.

### 코드 구조
- `basic` 패키지: 조건문/반복문/입출력/수학 유틸 등 기초 문법 예제가 각 `public class` 로 구성되어 있으며 대부분 `main` 메서드를 통해 바로 실행할 수 있습니다.

