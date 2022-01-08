package com.ma.assurance;

abstract class GammeDecorator extends Assurance {

    Assurance assurance;

    public GammeDecorator(Assurance assurance){
        this.assurance = assurance;
    }
}
