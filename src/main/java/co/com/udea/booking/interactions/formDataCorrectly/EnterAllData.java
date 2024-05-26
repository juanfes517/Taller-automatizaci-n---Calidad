package co.com.udea.booking.interactions.formDataCorrectly;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.booking.userinterfaces.BookingPage.*;

public class EnterAllData implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Felipe").into(INPUT_NAME_P1));
        actor.attemptsTo(Enter.theValue("Escobar").into(INPUT_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue("Juan@udea.edu.co").into(INPUT_EMAIL_P1));
        actor.attemptsTo(Enter.theValue("123456789").into(INPUT_PHONE_P1));
        actor.attemptsTo(Enter.theValue("Medellin, Colombia").into(INPUT_ADDRESS_P1));
        actor.attemptsTo(Enter.theValue("Juan").into(INPUT_EMERGENCY_NAME_P1));
        actor.attemptsTo(Enter.theValue("Rendon").into(INPUT_EMERGENCY_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue("123456789").into(INPUT_EMERGENCY_PHONE_P1));
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static EnterAllData inAllInputs(){
        return Tasks.instrumented(EnterAllData.class);
    }
}
