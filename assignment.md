#### 과제
### 3주차 (9/6 ~ 9/12)
- 요약 마크다운 정리
- gibhub 재정리
- github cli 올리기
- github 명령어 정리
- 금주 복습 git에 올리기
- java
  - 람다식
- 토비의 스프링
  - 1.3 DAO 확장 ~ 1.5 스프링의 IoC
```java
public class Comparer {

    // elements 배열 안에서 element 보다 큰 요소의 개수를 구하시오. (generic 활용 + @)
    public static int compare(Object[] elements, Object element) {
        return 0;
    }

    public static void main(String[] args) {
        String[] stringElements = {"a", "b", "c", "d"};
        Long[] longElements = {1L, 2L, 3L, 4L, 5L};
        
        compare(stringElements, "c"); // 예상 결과: 1 
        compare(longElements, 2L); // 예상 결과: 3 
    }
}
```
  - https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html 타입 추론 공부
  
  - 토비 commit history 만들기
