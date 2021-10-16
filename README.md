# EasyCoach API

Projeto de API com Spring Boot para curso de MBA Full Stack Developer da FIAP

### Documentação (Swagger)
http://localhost:8099/swagger-ui/

### Banco de dados
1. Instalar o MySQL
2. Criar usuário e senha "admin"
3. Criar banco "easycoachdb" `CREATE DATABASE easycoachdb;`

### Autenticação
- Foi utilizado o método de Bearer token, portanto deve-se adicionar no headers da requisicão o parâmetro: `Authentication: Bearer <token>` 
- Usuário e senha padrão "admin"