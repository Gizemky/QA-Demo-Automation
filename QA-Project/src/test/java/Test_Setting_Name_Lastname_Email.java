
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest{


    @Test
    public void setName() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Gizem");
        Assertions.assertEquals("Gizem",practiceFormPage.getName() , "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Kaya");
        Assertions.assertEquals("Kaya",practiceFormPage.getLastname(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("gizemkaya@gmail.com");
        Assertions.assertEquals("gizemkaya@gmail.com",practiceFormPage.getEmail(), "Email value is not correct!");
    }

}
