# IFLogic

## Badges

![Java](https://img.shields.io/badge/Java-20-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-open%20source-blue)

---

# Descrição

O **IFLogic** é uma plataforma educacional desenvolvida com o objetivo de apoiar o processo de ensino e aprendizagem por meio da resolução de questões e atividades digitais.

A plataforma foi concebida inicialmente com foco no ensino de **matemática e outras áreas de exatas**, oferecendo um ambiente em que estudantes podem praticar exercícios, acompanhar sua evolução e desenvolver habilidades de raciocínio lógico.

O sistema permite que alunos se cadastrem, participem de turmas vinculadas a instituições de ensino e resolvam questões organizadas por níveis de dificuldade e conteúdos específicos. Professores podem acompanhar o desempenho dos estudantes e utilizar a plataforma como ferramenta de apoio pedagógico.

A aplicação foi construída utilizando **Java** com o framework **Spring Boot**, adotando uma arquitetura baseada em APIs REST, organização em camadas e boas práticas de desenvolvimento de software. Essa estrutura permite que o sistema seja escalável, organizado e adequado para evolução futura.

Além de sua função educacional, o IFLogic também possui um forte caráter acadêmico e experimental, sendo utilizado como base para estudos, experimentação tecnológica e participação de estudantes no desenvolvimento do próprio sistema.

---

# Objetivos

## Objetivos do Projeto

O IFLogic busca contribuir para o ensino de matemática e raciocínio lógico através de uma plataforma digital que estimule a prática contínua e o acompanhamento do aprendizado.

Entre os principais objetivos estão:

• oferecer um ambiente digital para prática de exercícios de matemática e lógica  
• apoiar professores no acompanhamento do desempenho dos alunos  
• estimular o aprendizado por meio da resolução de problemas  
• incorporar elementos de gamificação para aumentar o engajamento dos estudantes  
• facilitar o acesso a conteúdos organizados por temas e níveis de dificuldade
• oferecer trilhas de aprendizagem especificos para cada conteúdo

## Código Aberto e Participação dos Alunos

Um dos princípios fundamentais do IFLogic é ser um projeto **de código aberto com finalidade educacional**.

O sistema foi concebido para que **outras escolas públicas possam utilizar o código como material de estudo**, permitindo que professores e estudantes compreendam como uma plataforma educacional pode ser construída.

Além disso, a abertura do código permite que alunos interessados em programação possam:

• estudar a arquitetura e a implementação do sistema  
• modificar funcionalidades existentes  
• criar novas funcionalidades  
• desenvolver versões próprias da plataforma  

Essa abordagem promove aprendizado prático em programação e incentiva a cultura de colaboração e compartilhamento de conhecimento.

---

# Instalação

## Pré-requisitos

Para executar o projeto localmente é necessário possuir os seguintes softwares instalados:

• Java 17 ou superior  
• Maven ou Gradle  
• Git  
• Uma IDE de desenvolvimento como IntelliJ IDEA, Eclipse ou Visual Studio Code  

## Clonando o repositório

```bash
git clone https://github.com/VitaoIF/IFLogic.git
cd IFLogic
````

## Executando o projeto

Caso o projeto utilize Maven:

```bash
mvn spring-boot:run
```

Outra opção é executar diretamente a classe principal da aplicação anotada com `@SpringBootApplication` através da sua IDE.

Após iniciar a aplicação, o servidor será disponibilizado em:

```
http://localhost:8080
```

As configurações da aplicação, incluindo banco de dados e outras propriedades do sistema, podem ser ajustadas no arquivo:

```
src/main/resources/application.properties
```

---

# Instruções de Uso

Esta seção será utilizada para documentar os endpoints disponíveis na API do sistema.

Serão incluídos futuramente:

• lista de endpoints disponíveis
• exemplos de requisições
• exemplos de respostas da API
• parâmetros aceitos nas chamadas

---

# Metodologia

O desenvolvimento do IFLogic segue uma abordagem centrada nas necessidades reais de professores e estudantes.

A metodologia adotada envolve a identificação de dificuldades no processo de ensino e aprendizagem, especialmente no contexto do ensino de matemática e raciocínio lógico.

O processo de desenvolvimento inclui:

• diálogo com professores para compreender desafios pedagógicos
• observação das dificuldades enfrentadas pelos alunos durante o estudo
• definição de funcionalidades que possam auxiliar no processo de aprendizagem
• desenvolvimento iterativo do sistema com base nas necessidades identificadas

Essa abordagem permite que a plataforma evolua continuamente, buscando sempre contribuir de forma significativa para o processo educacional.

---

# Contribuição

Contribuições são bem-vindas. Desenvolvedores, estudantes e educadores podem colaborar com melhorias, correções ou novas funcionalidades.

Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua alteração
3. Realize as modificações desejadas
4. Envie um pull request com a proposta de melhoria

---

# Licença

Este projeto é disponibilizado como código aberto com fins educacionais, incentivando o estudo, a colaboração e o desenvolvimento de novas soluções tecnológicas voltadas para a educação.


