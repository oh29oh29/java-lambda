## Capturing lambda

- lambda expression 에서 외부 지역변수를 참조하는 행위를 capturing lambda 라고 표현함.
- 이때, 외부 지역변수는 final 또는 effectively final 이어야 함.

#### 지역변수가 final 또는 effectively final 이어야 하는 이유

- 지역변수는 JVM stack 영역에 저장된다.  
특정 'A' thread 가 lambda expression 이 포함된 method 를 호출하면 해당 thread 의 stack 영역에 지역변수를 저장한다.  
이때, method 내부에 있는 lambda expression 이 'B' thread 에서 수행되는 경우라면, 
'B' thread 가 종료되기 전에 'A' thread 가 종료될 수 있고, 
이렇게 된다면 'B' thread 에서 'A' thread 에 의해 저장된 지역변수에 대한 값을 신뢰할 수 없게 되기 때문에 변경 불가능함을 보장하는 final 또는 effectively final 이어야 한다. 
