package abstract_and_interfaces;

public class AbstractTest {
    public static void main(String[] args) {
        Housecat vishnu = new Housecat();
        System.out.println(vishnu.makeNoise());

        Playable[] playables= {new Bouzouki(),new Ball()};
        for (Playable playable : playables){
            System.out.println(playable.play());
        }
    }
}
