# 🎵 MelodyDB

Aplicação para armazenar dados de artistas e músicas preferidos em um banco de dados relacional, permitindo buscar informações por artistas e consultar dados sobre os mesmos através de integração com a API do ChatGPT.

---

## 📜 Descrição do Projeto

O projeto foi desenvolvido para praticar **modelagem de classes** e **relacionamentos** utilizando o **Spring Data JPA**, integrando com um banco **PostgreSQL** e com a **API do ChatGPT** para enriquecer as informações dos artistas cadastrados.

---

## 🔨 Objetivos

- Modelar entidades e relacionamentos entre **Artista** e **Música**.
- Garantir que uma música só seja salva caso o artista já esteja cadastrado.
- Implementar consultas utilizando **Derived Queries** e **JPQL** para:
  - Verificar se o artista já está cadastrado.
  - Buscar músicas de um determinado artista.
- Praticar o uso de **enum** para definir o tipo do artista (solo, dupla ou banda).
- Criar um **menu interativo** para cadastrar artistas, músicas e pesquisar por artistas.
- Integrar com a **API do ChatGPT** para buscar informações detalhadas sobre o artista.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **API do ChatGPT**
- **Maven**

---

## 📂 Estrutura Básica

- **Classe `Artista`** → Representa o artista, incluindo nome e tipo (enum: SOLO, DUPLA, BANDA).
- **Classe `Musica`** → Representa as músicas associadas a um artista.
- **Relacionamento** → Um artista pode ter várias músicas.
- **Classe Principal** → Contém o menu de opções:
  - Cadastrar artista
  - Cadastrar música
  - Pesquisar músicas por artista
- **CommandLineRunner** → Utilizado para chamar o menu na inicialização.

---


## 📌 Regras Importantes

- **Um artista precisa estar cadastrado antes de associar músicas a ele.**

- **A pesquisa por músicas é feita a partir do nome do artista.**

- **A integração com a API do ChatGPT retorna informações adicionais sobre o artista.**

---

## 💡 Aprendizados
**Este projeto reforça conceitos de:**

- **Modelagem de dados com JPA.**

- **Uso de enums.**

- **Relacionamento One-to-Many.**

- **Integração de APIs externas.**

- **Boas práticas no desenvolvimento com Spring Boot.**
