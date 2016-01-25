package module_8.music.objects;


import module_8.music.abstract_level.MusicalInstruments;

public class Piano extends MusicalInstruments {


    public Piano(String name, Integer prise) {
        super(name, prise);
    }

    @Override
    public String toString() {
        return Piano.class.getSimpleName()+ "\t\t " + getName() + " \t " + getPrise();
    }
}
