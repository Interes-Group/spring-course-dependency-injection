package sk.stuba.fei.uim.asos.cvicenie1.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.logging.Logger;

public class DependencyInjectionApplication {

    private final static Logger log = Logger.getLogger(DependencyInjectionApplication.class.getSimpleName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        Map<String, TranslationService> services = context.getBeansOfType(TranslationService.class);
        for (TranslationService service : services.values()) {
            log.info(service.translate("nieco"));
        }
        /*
        Java SE 8 Streams:
        services.forEach((s, service) -> log.info(service.translate("nieco")));
        */
    }
}
