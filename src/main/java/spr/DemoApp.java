package spr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
    @Bean
    CommandLineRunner runner(UserRepository repository){
        return args -> {
            User Ann=new User("Ann Y.F.", "ananas@yandex.ru","78094567877");
          repository.save(Ann)  ;
        };
    }

//    @Bean
//    CommandLineRunner runner(UserRepository repository){
//        return args -> {
//          User Nick=new User("Nick T.A.", "nikkk@mail.ru","70258203847");
//          repository.save(Nick);
//        };
//    }
}
