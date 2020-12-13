package webSite.pageObjects.home;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class homePage extends homeMap {

    public void validarElementoHome(){
        String textoElement = driver.findElement(ASSINATURA).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Assinatura Petz"));
    }

}
