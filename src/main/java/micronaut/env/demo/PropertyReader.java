package micronaut.env.demo;

import io.micronaut.context.annotation.Value;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import javax.inject.Singleton;

@Singleton
public class PropertyReader {
    @Value("${envdemo.greeting}")
    private String propertyFromOsEnv;

    @EventListener
    public void greetOnStartUp(StartupEvent event){
        String message = String.format("Micronaut says: %s from %s", propertyFromOsEnv, System.getProperty("os.name"));
        System.out.println(message);
        System.exit(0);
    }
}
