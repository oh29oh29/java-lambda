## Functional interface

> abstract method 가 오직 하나인 interface.  
> lambda expression 으로 functional interface 의 abstract method 구현을 직접 전달할 수 있으므로 전체 표현식을 functional interface 의 instance 로 취급할 수 있음.


#### function descriptor

- functional interface 의 abstract method signature 는 lambda expression 의 signature 를 가리킴.
- lambda expression 의 signature 를 서술하는 method 를 function descriptor 라고 부름.
- 즉, functional interface 의 abstract method signature 를 function descriptor 라고 부름.


#### @FunctionalInterface

- functional interface 임을 가리키는 annotation.
- 해당 annotation 을 선언했지만 실제로 functional interface 가 아니라면 compiler 가 error 를 발생시킴. 


#### 기본형 특화

- Java 에서는 기본형을 참조형으로 변화하는 기능을 boxing 이라고 하고, 참조형을 기본형으로 변환하는 반대 동작을 unboxking 이라고 함.
- boxing 과 unboxing 이 자동으로 이루어지는 기능을 autoboxing 이라고 함.
- 이러한 변환 과정은 비용이 소모되며 boxing 한 값은 기본형을 감싸는 wrapper 이며 heap 에 저장됨.
- 따라서 boxing 한 값은 memory 를 더 소비하며 기본형을 가져올 때도 memory 를 탐색하는 과정이 필요함.
- Java 8 에서는 기본형을 입출력으로 사용하는 상황에서 autoboxing 동작을 피할 수 있도록 특별한 버전의 functional interface 를 제공함.