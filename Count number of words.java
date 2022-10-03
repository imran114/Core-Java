package SaboorSirTasks;


public class Task5 {
    public static String findingMatchingWords(String str)
    {
        int count =0;
        String Result = "";
        String strArray[] = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    count++;
                    strArray[j] = "0";

                }
            }
            if (count> 1 && strArray[i] != "0"){
                Result = strArray[i];
                System.out.println(Result+"----"+count);
            }
        }
        return Result;
    }
    public static void main(String[] args) {

        findingMatchingWords("");


    }
}


