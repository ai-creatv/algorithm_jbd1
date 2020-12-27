# 입력과 출력

- 입출력 방식은 플랫폼 별로 다를 수 있으며, 각 플랫폼에서 제시하는 방식을 이용하면 된다.
- 대표적인 입출력 예
  - 백준 온라인저지(input, print)

  <https://www.acmicpc.net/help/language>

  ![자바_파일입출력](./img/1.png)

  ```java
  import java.util.*;
  public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a, b;
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println(a + b);
    }
  }
  ```

  ------------------------------------------------------------

  - Programmers(함수 입출력)

  ![자바_함수입출력](./img/2.png)
  
  ```javascript
  class Solution {
      public int[] solution(int[] numbers) {
          int[] answer = {};
          return answer;
      }
  }
  ```
