package com.orangehrmlive.opensource_demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarValoresQuestions implements Question<Boolean> {

    private String name;
    private String lastName;
    private String status;

    // Constructor que recibe los valores que deseas comparar
    public ValidarValoresQuestions(String name, String lastName, String status) {
        this.name = name;
        this.lastName = lastName;
        this.status = status;
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        // Buscar las celdas de la fila
        String firstColumn = Text.of(Target.the("first column")
                        .locatedBy("//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell'][1]"))
                .answeredBy(actor);

        String secondColumn = Text.of(Target.the("second column")
                        .locatedBy("//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell'][2]"))
                .answeredBy(actor);

        String fifthColumn = Text.of(Target.the("fifth column")
                        .locatedBy("//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell'][5]"))
                .answeredBy(actor);

        // Verificar si los valores de las celdas coinciden con los datos esperados
        return firstColumn.equals(name) && secondColumn.equals(lastName) && fifthColumn.equals(status);
    }

    public static ValidarValoresQuestions withValues(String name, String lastName, String status) {
        return new ValidarValoresQuestions(name, lastName, status);
    }
}