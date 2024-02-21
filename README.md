# Tutorial: Criando um Aplicativo CRUD com Spring Boot

## Introdução
Neste tutorial, você aprenderá como criar um aplicativo CRUD (Create, Read, Update, Delete) básico usando Spring Boot e MySQL. Um aplicativo CRUD é essencial para muitos sistemas, pois permite a manipulação de dados de uma maneira intuitiva e eficiente.

## Ferramentas Utilizadas
- **Spring Boot**: Um framework Java que facilita a criação de aplicativos Java de maneira rápida e simples.
- **H2 Database**: Um banco de dados em memória amplamente utilizado para desenvolvimento e teste de aplicativos Java.
- **Maven**: Uma ferramenta de automação de compilação e gerenciamento de dependências para projetos Java.
- **IDE de sua escolha**: Para desenvolvimento de código. Recomenda-se o Visual Studio Code, mas qualquer IDE pode ser usada.

## Passo a Passo Configurações
### 1. Configuração do Ambiente
Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
Instale uma IDE de sua preferência, se ainda não tiver uma.

### 2. Criação do Projeto Spring Boot
- Abra um navegador da web e vá para o [site oficial do Spring Initializr](https://start.spring.io/).
- Configure seu projeto Spring Boot selecionando as dependências e configurações desejadas.
- Após configurar seu projeto, clique no botão "Generate" para baixar um arquivo ZIP contendo o esqueleto do seu projeto Spring Boot.
- Extraia o arquivo ZIP em um diretório de sua escolha e abra o projeto em sua IDE.
![Captura de tela 2024-02-21 132119](https://github.com/OstroskiAllan/CRUD-spring-boot/assets/63799954/cc9383b9-55b6-4dca-aa93-e6097b392c50)

### 3. Configuração do Banco de Dados
- Configure as propriedades do banco de dados no arquivo `application.properties` para se conectar ao seu banco H2.
- Certifique-se de ter criado o banco de dados que será utilizado pelo aplicativo.
![Captura de tela 2024-02-21 140554](https://github.com/OstroskiAllan/CRUD-spring-boot/assets/63799954/0e5b82dc-4d3f-4741-ab86-2890e8c4d696)

### 4. Configuração do `pom.xml`
- Como antes comentado sobre as dependências irei deixar as mesmas usadas no projeto. Se caso estiver usando o Visual Studio Code, conforme voce vai acrescentando elas a IDE ja vai construindo o projeto conforme alterado. Voce pode conferir elas no arquivo pom.xml do repositório.


### 5. Criação da Entidade
- Crie uma classe Java para representar a entidade que será manipulada pelo aplicativo.
- Anote a classe com `@Entity` e adicione outras anotações JPA conforme necessário para mapeamento de banco de dados.
![Captura de tela 2024-02-21 141737](https://github.com/OstroskiAllan/CRUD-spring-boot/assets/63799954/652bc937-5aa5-4c20-9957-10a89cabad4c)

### 6. Criação do Repositório
- Crie uma interface que estenda `JpaRepository` ou `CrudRepository` para a entidade criada anteriormente.
- Esta interface fornece métodos para realizar operações CRUD no banco de dados.
![Captura de tela 2024-02-21 141847](https://github.com/OstroskiAllan/CRUD-spring-boot/assets/63799954/03719473-b44c-4e8e-8fb2-956dfdff4894)

### 7. Criação dos Controladores
- Crie controladores para lidar com as requisições HTTP relacionadas às operações CRUD.
- Anote os métodos nos controladores com `@PostMapping`, `@GetMapping`, `@PutMapping`, `@DeleteMapping` conforme apropriado.
![Captura de tela 2024-02-21 144733](https://github.com/OstroskiAllan/CRUD-spring-boot/assets/63799954/fa8793df-fc9b-45cd-ab9a-4fcb3032ea41)

### 8. Testando o Aplicativo
- Inicie o aplicativo e teste as operações CRUD usando a ferramenta Postman.
- Faça as requisições HTTP seguindo as rotas definidas nos controladores.

## Conclusão
Neste tutorial, você aprendeu como criar um aplicativo CRUD básico usando Spring Boot e H2 Database. Você agora tem uma base sólida para expandir e personalizar o aplicativo de acordo com suas necessidades específicas.
