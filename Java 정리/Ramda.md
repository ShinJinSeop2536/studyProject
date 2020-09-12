람다식   
1.	람다식이라?  
람다식은 익명 함수를 생성한다.   
객체지향 언어보다 함수지향 언어에 가깝다.  
장점  
1.	코드가 간결해 진다.  
2.	컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게  집계 할 수 있다.  
람다식 -> 매개 변수를 가진 코드 블록 -> 익명 구현 객체  
2.	람다식의 기본 문법  
(타입 매개 변수,…..) -> {실행문}  
베이직 람다식 문법  
(int a)->{System.out.println(a);}  
매개 변수 타입은 런타임 시 대입되는 값에 따라 자동 인식, 일반적으로 언급하지 않는다  
(a)->{System.out.println(a);}  
하나의 매개 변수만 있다면 () 생략 가능, 하나의 실행문만 있다면 {} 생략 가능  
a->{System.out.println(a);}  
3.	타겟 타입과 함수적 인터페이스  
람다식은 자바의 메소드를 선언하는 것이 아니다.  
람다식은 단순히 메소들을 선언하는 것이 아니라 이 메소드를 가지고 있는 객체를 생성해 내는 거다.  
인터페이스 변수 = 람다식  
람다식은 인터페이스의 익명 구현 객체를 생성한다.  
람다식에 대입될 인터페이스를 람다식의 타겟 타입이라고 한다.  
람다식은 하나의 메소드를 정의 하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.  
람다식의 타겟 타입이 되는 인터페이스는 함수적 인터페이스라고 한다.  
함수적 인터페이스를 컴파일러가 체킹해주는 기능, 인터페이스 선언 시  
@FunctionalInterface 어노테이션을 붙히면 된다.  
4.	클래스 멤버와 로컬 변수  
람다식은 클래스의 멤버 변수는 제약 없이 사용 가능하지만, 로컬변수 는 제약 사항이 따른다.  
1.	클래스의 멤버 변수  
람다식은 실행 블록에서 클래스의 멤버인 필드와 메소드를 제약 사항없이 사용하수 있다.  
하지만 this 키워드를 사용할 때는 주의 필요  
this = 내부적으로 생성되는 익명 객체의 참조  
람다식의 this = 람다식을 실행한 객체의 참조이다  
2.	로컬 변수 사용  
람다식은 메소드 내부에서 주로 작성되기 때문에 로컬  익명 구현 객체를 생성시킨다고 봐야 한다.  
메소드의 매게 변수 또는 로컬 변수를 사용하면 이 두 변수를 사용하면 final 특성을 가진다.  
컴파일 시 final 키워드가 있다면 메소드 내부에 지역 변수로 복사되지만, final 키워드가 없다면 익명 클래스의 필드로 복사된다.  
5. 표준 API 함수적 인터페이스  
자바에서 제공되는 표준 API를 람다식으로 표현 가능하다.  
함수적 인터페이스 표준 API 제공된다.  
패키지의 함수적 인터 페이스는 크게 Consumer, Sapplier, Function, Operator, Predicate로 구분된다.  
Consumer:	-매개값이 있고, 리턴값이 없음  
Sapplier:    	-매개값이 없고, 리턴값은 있음  
Function:   	-매개값이 있고, 리턴값도 있음   
-주고 매게값을 리턴값으로  
Operator, 	-매개값이 있고, 리턴값도 있음  
		-주로 매개값을 연산하고 결과를 리턴  
Predicate:	-매개값이 있고, 리턴 타입은 Boolean  
		-매개값을 조사해서 true/false를 리턴  
1. Consumer 함수적 인터페이스   
Consumer 함수적 인터페이스의 특징은 린턴값이 없는 accept 매소드르 가지고 있다 사용만 할 뿐 리턴값이 없다.  
2. Supplier   
Supplier는 매개변수가 없고 리턴값이 있는 getXXX() 메소드를 갖는다.  
3 Function  
Function 함수는 매개값을 가지고 리턴값이 있는 applyXXX() 메소드를 가진다. 이 매소드들은 매매값을 리턴 값으로 매핑해준다.  
Function<Student, String> function = t->{return t.getName();}  
Function<Student, String> function = t-> t.getName();  
4 Operator   
Function 동일하다.  단지 연산을 수행한 후 동일한 타입으로 리턴값을 제공한다.  
IntBinaryOperator opterator = (a, b) -> {….; return int값;}  
5 Predicate  
Predicate함수적 인터페이스는 매개 변수와 Boolean 리턴값이 있는 testXXX() 메소드를 가지고 있다.   
매개랎을  true, false 리턴하다.  
Predicate<Strudent> predicate = t->{return t.getSex().equals(“남자”);}  
Predicate<Strudent> predicate = t-> t.getSex().equals(“남자”);  
7. andThen() 과 compase() 디폴트 메소드  
andThen과 compase 디폴트 메소드는 두 개의 함수적 인터페이스를 순차적을 연결, 다른점은 먼저 처리하느냐이다.  
8. and(), or, negate  
And==&&  
Or==||  
Engetate == !  
8.minBy, maxBy  
Comparator를 이용해서 최대 T와 최소 T를 얻는 BinaryOperator<T>를 리턴한다.  

