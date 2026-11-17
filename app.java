public class app {
    public static void main(String[] args) {
        // Default to 5 if no argument is provided, or parse the input argument
        int num = 5;
        if (args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Using default value: 5");
            }
        }
        
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
