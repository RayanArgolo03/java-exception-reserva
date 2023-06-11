# Sistema de Reserva de Hotel com Tratamento de Exceções

Este é um projeto Java que implementa um sistema de reserva de hotel com tratamento de exceções. O sistema permite que os usuários registrem e atualizem reservas de quartos, verifiquem a duração da estadia e exibam os detalhes da reserva.

## Descrição

O projeto consiste em três classes principais:

- `Main`: classe principal que contém o método `main` para executar o programa. Nesta classe, os usuários podem registrar uma nova reserva, atualizar as datas da reserva e lidar com exceções relacionadas a dados inválidos.

- `Reserva`: classe que representa uma reserva de quarto de hotel. Ela possui atributos como número do quarto, data de check-in e data de check-out. A classe possui métodos para calcular a duração da estadia e atualizar as datas da reserva. Também inclui tratamento de exceções personalizadas para lidar com datas inválidas.

- `DataInvalidaReservaException`: exceção personalizada que estende a classe `Exception`. É lançada quando ocorre uma operação de reserva com datas inválidas, como data de check-out anterior à data de check-in ou tentativa de atualização com datas anteriores às datas atuais.

## Funcionalidades

O sistema de reserva de hotel com tratamento de exceções possui as seguintes funcionalidades:

- Registrar uma nova reserva de quarto de hotel, solicitando informações como número do quarto, data de check-in e data de check-out.
- Calcular a duração da estadia com base nas datas de check-in e check-out.
- Atualizar as datas de check-in e check-out de uma reserva existente, garantindo que as novas datas sejam válidas.
- Lidar com exceções personalizadas relacionadas a datas inválidas durante o registro e atualização das reservas.
- Exibir os detalhes da reserva, incluindo o número do quarto, as datas de check-in e check-out e a duração da estadia.

## Utilização

1. Execute o programa na classe `Main`.
2. Siga as instruções exibidas no console para registrar uma nova reserva de quarto de hotel, informando o número do quarto, a data de check-in e a data de check-out.
3. A reserva será exibida com os detalhes, incluindo o número do quarto, as datas de check-in e check-out e a duração da estadia.
4. Entre com as novas datas de check-in e check-out para atualizar a reserva existente.
5. Caso ocorra algum erro relacionado a datas inválidas, a mensagem de erro apropriada será exibida.
6. O programa será encerrado após a atualização ou quando ocorrer um erro inesperado.
