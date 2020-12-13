package webSite.steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import webSite.base.Hooks;
import webSite.pageObjects.busca.buscaPage;
import webSite.pageObjects.home.homePage;


public class HomeStep extends Hooks {

    homePage _home = new homePage();
    buscaPage _busca = new buscaPage();

    @Before
    public void setUp(Scenario scenario) throws Exception {
        acessarURLChrome();
    }

    @After
    public void tearDown(Scenario scenario) {
        fecharNavegador();
    }

    @Dado("^o usuário acessa a Home Page$")
    public void oUsuárioAcessaAHomePage() {
        _home.validarElementoHome();
    }

    @Então("^a página é carregada com sucesso$")
    public void aPáginaÉCarregadaComSucesso() {
        _home.validarElementoHome();
    }

    @E("^realiza uma busca pelo produto \"([^\"]*)\"$")
    public void realizaUmaBuscaPeloProduto(String arg0) throws Throwable {
        _busca.preencherBusca(arg0);
    }

    @E("^seleciona o terceiro produto do resultado$")
    public void selecionaOTerceiroProdutoDoResultado() {
        _busca.clicarTerceiroProduto();
    }

    @Então("^valida o nome do produto, fornecedor, preço normal e preço para assinante$")
    public void validaONomeDoProdutoFornecedorPreçoNormalEPreçoParaAssinante() {
        _busca.validarInfoProdutos();
    }

    @E("^clica em adicionar ao carrinho$")
    public void clicaEmAdicionarAoCarrinho() {
        _busca.clicarAddCarrinho();
    }

    @Então("^valida o nome do produto e preço normal$")
    public void validaONomeDoProdutoEPreçoNormal() {
        _busca.validarCompra();
    }
}
