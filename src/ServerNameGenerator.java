import java.util.Random;

public class ServerNameGenerator {
    public static String[] nouns = {"apple", "camera", "waterbottle", "microphone", "window", "soylent", "ledlight", "ember", "billyclub", "lightsaber"};

    public static String[] adjectives = {"whiny", "purple", "fat", "jovial", "insidious", "dark", "gnarly", "curious", "eager", "lugubrious"};

    public static void main(String[] args) {

        String noun = getRandomWord(ServerNameGenerator.getNouns());
        String adjective = getRandomWord(ServerNameGenerator.getAdjectives());

        System.out.println("Here is your server name:\n" + adjective + "-" + noun);
    }

    public static String getRandomWord(String[] words) {
        // Grab a random noun and verb
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(words.length); // upper bound is EXclusive, so if the upper bound is 10, it will only return 9, which is the index for the 10th element in the array
        return words[randInt];

    }

    // Getter and Setter for nouns/adjectives

    public static String[] getNouns() {
        return nouns;
    }

    public static void setNouns(String[] nouns) {
        ServerNameGenerator.nouns = nouns;
    }

    public static String[] getAdjectives() {
        return adjectives;
    }

    public static void setAdjectives(String[] adjectives) {
        ServerNameGenerator.adjectives = adjectives;
    }
}
