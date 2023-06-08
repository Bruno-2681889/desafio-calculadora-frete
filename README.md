# Desafio Calculadora Frete

<img src="https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/06/13483_ECF5D4B2CBDD90FC.jpeg" align="right"
alt="Size Limit logo by Anton Lovchikov" width="260" height="178">

- [📄 Pré-Requisitos ](#pré-requisitos)
- [💻 FASE 1 - Criando a aplicação](#fase-1)
- [💲 Regras de Negócio](#regras-de-negócio)
- [📚 Funcionamento do Calculo De Frete](#como-funcionará-o-calculo-de-frete-)
- [🤖 FASE 2 - Melhorando a qualidade com testes automatizados](#fase-2)
- [🚀 FASE 3 - Implementando APIS com Spring Framework](#fase-3)
- [🌐 FASE 4 - Consumindo APIS Rest](#fase-4)
- [⚙️ FASE 5 - Banco de Dados](#fase-5)

---

## PRÉ REQUISITOS

- [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html);
- [Maven](https://maven.apache.org/download.cgi);
- [IntelliJ Community](https://www.jetbrains.com/idea/download/#section=windows) ou [SpringTools](https://spring.io/tools);

## FASE 1

***Objetivo:*** Criar uma aplicação que baseada em um produto e no endereço do cliente, seja calculado o valor do frete e impresso no console.

***Obs:*** Para esse desafio, foi utilizado como base a apostila [Java e Orientação a Objetos](https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf) da [Caelum](https://www.caelum.com.br/) 

***Aprendizado:*** A idéia aqui é desenvolver conceitos basicos da linguagem Java e da orientação a objetos.

Exemplo do que deve ser impresso no Console :

```
Produto: Geladeira
UF: SP
Valor do Frete: 15,00
```

### Regras de Negócio

- O cliente deverá conter as seguintes informações: 
- nome;
- data de aniversario;
- A data de aniversario do cliente deverá utilizar a nova [api de datas do Java 8](https://www.alura.com.br/artigos/conheca-a-nova-api-de-datas-do-java-8); 
- cep;
- O cep deve estar dentro das seguintes regras:
- O cep deve aceitar zeros a esquerda. Exemplo: 02123040;
- O cep deve conter exatamente 8 dígitos numéricos;
- Não pode ter letras ou caracteres especiais;
- Caso o Cep seja invalido, você deve lançar a exceção IllegalArgumentException do Java, trata-la e exibir a seguinte mensagem no console: "Cep invalido ! o formato correto deveria ser XXXXXXXX"
- Se o usuário mandar um cep com mascara (hifen) exemplo: 021023-040, você deve remover esse hifen exemplo: 02123040;
- Dicas:
- Estude sobre o pacote [java.lang.String](https://www.devmedia.com.br/java-string-manipulando-metodos-da-classe-string/29862); 
- logradouro;
- bairro;
- cidade;
- uf;
- A uf deve ser um estado do Brasil valido. Exemplo: SP, MG, RJ e etc ...
- Dicas:
- Você pode utilizar uma [enum](https://www.devmedia.com.br/enums-no-java/38764) para representar a uf ao invés de String; 
- O produto deverá conter as seguintes informações:
- descrição;
- valor;
- Utilize Double como tipo;
- O valor do produto não pode ser nulo ou zero, caso seja, a exceção PrecoInvalidoException deverá ser lançada e tratada e a unica mensagem que deverá ser exibida no console é: "O valor do produto [Aqui vc coloca o nome do produto] está inválido pois deve ser maior que zero !" ; 
- O frete deverá conter as seguintes informações:
- produto;
- uf; 
- valor;

#### Como funcionará o calculo de frete ?

- Deve existir 2 tipos de calculo de frete, um baseado na uf do cliente e outro baseado no valor do produto.
- Ambos irão receber como parâmetro o produto e o cliente e devem retornar o Frete.

##### Calculo Frete por uf
A regra para o calculo de frete por uf deverá ser a seguinte: Se a uf do cliente for SP, MG ou RJ, o valor do frete deverá ser 30% do valor do produto, caso contrário o valor do frete será 15% do valor do produto;

##### Calculo de Frete por valor do produto

A regra para o calculo de frete por valor do produto deverá ser a seguinte: Se o preco do produto for menor que 20,00 o valor do frete será de 2,00. Se o valor do produto for entre 20,00 e 100,00 o Frete deverá ser 8,00 e acima de R$ 100,00 o frete é gratis (0,00);

### O que será avaliado ?

- Uso correto de variaveis;
- Uso correto de modificadores de acesso;
- [Uso correto de metodos de instância e estáticos](https://www.devmedia.com.br/trabalhando-com-metodos-em-java/25917); 
- [Encapsulamento das classes](https://www.youtube.com/watch?v=OTO1MBMmH9g); 
- [Coesão e acoplamento](https://www.devmedia.com.br/entendendo-coesao-e-acoplamento/18538);
- Uso da orientação a objeto (Classe, Método, Herança, Polimorfismo, Encapsulamento e etc...);
- Se todas as regras e funcionalidades descritas nesse arquivo estão de acordo;
- Qualidade do código de uma maneira geral;

***Material de Apoio***

- [Estrutura de um projeto Maven](https://www.youtube.com/watch?v=ZQICkNszEuI);
---

### FASE 2

***Objetivo:*** Precisamos testar a nossa aplicação e para isso, a ideia é utilizar o conceito de testes automatizados !

***Aprendizado:*** A idéia aqui é treinar conceitos relacionados a testes e a qualidade do software de uma maneira geral.

Implementes testes automatizados para os tipos de calculo e para as validações.

***Recomendações:***

- Como Framework de teste, utilize o [Junit 5](https://junit.org/junit5/).
- Para mockar os objetos, utilize o framework [Mockito](https://site.mockito.org/).
- Nos testes unitários, não subir o contexto do Spring (SpringBootTest);

***Material de Apoio:***

- [Testes unitários com Junit 5](https://www.devmedia.com.br/teste-unitario-com-junit/41235);
- [Usando Junit5 e Mockito](https://www.youtube.com/watch?v=rVSwDX9KUt8);
- [Testes com SpringBoot](https://dev.to/wesleyegberto/spring-boot-estrategias-para-testar-rest-api-2nc6);

### O que será avaliado ?

- Qualidade dos testes;
- Cobertura de testes;

---

### FASE 3

***Objetivo:*** A ideia agora é implementar apis para nossa aplicação utilizando Spring Framework e não mais utilizar a impressão pelo console.

***Aprendizado:*** A idéia aqui é consolidar os conceitos de Web e Apis Rest por meio do Spring Framework.

***Material de apoio:***
- [Arquitetura Cliente Servidor](https://www.youtube.com/watch?v=hlnejiv5ppw);
- ***[API REST: Princípios e boas práticas para serviços restful](https://smarti.blog.br/api-rest-principios-boas-praticas-para-arquiteturas-restful/)***;

Precisamos construir uma Api que nos forneça as seguintes funcionalidades:

Produto:

- Obter o produto por Id;
- Cadastrar um produto;
- Deletar um produto;
- Buscar todos os produtos cadastrados;

Cliente:

- Obter o cliente por Id;
- Cadastrar um cliente;
- Deletar um cliente;
- Buscar todos os clientes cadastrados;

Calculo de Frete:
- Calcular o frete informando como parametros o tipo de calculo a ser executado, o id do produto e o id do cliente;

### O que será avaliado ?

- Boas práticas de API;
- Testes das Apis;

---

### FASE 4

***Objetivo:*** Agora vamos alterar o cadastro do nosso cliente para que seja necessario enviar apenas o cep e o restante dos dados sejam obtidos através de uma api de terceiros (uf, logradouro, bairro cidade e etc...).

***Aprendizado:*** A idéia é aprender a consumir uma api rest de terceiros.

***Obs:*** 
- Crie um modulo maven separado cada se comunicar com a api;
- Utilizar o novo [HttpClient do Java 11](https://mkyong.com/java/java-11-httpclient-examples/); 
- [Documentação da api de ceps](https://apicep.com/api-de-consulta/);

### O que será avaliado ?

- Qualidade do código;
- Boas práticas no consumos de Apis (Configuração de timeout e etc ..);

---

### FASE 5

***Objetivo:*** Agora vamos trabalhar com banco de dados na nossa aplicação. Para isso, vamos fazer uso de 2 tipos de banco, um relacional (H2) e outro não relacional (MongoDb).

***Aprendizado:*** A idéia é consolidar os conceitos de base de dados relacionais e não relacionais (NoSql).

***Obs:*** Crie um modulo maven separado cada banco. 

### O que será avaliado ?

- Conexão com banco de dados;
- Utilização de banco de dados com a API;