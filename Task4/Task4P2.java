package Rehan.ConstructorTask.Task4;

public class Task4P2 {
    int num1;
    int num2;
    float pointValue;
    Task4P2(int num1, int num2, float pointValue){
        this.num1 = num1;
        this.num2 = num2;
        this.pointValue = pointValue;
        float sum = num1+num2+pointValue;
        Task4P3 t = new Task4P3(sum);
    }


}

