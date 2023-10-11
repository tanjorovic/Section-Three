public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "sunny";

        if(weather.equals("sunny")){
            System.out.println("Its a nice day for a walk.");
        }else if (weather.equals("rainy")){
            System.out.println("Bring an umrella!");
        }else {
            System.out.println("Not sure what to do in this weather");
        }

        int score = 85;

        if (score>=80){
            System.out.println("You got an A!");
        }else if (score>070){
            System.out.println("You got a B!");
        }else if (score>=60){
            System.out.println("You got a C!");
        }else if (score>=50){
            System.out.println("You got a D.");
        }else {
            System.out.println("You failed :()");
        }

        String jobTitle = "manager";
        if (jobTitle.equals("CEO")){
            System.out.println("You are the boss!");
        }else if(jobTitle.equals("manager")){
            System.out.println("you`re in charge of a team");
        }else {
            System.out.println("You are an employee.");
        }

        char grade = 'B';
        if (grade=='A'){
            System.out.println("Exellent work !");
        }else if (grade=='B'){
            System.out.println("Good job!");
        }else if (grade=='C'){
            System.out.println("You did ok.");
        }else if (grade=='D'){
            System.out.println("Hey, you still passed!");
        }else{
            System.out.println("You failed :()");
        }
    }
}
