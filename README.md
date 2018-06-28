# Testes Automatizados com Selenium e JUnit.

## Introdução

Sistema Distribuído do GRULES
Deverá ser o sistema distribuído para gerenciamento e organização dos projetos do Grules

## Teste web com Selenium

Teste com selenium das páginas web, realizar testes das páginas estáticas e dinâmicas.

1. Código que testa web (Aplicação Java que testa site web);
2. Testar toda interação com usuário cadastros (escrita) e listagens (leitura);

## Configurando Eclipse IDE para testes com Selenium WebDriver:

#### Criando novo Projeto
![Criando novo Projeto](imagens/criar_novo_projeto.jpg)
#### Criar Arquivo Biblioteca e adicionar bibliotecas do Selenium e Chorme
![Criar Arquivo Biblioteca e adicionar bibliotecas do Selenium e Chorme](imagens/pasta_biblioteca.jpg)
#### Adicionar todos novos patchs ao projeto Testeselenium
![Adicionar todos novos patchs ao projeto Testeselenium](imagens/add_patchs.jpg)
#### Novos patchs adicionados ao projeto Testeselenium
![Novos patchs adicionados ao projeto Testeselenium](imagens/adicionados_patchs.jpg)


### Adicionado JUnit ao projeto

Adicionando ao biblioteca do Eclipse o JUnit5

#### Inserindo Biblioteca Testeselenium
![Add Biblioteca Testeselenium](imagens/adicionar_biblioteca.jpg)
#### Localizando Junit5
![Localizando Junit5](imagens/add_junit.jpg)

### Criando Classe TesteAuto - Selenium WebDriver

Criando Classe TesteAuto para configuração de testes com Selenium e JUnit

#### Criando Classe TesteAuto e configurando para abrir navegador Chrome
![Criando Classe TesteAuto e configurando para abrir navegador Chrome](imagens/classe_testeauto_chormedriver_1.jpg)
#### Criando Classe Logar e configurando primeiro teste de Login
![Criando Classe Logar e configurando primeiro teste de Login](imagens/classe_logar_abrir_navegador_2.jpg)

### Criando Classe CadastrarUsurios - Selenium WebDriver

Criando Classe CadastrarUsuarios para configuração de testes com Selenium e JUnit de cadastramento, alteração e remoção

#### Criando Classe CadastrarUsarios e configurando para rodar testes
![Criando Classe TesteAuto e configurando para abrir navegador Chrome](imagens/classe_testeauto_chormedriver_1.jpg)
#### Criando Classe Logar e configurando primeiro teste de Login
![Criando Classe Logar e configurando primeiro teste de Login](imagens/classe_logar_abrir_navegador_2.jpg)

#### Configurando para rodar testes de Cadastramento de Usuários
![Configurando para rodar testes de Cadastramento de Usuários](imagens/classe_cadastrarusu_teste_3.jpg)
#### Configurando para rodar testes de Alteração de Usuários
![Configurando para rodar testes de Alteração de Usuários](imagens/classe_editarusu_teste_4.jpg)

#### Configurando para rodar testes de Exclusão de Usuários
![Configurando para rodar testes de Exclusão de Usuários](imagens/classe_deletarusu_5.jpg)

### Criando Classe CadastrarEventos - Selenium WebDriver

Criando Classe CadastrarEventos para configuração de testes com Selenium e JUnit de cadastramento, alteração e remoção

#### Criando Classe CadastrarEventos e configurando para rodar testes
![Criando Classe CadastrarEventos e configurando para rodar testes](imagens/classe_cadastrarevento_6.jpg)
#### Mesmos métodos usados para editar e excluir eventos, já ultilizado para usuários
![Mesmos métodos usados para editar e excluir eventos, já ultilizado para usuários](imagens/classe_cadastrarevento_7.jpg)


### Criando Classe CadastrarApn - Selenium WebDriver

Criando Classe CadastrarApn para configuração de testes com Selenium e JUnit de cadastramento, alteração e remoção

#### Criando Classe CadastrarApn e configurando para rodar testes
![riando Classe CadastrarApn e configurando para rodar testes](imagens/classe_cadastrarapn_8.jpg)
#### Mesmos métodos usados para editar e excluir eventos, já ultilizado para usuários
![Mesmos métodos usados para editar e excluir eventos, já ultilizado para usuários](imagens/classe_cadastrarapn_9.jpg)
#### Criando método deletar e adicionar aluno ao grupo de Apresentação
![Mesmos métodos usados para editar e excluir eventos, já ultilizado para usuários](imagens/classe_cadastrarapn_10.jpg)

### Erros de testes realizados no menu Apresentação

Identificado erro no tetse da Classe CadastrarApn para configuração alteração e inserção de aluno

#### Erro ao editar Apresentação Cadastrada
![Erro ao editar Apresentação Cadastrada](imagens/cadastro_apn_grules.jpg)
#### Erro ao tentar inserir aluno cadastrado no grupo de Apresentação
![Erro ao tentar inserir aluno cadastrado no grupo de Apresentação](imagens/erro_gravar_aluno.jpg)
#### Erro ao tentar inserir novas informações no Banco de Dados
![Erro ao tentar inserir novas informações no Banco de Dados](imagens/erro_aluno.jpg)

## Links

Os seguintes links abaixo serão úteis para você estudar sobre o tema de Automatização de testes com Selenium WebDriver

 - [Selenium WebDriver Config e Downloads](https://www.youtube.com/watch?v=2UhRVicIzGI)
 - [Introdução aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver](https://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037)
 - [Curso - Automação de Testes com Selenium WebDriver em Java](https://www.udemy.com/automacao-de-testes-com-selenium-webdriver-em-java/)


