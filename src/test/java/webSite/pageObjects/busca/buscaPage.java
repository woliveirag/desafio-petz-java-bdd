package webSite.pageObjects.busca;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class buscaPage extends buscaMap{

    public void preencherBusca(String produto) {
        driver.findElement(CAMPO_BUSCA).sendKeys(produto);
        driver.findElement(BOTAO_BUSCA).click();
    }

    public void clicarTerceiroProduto() {
        driver.findElement(TERCEIRO_PRODUTO).click();
    }

    public void validarInfoProdutos(){
        String textoElement = driver.findElement(NOME_PRODUTO).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Ração Royal Canin Maxi - Cães Adultos - 15kg"));

        String textoElement1 = driver.findElement(NOME_FORNECEDOR).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString("Royal Canin"));

        String textoElement2 = driver.findElement(PRECO_NORMAL).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString("R$ 232,69"));

        String textoElement3 = driver.findElement(PRECO_ASSINANTE).getText();
        Assert.assertThat(textoElement3, CoreMatchers.containsString("R$ 209,42"));
    }
    public void clicarAddCarrinho() {
        driver.findElement(BOTAO_CARRINHO).click();
    }

    public void validarCompra(){
        String textoElement = driver.findElement(COMPRA_PRODUTO).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Ração Royal Canin Maxi - Cães Adultos - 15kg - 15kg"));

        String textoElement1 = driver.findElement(COMPRA_PRECO_NORMAL).getText();
        Assert.assertThat(textoElement1, CoreMatchers.containsString("R$ 232,69"));
    }
}
