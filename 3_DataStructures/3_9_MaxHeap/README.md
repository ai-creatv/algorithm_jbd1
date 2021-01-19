# Max Heap

## Max Heap이란

- 항상 최대값이 루트 노드에 존재하는 트리 구조
- 자료를 트리에서 제거하거나 추가할 때 이를 위한 추가 동작을 구현
- 배열로 이루어진 완전 이진 트리를 기반으로 함

## Max Heap의 장점

- 일반 배열에서 최대값을 찾아 반환하는 연산: O(N)
- 정렬된 배열에서 최대값을 찾아 반환하는 연산: O(1) (단, 정렬하는 연산 O(NlogN))
  - 배열에 새로운 자료를 추가하는 연산: O(N)
- Max Heap에서 최대값을 찾아 반환하는 연산: O(logN)
  - Max Heap에 최대값을 추가하는 연산: O(logN)

## Max Heap/Min Heap의 정의

- Max Heap: 부모 노드가 항상 자식 노드보다 큰 완전 이진 트리
- Min Heap: 부모 노드가 항상 자식 노드보다 작은 완전 이진 트리

## Heap에 자료 입력하기

1. 배열의 마지막에 새로운 자료를 추가
2. 부모 노드와 비교하여 두 값을 swap해야 하는지 여부 결정
3. Heap의 정의에 부합할 때 까지 2번 동작을 반복 (최대 log2(N)번 반복)

## Heap에서 자료 삭제하기

1. 항상 루트(배열의 첫번째 자료)의 자료를 삭제한다.
2. 배열의 마지막 자료를 첫번째 위치로 옮긴다.
3. 두개의 자식 노드 중 부모의 자리를 대체할 노드를 선택
4. Heap의 정의애 부합할 때 까지 3번 동작을 반복 (최대 log2(N)번 반복)

## Java에 구현된 Heap

- PriorityQueue 기능이 포함되어 있다.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(2);
pq.offer(5);
pq.offer(1);
pq.offer(10);

System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
```

- Max Heap으로 사용하고자 할 경우, Comparator를 구현한다.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a, b) -> Integer.compare(b, a)
);
pq.offer(2);
pq.offer(5);
pq.offer(1);
pq.offer(10);

System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
```

## Heap 자료구조의 구현

- [기반 소스 코드](src/Before.java)
- [솔루션 코드](src/After.java)
