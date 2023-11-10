package com.kristoffer.demo.test;

public class AccessModTest {

    /* TODO - Access Modifier / Visibility Modifiers
    *   Public      -   Global Reach
    *   Protected   -   NOT Global
    *   No Modifier -   Not Global && Not Subclass
    *   Private     -   Only within self (class)
    *
    *   Classes can be: No Mod || Public
    *   Methods can be: public,
    *
    * */

    public void testPublic() {}
    protected void testProtected() {}
    void testNoModifier() {}
    private void testPrivate() {}

}
