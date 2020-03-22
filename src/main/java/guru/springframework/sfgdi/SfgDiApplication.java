package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18nController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------------- i18nService");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.greetMessage());

		System.out.println("------------- Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.greetingMessage());

		System.out.println("------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------- Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
