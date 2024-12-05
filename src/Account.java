package ch0926;

public class Account {
    private String num;
    private int money;

    public void transfer(String num,int money){ //송금 함수
        for(int i=0;i<3;i++){
            money -=3000;
        }

        System.out.printf("Account { num:%s, balance:%d}\n", num, money);
    }
    public void GetMoney(String num,int money){ //받는 함수
        for(int i=0;i<3;i++){
            money += 3000;
        }
        System.out.printf("Account { num:%s, balance:%d}", num, money);
    }
}
