public class Main {

    public static void main(String[] args) {

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