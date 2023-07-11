import java.util.*;

public class madLibs {
    public static void main(String[] args) {
        // creates a scanner
        Scanner input = new Scanner(System.in);
        // creates an arraylist that will contain the inputted adjectives
        ArrayList<String> adjs = new ArrayList<String>();
        // for loop that asks for the input 12 adjectives
        for (int adj = 0; adj < 12; adj++) {
            System.out.println("Please enter an adjective: ");
            String adjective = input.nextLine();
            adjs.add(adjective);
        }
        // creates an arraylist that will contain the inputted nouns
        ArrayList<String> nouns = new ArrayList<String>();
        // for loop that asks for the input of 5 nouns
        for (int non = 0; non < 5; non++) {
            System.out.println("Please enter a noun: ");
            String noun = input.nextLine();
            nouns.add(noun);
        }
        // asks for the user to input a name
        System.out.println("Please enter a name: ");
        String name = input.nextLine();

        // calling the method to randomize the array of input adjectives
        ArrayList<String> randAdjs = randomizeArrayList(adjs);
        // calling the method to randomize the array of nouns
        ArrayList<String> randNouns = randomizeArrayList(nouns);

        // initializing the story
        String storyp1 = "Once upon a time, in a " + randAdjs.get(0) + " land far, far away, there lived a "
                + randNouns.get(0) + " named " + name + ". One day, " + name
                + " decided to go on an adventure to find the " + randAdjs.get(1)
                + " treasure that was said to be hidden in the " + randAdjs.get(2) + " " + randNouns.get(1) + ".";
        String storyp2 = "As " + name + " journeyed through the " + randAdjs.get(3) + " land, they encountered a "
                + randAdjs.get(4) + " " + randNouns.get(2)
                + " who offered to join them on their quest. Together, they faced many challenges, including crossing a "
                + randAdjs.get(5) + " river and climbing a " + randAdjs.get(6) + " mountain.";
        String storyp3 = "Finally, after many days of searching, they arrived at the entrance to the " + randAdjs.get(7)
                + " cave where the treasure was said to be hidden. As they entered the cave, they were greeted by a "
                + randAdjs.get(8) + " " + randNouns.get(3)
                + " who guarded the treasure. But with quick thinking and a bit of luck, " + name
                + " and their companion were able to outsmart the " + randAdjs.get(9) + " " + randNouns.get(4)
                + " and claim the " + randAdjs.get(10) + " treasure for themselves.";
        String storyp4 = "With their mission accomplished, " + name
                + " and their companion returned home to their village as heroes, sharing stories of their "
                + randAdjs.get(11) + " adventure for years to come.";

        // printing out the story
        System.out.println(storyp1);
        System.out.println(storyp2);
        System.out.println(storyp3);
        System.out.println(storyp4);

    }

    // randomize arraylist method
    public static ArrayList<String> randomizeArrayList(ArrayList<String> list) {
        ArrayList<String> rand = new ArrayList<String>();
        // create a loop that runs for all the indexes in the input arraylist
        while (list.size() > 0) {
            // choose random num within old array length
            int randInt = (int) (Math.random() * list.size());
            // add old to new list at random num length position
            rand.add(list.get(randInt));
            // remove old from old list
            list.remove(randInt);
        }
        return rand;
    }
}