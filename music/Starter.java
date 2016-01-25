package module_8.music;


import module_8.music.abstract_level.MusicalInstruments;
import module_8.music.objects.Guitar;
import module_8.music.objects.Piano;
import module_8.music.objects.Trumpet;
import module_8.music.shop.MusicShop;
import module_8.music.utils.MusicInstrumentsSorter;
import module_8.music.utils.Printer;

import java.util.ArrayList;
import java.util.List;

public class Starter {

    public static void main(String[] args) {

        List<MusicalInstruments> musicalInstrumentses = new ArrayList<>();

        MusicalInstruments fender = new Guitar("Fender", 2154);
        MusicalInstruments ibanez = new Guitar("Ibanez", 35681);
        MusicalInstruments yamana = new Piano("Yamana", 57842);
        MusicalInstruments cassio = new Piano("Cassio", 4578);
        MusicalInstruments trumpet = new Trumpet("Trumpet", 25478);

        createMusicShop(fender, ibanez, yamana, cassio, trumpet);

        addMusicInstuments(musicalInstrumentses, fender, ibanez, yamana, cassio, trumpet);

        Printer.print(musicalInstrumentses);

        MusicInstrumentsSorter.sortByName(musicalInstrumentses);

    }

    private static void addMusicInstuments(List<MusicalInstruments> musicalInstrumentses, MusicalInstruments fender, MusicalInstruments ibanez, MusicalInstruments yamana, MusicalInstruments cassio, MusicalInstruments trumpet) {
        musicalInstrumentses.add(ibanez);
        musicalInstrumentses.add(yamana);
        musicalInstrumentses.add(trumpet);
        musicalInstrumentses.add(fender);
        musicalInstrumentses.add(cassio);
    }

    private static void createMusicShop(MusicalInstruments fender, MusicalInstruments ibanez, MusicalInstruments yamana, MusicalInstruments cassio, MusicalInstruments trumpet) {
        MusicShop musicShop = new MusicShop("MyShop");

        addMusicInstuments(musicShop.getMusicalInstrumentses(), fender, ibanez, yamana, cassio, trumpet);
    }
}
