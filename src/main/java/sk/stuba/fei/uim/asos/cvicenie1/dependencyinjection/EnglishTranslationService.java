package sk.stuba.fei.uim.asos.cvicenie1.dependencyinjection;

public class EnglishTranslationService implements TranslationService {

    @Override
    public String translate(String input) {
        return input + " in english";
    }
}
