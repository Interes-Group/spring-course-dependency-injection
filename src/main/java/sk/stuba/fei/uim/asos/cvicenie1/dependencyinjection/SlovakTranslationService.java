package sk.stuba.fei.uim.asos.cvicenie1.dependencyinjection;

public class SlovakTranslationService implements TranslationService {

    @Override
    public String translate(String input) {
        return input + " po slovensky";
    }
}
