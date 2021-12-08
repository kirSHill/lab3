package Essentials;
import Characters.*;

public class Story {

    public static void main(String[] args) {

        Znaika Znaika = new Znaika("Знайка", Interest.UNINTERESTED);

        System.out.println(Znaika.getName() + Znaika.talkWith(" сказал коротышкам"));

        Korotishka Korotishka = new Korotishka("Коротышки", Interest.ENGAGED);

        System.out.println(Korotishka.getName() + " " + Korotishka.getPowerOfInterest(Interest.ENGAGED) + " секретом Знайки");

        Toropizhka Toropizhka = new Toropizhka("Торопыжка", Interest.IMPATIENCE);

        System.out.println(Toropizhka.getName() + " от " + Toropizhka.getPowerOfInterest(Interest.IMPATIENCE) + " так " + Toropizhka.isWorried(Interest.IMPATIENCE) + ", что за обедом " + Toropizhka.getPossibilityToEat(false));

        System.out.println(Toropizhka.getName() + Toropizhka.getPowerOfInterest(Interest.FASCINATED) + Toropizhka.goTo(Znaika) + Toropizhka.beat(Znaika) + Znaika.tellSecret());

        System.out.println(Korotishka.getName() + " узнали секрет заранее, но их " + Korotishka.getPowerOfInterest(Interest.CURIOSITY) + " лишь увеличивалось");

        Stone Stone = new Stone("Светящийся Камень", Material.STONE, true);

        System.out.println("Секретом оказался " + Stone.getName());

    }
}
