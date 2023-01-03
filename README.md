### 🤖 Teste automatizado em Java - Curso Iterasys 🦾
**_🏋🏻‍♂️Treino de teste automatizado em site Iterasys com uso da linguagem Java e framework Selenium, realizado durante a "Semana de testes WEB" promovida pela plataforma de cursos Iterasys, em Ago/22. 🏋_**
#### Funcionalidades testadas:
**🔍Pesquisa de Curso por nome em barra de pesquisa.**

**✔️ Interação com Curso "Início rápido em teste e QA".**

**🛒 Adicionar curso ao carrinho de compras.**

#### _A seguir algumas orientaões para replicação do código, citando os principais conceitos de cada método utilizado:_


**_💻 IDE :_ Eclipse IDE 2022‑12.**


**_FRAMEWORKS_**

**🎯 Selenium versão 3.141.59. _Disponível em: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java._**

**🎯 JUnit versão 4.12. _Disponível em: https://mvnrepository.com/artifact/junit/junit._**

>Em seu código os frameworks deverão ser adicionados no arquivo "pom.xml", como "dependencies". 

 **💥 CONCEITOS ÚTEIS 💥**
 
**✅ _@Before:_ Método de marcação de bloco do código que deve ser executado antes do teste. Este bloco pode marcar o início de uma classe externa a ser executada, uma variável ou uma lista que possa ser necessária para seu teste em questão.**


**✅ _@Teste:_  Método de marcação do seu bloco de teste automatizado.**

**✅ _@After:_ Método de marcação do bloco de código que será executado após todos os testes serem efetuados. Pode ser utilizado para liberar alguma variável da memória, reinicializar uma variável que sera utilizada em outro teste.**

 **_💥 PRINCIPAIS MÉTODOS UTILIZADOS: 💥_**

⚫️ **_System.setProperty:_** Indicação de qual **_browser_** de busca irá utilizar, sua localização em um diretório e sua versão.

⚫️ **_driver = new ChromeDriver( )_** : Objeto que cria uma ligação do Selenium com o Driver escolhido ( no caso o **Chrome**) para que o **browser** escolhido seja aberto corretamente.

⚫️ **_Manage:_** Método para gerenciamento de solicitações que serão executadas no Driver escolhido. No caso de nosso teste, ele está gerenciando o tempo médio proposto para o teste (60000 milliseconds) e também a maximização da janela do navegador do teste que será executado.

⚫️ **_driver.get (parâmentro)_** : Pesquisa na web do parâmetro escolhido. Em nosso caso é o endereço escolhido é uma **URL**.

⚫️ **_driver.findElement:_** Busca o elemento por parâmetro indicado, podendo ser **_Id, Css Selector ou XPath._**  

>O código para cada um desses parâmetros é encontrado através do botão _“Inspecionar”_ na página de teste do site em que para cada elemento apresentará a descrição do seu endereço em **Html**, que será utilizada).

⚫️ **_click( ) :_**  Utilizado para a ação de “clicar” em determinado elemento.

⚫️ **_assertEquals:_** Método que realiza comparações entre parâmetros propostos.

⚫️ **_getText:_** Método de para pesquisar o texto de proposto no parâmetro.

⚫️ **_sendKeys:_** Método para execução de escrita como se houvesse uma digitação de teclado.

⚫️ **_keys.chord:_** Escreverá letra por letra da frase que está sendo pesquisada.

**Baseando-se nos comandos acima podemos criar scripts de automação na Linguagem Java, utilizando Selenium e Junit. Todo o código possui também comentários em seu corpo para auxiliar em sua construção.**

_Gostou do conteúdo? Deixe sua ⭐️❤️_

