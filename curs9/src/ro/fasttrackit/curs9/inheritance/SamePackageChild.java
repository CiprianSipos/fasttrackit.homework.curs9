package ro.fasttrackit.curs9.inheritance;

import java.sql.SQLOutput;

public class SamePackageChild extends Parent{

    public SamePackageChild(){
        super("parent");
    }

    public void childMethod(){
        System.out.println("Ce am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
        System.out.println(defaultInt);
        //System.out.println(priveteString);  nu merge, nu se mosteneste, nu e vizibil

        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod(); nu se poate folosi, pe private
    }
}
