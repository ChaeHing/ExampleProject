// 부모클래스
package football;

import java.security.spec.RSAOtherPrimeInfo;

public class FootballPlayer {
    protected String name;
    private Physical physical; // 포함
    private String main_foot;

    private String skill;

    //생성자
    public FootballPlayer(String name, Physical physical, String main_foot){
        this.name = name;
        this.physical = physical;
        this.main_foot = main_foot;
    }


    public void pass(){
        System.out.printf("패스합니다.\n");
    }

    public void setSkill(String skill){ // setter 메서드
                                        // skill은 private이므로 다른 클래스에서 접근불가
                                       // setter 메서드를 통해 skill 설정
        this.skill = skill;
    }

    public void getPlayerinfo(){ // getter 메서드
                                 // 다른클래스에서 접근 못하는 정보들을 getter 메서드로 확인
        System.out.println("============================");
        System.out.println("선수의 정보");
        System.out.printf("이름 : %s\n",name);
        System.out.printf("나이 : %d\n",physical.height);
        System.out.printf("키 : %d\n",physical.height);
        System.out.printf("몸메게 : %d\n",physical.age);
        System.out.printf("주발 : %s\n",main_foot);
        System.out.printf("스킬 : %s\n",skill);
        System.out.println("============================");

    }

    public void getAction(){ // getter 메서드
                             // private인 메서드에 접근 가능
        drible();
        shoot();
    }
    private void shoot(){
        System.out.printf("%s의 멋진 슛!!!\n", name);
    }


    private void drible(){
        System.out.printf("%s 선수가 드리블을 합니다!\n", name);
    }
}
