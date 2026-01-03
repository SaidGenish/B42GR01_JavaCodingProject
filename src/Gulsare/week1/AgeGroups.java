package Gulsare.week1;

    public class AgeGroups {
        public static void main(String[] args) {
            int age = 2;
            String result;
            if (age > 0 && age <= 150) {
                if (age >= 1 && age <= 2) {
                    result = "infant";
                }else if (age >= 3 && age <= 10) {
                    result = "young";

                } else {
                    result = age + "is not a valid age";


                } System.out.println(result);
            }
        }}


