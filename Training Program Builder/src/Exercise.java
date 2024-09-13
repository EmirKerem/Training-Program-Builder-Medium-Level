public class Exercise {
    private int burpeeCount;
    private int pushupCount;
    private int situpCount;
    private int squatCount;

    public Exercise(int burpeeCount, int pushupCount, int situpCount, int squatCount) {
        this.burpeeCount = burpeeCount;
        this.pushupCount = pushupCount;
        this.situpCount = situpCount;
        this.squatCount = squatCount;
    }

    public int getBurpeeCount() {
        return burpeeCount;
    }

    public void setBurpeeCount(int burpeeCount) {
        this.burpeeCount = burpeeCount;
    }

    public int getPushupCount() {
        return pushupCount;
    }

    public void setPushupCount(int pushupCount) {
        this.pushupCount = pushupCount;
    }

    public int getSitupCount() {
        return situpCount;
    }

    public void setSitupCount(int situpCount) {
        this.situpCount = situpCount;
    }

    public int getSquatCount() {
        return squatCount;
    }

    public void setSquatCount(int squatCount) {
        this.squatCount = squatCount;
    }

    public void performExercise(String exerciseType, int number) {
        switch (exerciseType) {
            case "Burpee":
                performBurpee(number);
                break;
            case "Pushup":
                performPushup(number);
                break;
            case "Situp":
                performSitup(number);
                break;
            case "Squat":
                performSquat(number);
                break;
            default:
                System.out.println("Invalid exercise type...");
                break;
        }
    }

    private void performBurpee(int number) {
        if (burpeeCount == 0) {
            System.out.println("You've completed the burpees, congratulations!");
        } 
        else if (number <= burpeeCount) {
            burpeeCount -= number;
            System.out.println("Remaining burpees: " + burpeeCount);
        } 
        else {
            System.out.println("You've exceeded your burpee goal, congratulations!");
            int extra = number - burpeeCount;
            System.out.println("Extra burpees done: " + extra);
            burpeeCount = 0;  // Reset the count
        }
    }

    private void performPushup(int number) {
        if (pushupCount == 0) {
            System.out.println("You've completed the pushups, congratulations!");
        } 
        else if (number <= pushupCount) {
            pushupCount -= number;
            System.out.println("Remaining pushups: " + pushupCount);
        } 
        else {
            System.out.println("You've exceeded your pushup goal, congratulations!");
            int extra = number - pushupCount;
            System.out.println("Extra pushups done: " + extra);
            pushupCount = 0;  // Reset the count
        }
    }

    private void performSitup(int number) {
        if (situpCount == 0) {
            System.out.println("You've completed the situps, congratulations!");
        } 
        else if (number <= situpCount) {
            situpCount -= number;
            System.out.println("Remaining situps: " + situpCount);
        } 
        else {
            System.out.println("You've exceeded your situp goal, congratulations!");
            int extra = number - situpCount;
            System.out.println("Extra situps done: " + extra);
            situpCount = 0;  // Reset the count
        }
    }

    private void performSquat(int number) {
        if (squatCount == 0) {
            System.out.println("You've completed the squats, congratulations!");
        } 
        else if (number <= squatCount) {
            squatCount -= number;
            System.out.println("Remaining squats: " + squatCount);
        } 
        else {
            System.out.println("You've exceeded your squat goal, congratulations!");
            int extra = number - squatCount;
            System.out.println("Extra squats done: " + extra);
            squatCount = 0;  // Reset the count
        }
    }

    public boolean finished() {
        return burpeeCount == 0 && pushupCount == 0 && situpCount == 0 && squatCount == 0;
    }
}
