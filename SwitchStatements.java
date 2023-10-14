public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "rainy";
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt.");
                break;
            case "cloudy":
                System.out.println("You should wear a sweater.");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat.");
                break;
            case "snowy":
                System.out.println("You should wear a jacket.");
                break;
        
            default:
                System.out.println("You can wear whatever you want.");
        }

        int role = 2;
        switch (role) {
            case 1 :
                System.out.println("You are an admin");
                break;
            case 2 :
                System.out.println("You are an editor");
                break;
            case 3:
                System.out.println("You are an user");
                break;
            default:
                System.out.println("Please contact HR");
        }
        
        int temperature = 75;
        int humidity = 65;
        if (temperature>= 80 && humidity>=60){
            System.out.println("It is too hot and humid\n");
        }else if (temperature>=80){
            System.out.println("It is too hot\n");
        }else if (temperature<=60 && humidity>=60){
            System.out.println("It is too cold and humid\n");
        }else if(temperature<=60){
            System.out.println("It is too cold\n");
        }else {
            System.out.println("It is comfortable\n");
        }
      

        int age = 25;
        int income = 50000;

        if(age>=18 && age <= 60 && income>=30000){
            System.out.println(" Congrats you are eligible for the credit card");
        }else {
            System.out.println(" you are not eligible for a credit card");
        }
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println(" GO!");
                break;
            case "yellow":
                System.out.println("Slow Down!");
                break;
            case "red":
                System.out.println("Stop!");
                break;
            default:
                System.out.println("Power outrage!");
        }
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        if(grade>=80){
            System.out.println("You got an A!");
        }else if (grade >=70){
            System.out.println("You got a B!");
        }else if(grade >= 60){
            System.out.println("You got a C.");
        }else if(grade >= 50){
            System.out.println("You got a D.");
        }else{
            System.out.println("You Failed :()");
        }
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println(" Enjoy your chrome extensions!");
                break;
            case "Firefox":
                System.out.println("The best nonprofit browser");
                break;
            case "Safari":
                System.out.println("I see you are a proud apple user");
                break;
            default:
            System.out.println("Curious what browser you use");
                
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
