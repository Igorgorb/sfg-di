package guru.springframework.sfgdi.repositories;

/**
 * @author igorg
 * Date 08.05.2022
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN from repository";
    }
}
