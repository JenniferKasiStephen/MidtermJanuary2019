package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student you = new Student();
        Assert.assertEquals(you.getFirstName(),"Jennifer");
        Assert.assertEquals(you.getLastName(),"Stephen");
        Assert.assertEquals(you.getScore(),"");



    }
}
