import football.*; // 패키지 추가

public class Main {

    public static void main(String[] args) {
        // 상속, 캡슐화 예제

        // parent 축구선수
        // child 미드필더
        // physical 포함 관계

        // physical 인스턴스 생성
        Physical physical1 = new Physical(181, 76, 31);
        Physical physical2 = new Physical(195, 88, 22);

        // 자식클래스 Midfielder로 인스턴스 생성
        Midfielder player1 = new Midfielder("KDB", physical1, "right");
        FootballPlayer player2 = new FootballPlayer("Haaland", physical2, "left");
        // 부모 클래스 FootballPlayer로 인스턴스 생성


        // setter 메서드를 사용해 FootballPlayer 클래스의 skill 설정 (private)
        player1.setSkill("대지를가르는패스");
        player2.setSkill("파워슛");

        // getter 메서드를 사용해 접근 불가능한 선수 정보들을 출력
        player1.getPlayerinfo();
        player2.getPlayerinfo();

        // 오버라이딩 확인
        player1.pass();
        player2.pass();

        // getter 메서드를 사용해 접근 불가능한 메서드를 사용
        player1.getAction();
        player2.getAction();


    }

}




/* 생성자, 내부클래스 예제
        Iphone myIphone = new Iphone(14, "pro", "gold");
        System.out.println("나의 아이폰은 "+myIphone.number+" "+myIphone.model+" "+myIphone.color+" 입니다.");

        Iphone yourIphone = new Iphone();
        yourIphone.number = 13;
        yourIphone.model = "proMax";
        yourIphone.color = "silver";

        System.out.println("너의 아이폰은 "+yourIphone.number+" "+yourIphone.model+" "+yourIphone.color+" 입니다.");

        Iphone ourIphone = new Iphone(12);

        System.out.println("우리들의 아이폰은 "+ourIphone.number+" "+ourIphone.model+" "+ourIphone.color+" 입니다.");


    }

}
class Iphone{

    int number;
    String model;
    String color;

    Iphone(){
        System.out.println("아이폰 생성중");
    }

    Iphone(int number){
            this(number, "plus", "black");
            System.out.println("모델명과 컬러를 입력하지 않아 기본값을 설정합니다.");
    }

    Iphone(int number, String model, String color){
            this();
            this.model = model;
            this.number = number;
            this.color = color;
    }

}
*/