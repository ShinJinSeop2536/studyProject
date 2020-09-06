### 자바
[과제](./assignment.md)  
[제네릭](./generic.md)  
[예외](./exception.md)  
### 토비의 스프링  
[오브젝트와 의존관계](./dependency.md)  


# studyProject
왜 제네릭을 사용해야 하는가 
-제네릭을 타입을 이용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 된다. 제네릭은 클래스와 인터페이스 그리고 메소드를 정의할 떄 type을 parameter로 사용할 수 있도록 한다. 
타입 파라미터는 코드 작성 시 구체적인 타입으로 대체되어 다양한 코드를 생성하도록 해준다.
이점 
1.	컴파일 시 강한 타입 체크를 할 수 있다
-실행 시 타입 에러가 나는 것보다는 컴파일 시에 미리 타입을 강하게 체크해서 에러를 사전에 방지하는 것이 좋다.
   2.	타입 변화을 제거한다
	- 비제네릭 코드느 불필요한 타입 변환을 하기 때문에 프로그램 성능에 악영향을 미친다.
	List list  =  new ArarryList();
	List.add(“hello”);
	String str = (String)list.get(0); //타입 변환을 해야 한다

	List <String>list  =  new ArarryList<String>();
	List.add(“hello”);
	String str = list.get(0); //타입 변환을 하지 않는다.

제네릭 타입(class<T>, interface<T>)
- 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인테페이스를 말한다. 제네릭 타입은 클래스 또는 인터페이스 이름 뒤에 “<>” 	부호거 붙고, 사이에 타입 파라미터가 위치한다.
	public class 클래스명 <T>{ …}
	public interface 인터페이스명<T>{ … }
타입은 일반적으로 대문자 알파벳 한 글자로 표현한다. 제네릭 타입을 실제 코드에서 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 한다.

public class Box<T>{…..}
Box<String> box = new Box<String>(); => public class Box<String>{…..}
Box<Integer> box = new Box< Integer >(); => public class Box< Integer >{…..}
타입 파라미터 T를 사용했다. T는 Box 클래스로 객체를 생성할떄 구체적인 타입으로 변경된다.
제네릭은 클래스를 설계할 떄 구체적인 타입을 명시하지 않고, 타입 파라미터로 대체했다가 실제 클래스가 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화시킨다.

멀티 타입 파라미터(class<K,V,…>, interface< K,V,…>
제네릭 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있는데, 이 경우 각 타입 파라미터를 콤마로 구분한다.
제네릭 타입 변수 선언과 객체 생성을 동시에 할 때 타입 파라미터 자리에 구체적인 타입을 지정하는 코드가 종복해서 나와 다소 복잡해질 수 있다. 자바 7부터 제네릭 타입 파라미터의 중복 기술을 줄이기 위해 다이아몬드 연산자<>를 제공한다.
Product<TV, String >product = new Product <TV, String>();
Product<TV, String >product = new Product <>(); 

제네릭 메소드(<T, R> R method(T t))
제네릭 메소드 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드를 말하다.
제네릭 메소드를 선언하는 방법은 리턴 타입 알에<> 기호를 추가하고 타입 파라미터를 기술한 다음, 리턴 타입과 매개 타입으로 타입 파라미터를 사용하면 된다.
public <타입파라미터, ….> 리턴타입 메소드명 (매개변수,…..) {….}
public <T> Box<T> boxing(T t) {…..}
제네릭 메소드는 두 가지 방식으로 호출할 수 있다. 
1.리턴 타입 변수 = <구체적인> 메소드명(매개값)	//명시적으로 구체적으로 타입을 지정
Box<Integer>Box =<Integer>boxing(100);
2.리턴 타입 변수 = 메소드명(매개값)		//매개값을 보고 구체적으로 타입을 추정
Box<Integer>Box =boxing(100);
제한되 타입 파라미터(<T extends 최상위 타입>)
타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다. 예를 들어 숫자를 연산하는 제네릭 매소드는 매개값 Number 탑입 또는 하위 클래스 타입의 인스턴스만 가져야 한다.
Public <T extends 상위타입> 리턴타입 매소드(매개변수,……..){….}

와일드카드 타입(<?>,<? extends ….>,<? super ….>)
코드에서 ?를 일반적으로 와일드카드라고 부른다. 제네릭 타입을 매개값이나 리턴 타입으로 사용할 떄 구체적인 타입 대신에 와일드카드를 다음과 같이 세 가지 형태로 사용할 수 있다.
제네릭타입<?>: 타입 파라미터를 대처하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
제네릭타입<? etends 상위타입>: 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입이나 하위 타입만 올 수 있다.
제네릭타입<? super 하위타입> : 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
