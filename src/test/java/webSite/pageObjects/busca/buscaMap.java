package webSite.pageObjects.busca;

import webSite.base.Hooks;
import org.openqa.selenium.By;

public class buscaMap extends Hooks{

    public static final By CAMPO_BUSCA = By.id("search");

    public static final By BOTAO_BUSCA = By.cssSelector("[class=button-search]");

    public static final By TERCEIRO_PRODUTO = By.xpath("/html/body/div[9]/div[2]/div[2]/div[2]/div[2]/ul/li[3]/a[2]/img");

    public static final By NOME_PRODUTO = By.xpath("//*[@id=\"divProdutoVariacao\"]/div[1]/div[3]/h1");

    public static final By NOME_FORNECEDOR = By.xpath("//*[@id=\"divProdutoVariacao\"]/div[1]/div[3]/div[2]");

    public static final By PRECO_NORMAL = By.xpath("//*[@id=\"divProdutoVariacao\"]/div[2]/div[3]/div[1]/div[1]/div[1]/div");

    public static final By PRECO_ASSINANTE = By.xpath("//*[@id=\"divProdutoVariacao\"]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]");

    public static final By BOTAO_CARRINHO = By.id("adicionarAoCarrinho");

    public static final By COMPRA_PRODUTO = By.xpath("//*[@id=\"sacola\"]/div[1]/div/table/tbody/tr[1]/td[2]/a");

    public static final By COMPRA_PRECO_NORMAL = By.xpath("//*[@id=\"sacola\"]/div[1]/div/table/tbody/tr[1]/td[3]");

}
