package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    // klasa potomna w innej paczki nie ma dostepu do pol i metod private i default
    public void testIdentifier() {
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        //secondMethod();
        thirdMethod();
    }
}
