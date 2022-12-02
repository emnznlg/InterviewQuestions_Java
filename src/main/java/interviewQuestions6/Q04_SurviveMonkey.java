package interviewQuestions6;

public class Q04_SurviveMonkey {
    /*
    There is a lonely monkey on the island
    He needs to eat 4 bananas every day
    there are just 165 bananas on that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;
        do {
            if (numberOfBananas < 4) {
                monkeyAlive = false;
            } else {
                numberOfBananas -= 4;
                survivalDays++;
            }
        } while (monkeyAlive);

        System.out.println(survivalDays);
    }

}

