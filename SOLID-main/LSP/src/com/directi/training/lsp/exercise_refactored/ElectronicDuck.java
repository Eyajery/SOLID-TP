package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            // Ne pas lever d'exception, simplement afficher un message
            System.out.println("Le canard électronique est éteint, il ne peut pas coasser.");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Le canard électronique nage");
        } else {
            // Ne pas lever d'exception, simplement afficher un message
            System.out.println("Le canard électronique est éteint, il ne peut pas nager.");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
