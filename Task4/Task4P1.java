package Rehan.ConstructorTask.Task4;

public class Task4P1 {
    int num1;
    int num2;
    float pointValue;
    Task4P1(int num1, int num2, float pointValue){
        this.num1 = num1;
        this.num2 = num2;
        this.pointValue = pointValue;
       Task4P2 t = new Task4P2(num1,num2,pointValue);
    }
    Task4P1(float Result){
        System.out.println(Result);
    }

    public static void main(String[] args) {
        Task4P2 t = new Task4P2(1,2,0.5f);
    }
}
