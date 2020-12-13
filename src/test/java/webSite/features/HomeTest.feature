#language: pt

Funcionalidade: Home Page
  A Home Page é a página principal do portal Petz

  Cenário: CT01 - Validar acesso à Home Page
    Dado o usuário acessa a Home Page
    Então a página é carregada com sucesso


  Cenário: CT02 - Consultar um produto
    Dado o usuário acessa a Home Page
    E realiza uma busca pelo produto "ração"
    E seleciona o terceiro produto do resultado
    Então valida o nome do produto, fornecedor, preço normal e preço para assinante
    E clica em adicionar ao carrinho
    Então valida o nome do produto e preço normal


