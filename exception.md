## exception
예외 처리
1.예외와 예외 클래스
자바에서 에러 이외에 예외라고 하는 오류가 있다. 예외란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로인해 발생하는 프로그램 오류를 말한다.
예외 처리를 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다.
예외는 두가지 종류가 있다. 하나는 일반예외이고, 다른 하나는 실행예외이다.
일반예외는 컴파일러 체크 예러라고도 하는데, 자바소스를 컴파일하는 과정에서 예외 처리 코드가 필요한지 검사한다.
실행 예외는 컴파일하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말한다.
모든 예외 클래스들은 다음과 같이 java.lant.Exception클래스 상속한다.
일반예외와와 실행예외 클래스를 구별하는 방법은 일반예외는 Exception을 상속받지만 RuntimeException을 상속받지 않는 클래스들, 실행 예외는 다음과 같이 RuntimeException을 상속받는 클래스이다.
2.실행예외
2.1 NullPointException
이것은 객체 참조가 없는 상태, 즉 null값을 갖는 참조 변수로 객체 접근연산자 도트(.)를 사용했을 때 발상한다. 객체가 없는 상태에서 객체를 사용하려며 했으나 예외가 발생하는 것이다.
Public class NullPointerExceptionExample{
	Public static void main(String[] args){
		String data = null;
		System.out.println(data.toString());
	}
}
2.2 ArrayIndexOutOfBoundException
배열에서 인덱스 범위를 초과하여 사용할 경유 실행 예외 java,lang.ArrayIndexOutOfBoundException이 발생한다.
Public class ArrayIndexOutOfBoundExample{
	Public static void main(String[] args){
		String data1 = args[0];
String data2 = args[2;
	System.out.println(“args [0] :”+data1);
System.out.println(“args [1] :”+data2);
	}
}
2.3 NumberFormatException
프로그램을 개발하다 보면 문자열로 되어 있는 데이터를 숫자로 변경하는 경우가 자주 발생한다.  문자열을 숫자로 변환하는 방법은 여러 가지가 있지만 가장 많이 사용되는 코드는 다음과 같다.
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //NumberFormatException발생
		
		int result  = value1+ value2;
		System.out.println(data1+"+"+data2+"="+result);
	}
}
2.4 ClassCastException
타입변환은 상위 클래스와 하위 클래스 간에 발생하고 구현클래스와 인터페이스 간에도 발생한다. 이러한 관계가 아니라면 클래스는 다른 클래스로 타입 변환할 수 없다.
Animal animal = new Dog();		RemoteControl rc = new Television();
Dog dog = (dog)animal;			Television tv = (Television) rc;
객체가 아닌 다른 클래스 타입 변화
Animal animal = new Dog();		RemoteControl rc = new Television();
Cat cat = (Cat)animal;			Audio audio = (Audio) rc;
ClassCastException을 발생시키기 않으려면 타입 변화 전에 타입 변환이 가능한지 instanceof 연산자로 확인하는 것이 좋다.
Animal animal = new Dog();		RemoteControl rc = new Television();
If(animal instanceof Dog){		If(rc instanceof Television){
	Dog dog = (dog)animal;			Television tv = (Television) rc;
}else if(animal instanceof Cat){		}else if(rc instanceof Audio){
	Cat cat = (Cat)animal;			Audio audio = (Audio) rc;
}					}
		

3.예외 처리 코드 
프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도로 처리하는 코드를 예외 처리 코드라고 한다.
실해 예외는 컴파일러가 체크해주지 않기 때문에 예외 처리코들 개발자의 경험을 바탕으로 작성해야 한다.
예외 처리 코드는 try-catch-finally 블록을 이용한다.
4.예외 종류에 따른 처리 코드 
4.1 다중 catch
try 블록 내부는 다양한 종류의 예외가 발생할 수 있다. 이 경우 발생되는 예외별로 예외 처리 코드를 다르게 하려면 어떻게 하면 될까? 이것에 대한 해답은 다중 catch 블록을 작성하는 것이다.
try{
	ArrayIndexOtOfBoundsException 발생
	NumberFormatException발생
}catch(ArrayIndexOtOfBoundsException e){
	`예외 처리1
} catch(NumberFormatException e){
	예외 처리2
}
4.2 catch 순서
다중 catch 블록을 작성할 때 주의할 점은 상위 예외 클래스가 하위 예외클래스 보다 아래쪽에 위치 해야 한다. 만약 상위 예외 클래스의 catch블록이 위에 있다면, 하위 클래스의 catch 블록은 실해되지 않는다. 왜냐하면 하위 예외는 사의 예외를 상속하기 때문에 상위 예외 타입도 되기 때문이다.
try{
	ArrayIndexOtOfBoundsException 발생
	NumberFormatException발생
}catch(Exception e){
	`예외 처리1
} catch(NumberFormatException e){  //실행되지 않는다
	예외 처리2
}
5.자동 리소스 닫기 
자바 7부터 하나의 catch 블록에서 여러 개의 예외를 처리할 수 있도록 멀티catch 기능을 추가 했다. 다음은 멀티 catch블록을 작성하는 방법을 보여준다. Catch 괄호() 안에 동일하게 처리하고 싶은 예외를 |로 연결하면 된다.
try{
	ArrayIndexOtOfBoundsException 발생
	NumberFormatException발생
}catch(ArrayIndexOtOfBoundsException | NumberFormatException ㄷ){
	`예외 처리1
} catch(Exception e){  
	예외 처리2
}
4.2 자동 리소스 닫기
자바7에서 새로 추가된 try-catch-resources를 사용하면 예외 발생 여부와 상관없이 사용했던 리소스객체의 close() 메소드를 호출해서 안전하게 닫아준다.
try(FileInputStream fis = new FileInputStream(“file.txt”)){
	…	
}catch{
	…
}
복수 개의 리소스를 사용할수 있다.
try(
FileInputStream fis = new FileInputStream(“file1.txt”)
	FileOutputStream fos= new FileOutputStream(“file2.txt”)
){
	…	
} catch {
	…
}
6.예외 떠넘기기
 메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만, 경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다. 이때 사용할 수 있는 키워드가 throws이다.  메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.
public void method(){
	try{
		method2();	
}catch(ClassNotFoundException e){
	//예외처리 코드
	System.out.println(“클래스가 존재하지 않습니다.”);
}
}
public void Method2() throws ClassNotFoundException{
	Class clazz = class.forName(“java.lang.String2”);
}
Method1()을 호출하는 곳에서 결국 try-catch블록을 사용해서 예외를 처리해야 한다.
	
7.사용자 정의 예외와 예외 발생
프로그램을 개발하다 보면 자바 표준 API에서 제공하는 예외 클래스만으로는 다양한 종류의 예외를 표현할 수가 없다. 
예외를 애플리케이션 예외라고 한다 애플리케이션 예외는 개발자가 직접 정의해서 만들어야 하므로 사용자 정의 예외라고도 한다.
7.1 사용자 정의 예외 클래스 선언
사용자 정의 예외 클래스는 컴파일러가 일반예외로 선언할 수도 있고, 컴파일러가 체크하지 않는 실행 예외로 선언할 수도 있다. 일반 예외로 선언할 경우 Exception을 상속하면 되고, 실행 예외로 선언할 경우에는  RuntimeException을 상속하면 된다.
public class xxxException Extends [Exception | RunTimeException]{
	public xxxException(){}
	public xxxException(String message){super(message);}
}
7.2 예외 발생 시키기
Catch 블록에서 예외 메시지가 필요하다면 예외 메시지를 갖는 생성자를 이용해야 한다. 예외발생 코드를 가지고 있는 메소드는 내부에서 try-catch블록으로 예외를 처리할 수 있지만, 대부분은 자신을 호출한 곳에서 예외를 처리하도록 throws키워드로 예외를 떠넘긴다.
public void method() throws XXXexception{
	thow new XXXException(“메세지”);
} 
8.예외 정보 얻기
모든 예외 객체는 Exception 클래스를 상속하기 때문에 Exception이 가지고 있는 메소드들을 모든 예외 객체에서 호출할 수 있다. 그중에서도 가장 많이 사용되는 메소드는 getMessage()와 printStackTrace()이다
}catch(Exception e){
	String message = e.getMessage();
}
예외코드가 예외 메시지로 getMessage() 메소드의 리턴값으로 없을 수 있다.
try{
	예외객체 생성
}catch(예외 클래스 e){
	//예외가 가지고 있는 Message 얻기
	String message = e.getMeaage();
	//예외의 발생 결로를 추척
	e.printStackTrace();
}
printStackTrace()는 메소드 이름에서도 알 수 있듯이 예외 발생 코드를 추적해서 모두 콘솔에 출력한다.
