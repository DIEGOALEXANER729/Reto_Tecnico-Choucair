package com.orangehrmlive.opensource_demo.interactions;

import com.orangehrmlive.opensource_demo.ui.PaginaReclutarUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicBotonMarkinterViewPassed implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaReclutarUI.BTN_MARKINTERVIEWPASSED) // Usa el Target definido en tu clase UI.
        );
    }

    public static Performable ClicBotonMarkinterViewPassed(){
        return  instrumented(ClicBotonMarkinterViewPassed.class);
    }

}
