import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Workout Program...");
        System.out.println("**********************************");
        
        String exercises = "Available Exercises...\n"
                           + "Burpee\n"
                           + "Pushup\n"
                           + "Situp\n"
                           + "Squat\n";
        System.out.println(exercises);
        
        System.out.println("Set Up Your Workout...");
        
        System.out.print("Number of Burpees: ");
        int burpeeCount = scanner.nextInt();
        
        System.out.print("Number of Pushups: ");
        int pushupCount = scanner.nextInt();
        
        System.out.print("Number of Situps: ");
        int situpCount = scanner.nextInt();
        
        System.out.print("Number of Squats: ");
        int squatCount = scanner.nextInt();
        scanner.nextLine(); 
        
        Exercise exercise = new Exercise(burpeeCount, pushupCount, situpCount, squatCount);
        
        System.out.println("Workout Starting...");
        
        while (!exercise.finished()) {
            System.out.print("Enter Exercise Type (Burpee, Pushup, Situp, Squat): ");
            String exerciseType = scanner.nextLine();
            System.out.print("How many of this exercise will you do? ");
            int number = scanner.nextInt();
            scanner.nextLine(); 
            exercise.performExercise(exerciseType, number);
        }
        
        System.out.println("Great job! You've completed all the exercises.");
    }
}
