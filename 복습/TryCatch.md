예외 처리   
예외는 RuntimeException랑 RuntimeException 아닌 예외로 나뉜다  
일반 예외(Exception): 컴파일 과정에서 예외 처리 코드가 필요하다.  
EX) ClassNotFoundException 예외처리를 필히 해야 한다.   
실행 예외(RuntiimeException): 컴파일 과정에서 예외 처리 코드가 필요하지 않다.  
EX) NullpointException 예외처리가 선택 사항이다.  
일반 예외, 실행 예외 차이점은 TyrCatch의 강제성이다.  

자동 리소스 닫기   
Try-with-resources를 사용하기 위해서는 조건이 있는데 AutonCloseable인터페이스 구현하고 있어야 한다.  
