## basic 패키지 API 문서

`src/basic` 디렉토리에는 학습용 `public class` 들이 존재하며, 각 클래스는 `main(String[] args)` 를 통해 개별 실행 예제를 제공합니다. 아래 표는 주요 클래스와 목적을 요약합니다.

| 클래스 | 목적/설명 | 실행 예시 |
|---|---|---|
| `basic.Basic01_print` | 콘솔 출력과 `main` 구조 설명 | `java -cp out basic.Basic01_print` |
| `basic.Basic02_print` | 출력과 `public`, `class` 개념 주석 | `java -cp out basic.Basic02_print` |
| `basic.Basic03_print` | 변수와 콘솔 출력 기초 | `java -cp out basic.Basic03_print` |
| `basic.Basic04_print` | 성적표 포맷 예시 출력 | `java -cp out basic.Basic04_print` |
| `basic.Basic05_printf` | `printf` 서식 출력 예시 | `java -cp out basic.Basic05_printf` |
| `basic.Basic06_DataType` | 기본 자료형 설명 | `java -cp out basic.Basic06_DataType` |
| `basic.Basic07_DaTaType` | 자료형 추가 예시 | `java -cp out basic.Basic07_DaTaType` |
| `basic.Basic08_count` | 누적형 변수 카운팅 | `java -cp out basic.Basic08_count` |
| `basic.Basic09_scanner` | `Scanner` 입력 기초 | `java -cp out basic.Basic09_scanner` |
| `basic.Basic10_Score` | 점수 계산/출력 예시 | `java -cp out basic.Basic10_Score` |
| `basic.Basic10_Score2` | 점수 계산 확장 | `java -cp out basic.Basic10_Score2` |
| `basic.Basic11_expression` | 연산식 개념 | `java -cp out basic.Basic11_expression` |
| `basic.Basic12_expression` | 나누기/나머지 응용 | `java -cp out basic.Basic12_expression` |
| `basic.Basic13_realation` | 관계/비교 연산 | `java -cp out basic.Basic13_realation` |
| `basic.Basic14_relation` | 관계 연산과 범위 판단 | `java -cp out basic.Basic14_relation` |
| `basic.Basic15_relation` | 관계 연산 (변형) | `java -cp out basic.Basic15_relation` |
| `basic.Basic16_bit_operation` | 비트 연산 | `java -cp out basic.Basic16_bit_operation` |
| `basic.Basic17_condition` | 조건문 기초 | `java -cp out basic.Basic17_condition` |
| `basic.Basic18_condition` | 최댓값 찾기 | `java -cp out basic.Basic18_condition` |
| `basic.Basic19_conditon` | 총점/평균/합격 여부 | `java -cp out basic.Basic19_conditon` |
| `basic.Basic20_subOperation` | 대입/복합 대입 연산 | `java -cp out basic.Basic20_subOperation` |
| `basic.Basic21_condition` | 조건문 심화 | `java -cp out basic.Basic21_condition` |
| `basic.Basic22_if` | if 기초 | `java -cp out basic.Basic22_if` |
| `basic.Basic23_if` | 성적표 계산/학점/합격 판단 | `java -cp out basic.Basic23_if` |
| `basic.Basic24_if` | if/정렬 출력 | `java -cp out basic.Basic24_if` |
| `basic.Basic26_maxmidmin` | 최댓값/중간값/최솟값 | `java -cp out basic.Basic26_maxmidmin` |
| `basic.Basic27_ifif` | 중첩 if | `java -cp out basic.Basic27_ifif` |
| `basic.Basic28_switch` | switch-case 기초 | `java -cp out basic.Basic28_switch` |
| `basic.Basic29_switch` | 입력 수에 대한 switch | `java -cp out basic.Basic29_switch` |
| `basic.Basic30_for` | 가위바위보 반복 | `java -cp out basic.Basic30_for` |
| `basic.Basic30_switch` | switch 성적표 예시 | `java -cp out basic.Basic30_switch` |
| `basic.Basic31_swap` | 값 교환(swap) | `java -cp out basic.Basic31_swap` |
| `basic.Basic32_while` | while 반복 | `java -cp out basic.Basic32_while` |
| `basic.Basic33_for` | for 반복 | `java -cp out basic.Basic33_for` |
| `basic.Basic34_for` | for 반복 (변형) | `java -cp out basic.Basic34_for` |
| `basic.Basic35_for` | for 누적 예제 | `java -cp out basic.Basic35_for` |
| `basic.Basic36_for` | 부호 번갈아 합계 | `java -cp out basic.Basic36_for` |
| `basic.Basic37_random` | `Math.random()` 예제 | `java -cp out basic.Basic37_random` |
| `basic.Basic39_for` | for 응용 | `java -cp out basic.Basic39_for` |
| `basic.Practice` | 입력/학점/합격 스케치 | `java -cp out basic.Practice` |
| `basic.Practice3` | 실습 문제 스케치 | `java -cp out basic.Practice3` |

> 표에 열거된 클래스는 저장소 파일 명세를 기반으로 하며, 일부는 미구현 또는 주석 중심일 수 있습니다.

---

### 사용 예제: 성적표 계산 (`basic.Basic23_if`)

목적: 학번/이름/과목 점수를 입력받아 총점, 평균, 학점, 합격여부를 출력합니다.

입력 형식 예: `1 홍길동 90 90 90`

```25:63:/workspace/src/basic/Basic23_if.java
Scanner sc = new Scanner(System.in);
System.out.print("데이터 입력(번호 이름 국어 영어 수학) : ");

int bno = sc.nextInt();
String name = sc.next();
int korScore = sc.nextInt();
int engScore = sc.nextInt();
int matScore = sc.nextInt();
int totScore = korScore + engScore + matScore;
float avgScore = totScore / 3f;
String grade = "F";
String passedResult = (avgScore >= 80) ? "합격" : "불합격";

if (avgScore >= 90) {
    grade = "A";
} else if (avgScore >= 80) {
    grade = "B";
} else if (avgScore >= 70) {
    grade = "C";
} else if (avgScore >= 60) {
    grade = "D";
}

System.out.println("\t\t\t성적표");
System.out.println("-----------------------------------------------------------------------");
System.out.println("번호\t" + "이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "합격여부\t");
System.out.println("-----------------------------------------------------------------------");
System.out.println(bno + "\t" + name + "\t" + korScore + "\t" + engScore + "\t" + matScore + "\t" + totScore
        + "\t" + avgScore + "\t" + grade + "\t" + passedResult + "\t");
```

실행:
```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out basic.Basic23_if
```

샘플 입력/출력:
```text
데이터 입력(번호 이름 국어 영어 수학) : 1 홍길동 90 90 90

			성적표
-----------------------------------------------------------------------
번호	이름	국어	영어	수학	총점	평균	학점	합격여부	
-----------------------------------------------------------------------
1	홍길동	90	90	90	270	90.0	A	합격	
```

---

### 사용 예제: 무작위 숫자 (`basic.Basic37_random`)

목적: `Math.random()` 사용법과 간단한 난수 생성 패턴을 보여줍니다.

```16:26:/workspace/src/basic/Basic37_random.java
System.out.println(Math.random()); // 0.0 <= M < 1.0
System.out.println(Math.random() * 10); // 0.0 <= M < 10
System.out.println((int) (Math.random() * 10) + 1); // 1 <= M < 11
System.out.println((int) (Math.random() * 6) + 1); // 1 <= M <= 6
System.out.println((int) (Math.random() * 45) + 1); // 1 <= M <= 45

for (int i = 1; i <= 6; i++) {
    System.out.print((int) (Math.random() * 9) + 1);
    System.out.print(" ");
}
System.out.println();
```

실행:
```bash
java -cp out basic.Basic37_random
```

출력 예(가변):
```text
0.731...
7.12...
6
2
41
9 3 1 4 8 5 
```

---

### 클래스별 간단 요약

- `Basic01_print`: `main` 구조와 출력 방법을 간단 소개.
- `Basic23_if`: 성적표 계산 로직 구현. 입력→계산→출력 순서 제시.
- `Practice`: 학점 스케치. 일부 분기/스위치 미완.

필요 시 각 클래스의 `main` 로직을 참고하여 실습 과제를 확장할 수 있습니다.

