package org.example.spring.Chapter3.chpter1;

public class UserDaoTest {
    public static void main(String[] args) {
        //UserDao가 ConnectionMaker 구현 클래스를 결정하고 오브젝트를 만든다.
        ConnectionMaker connectionMaker = new DConnectionMaker();
        //1.UserDao 생성
        // 사용할 ConnectionMaker 타입의 오브텍트 제공
        // 결국 두 오브젝트 사이의 의존관계 설정 효과
        UserDao dao = new UserDao(connectionMaker);

    }
}
