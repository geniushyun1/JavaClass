package java1128.ex12_7;

public class mainthrows {
    public static void main(String[] args) throws MyAgeException {
        ThrowsExample tt=new ThrowsExample();

        try {
            tt.test1();
        }
        catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    }

