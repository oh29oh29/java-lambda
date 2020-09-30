## Functional interface

- abstract method 가 오직 하나인 interface.
- lambda expression 으로 functional interface 의 abstract method 구현을 직접 전달할 수 있으므로 전체 표현식을 functional interface 의 instance 로 취급할 수 있음.

#### function descriptor

- functional interface 의 abstract method signature 는 lambda expression 의 signature 를 가리킴.
- lambda expression 의 signature 를 서술하는 method 를 function descriptor 라고 부름.
- 즉, functional interface 의 abstract method signature 를 function descriptor 라고 부름.

#### @FunctionalInterface

- functional interface 임을 가리키는 annotation.
- 해당 annotation 을 선언했지만 실제로 functional interface 가 아니라면 compiler 가 error 를 발생시킴. 
