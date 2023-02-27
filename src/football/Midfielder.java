// FootballPlayer의 자식 클래스
package football;

public class Midfielder extends FootballPlayer{
    String position;

    public Midfielder(String name, Physical physical, String main_foot) {
        super(name, physical, main_foot); // 부모클래스(FootballPlayer)의 생성자를 super()로 접근
        position = "midfielder";
    }

    public void pass(){ // 오버라이딩
        System.out.printf("%s 선수 공격수에게 멋진 쓰루패스를 합니다!!\n", super.name);
        // 부모클래스(FootballPlayer)의 멤버를 super로 접근
    }



}
