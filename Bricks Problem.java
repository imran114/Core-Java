package SaboorSirTasks;public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        String givenString = "1-2,2-3,3-7,3-3,3-7,7-3,3-9";
        String hyphenRemoved[] = givenString.split(",");

        for (int i=0;i< hyphenRemoved.length;i++){
         if(i < hyphenRemoved.length-1) {
                 String commaSeperatedString_1 = hyphenRemoved[i];

             System.out.println("------start-commaSeperatedString_1------------------");
             System.out.println("commaSeperatedString_1: "+commaSeperatedString_1);
             String[] dashsplitArray_1 = commaSeperatedString_1.split("-");

             System.out.println("i is dashSeperatedRight= "+dashsplitArray_1[1]);
             System.out.println("------end-commaSeperatedString_1------------------");

             System.out.println("------start-commaSeperatedString_2------------------");
             String commaSeperatedString_2 = hyphenRemoved[i + 1];
             System.out.println("commaSeperatedString_2: "+commaSeperatedString_2);
             String[] dashsplitArray_2 = commaSeperatedString_2.split("-");
             System.out.println("i+1 is dashSeperatedLeft="+ dashsplitArray_2[0]);
             System.out.println("------END-commaSeperatedString_2------------------");

             if (dashsplitArray_1[1].equalsIgnoreCase(dashsplitArray_2[0]) ){

                 count=count+1;
             }
          }
        }
        System.out.println("count-"+count);
        }
    }

