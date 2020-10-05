## Capturing lambda

- lambda expression 에서 외부 지역변수를 참조하는 행위를 capturing lambda 라고 표현함.
- 이때, 외부 지역변수는 final 또는 effectively final 이어야 함.

#### 지역변수가 final 또는 effectively final 이어야 하는 이유

- 지역변수는 JVM stack 영역에 저장된다.  
lambda expression 이 thread 에서 실행된다면 변수를 할당한 thread 가 사라져서 변수 할당이 해제되었는데도 
lambda expression 을 실행하는 thread 에서는 해당 변수에 접근하려 할 수 있다. 따라서 java 구현에서는 원래 변수에 접근을 허용하는 것이 아니라  
지역 변수의 복사본을 제공한다. 따라서 복사본의 값이 바뀌지 않아야 하므로 지역 변수는 final 또는 effectively final 이어야 한다는 제약이 생긴 것이다.