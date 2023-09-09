# SchoolBus 
### Projeto de Exercício incremental em Programação Orientada a Objetos.

## Exercício Incremental - Parte I - Identificação das Classes do SchoolBus,

O objetivo deste trabalho é desenvolver de forma incremental um projeto sobre o tema SchoolBus, onde abordará conceitos de programação orientada a objetos. Para este exercício é necessário que sejam identificadas as classes da aplicação conforme exercício feito em sala, modelo de classes UML (utilizando o BlueJ).

O SchoolBus é o contexto da aplicação que desejamos construir. Nesta aplicação, o objetivo é permitir que a secretaria de educação (estadual ou municipal) possa gerenciar e controlar o acesso de alunos da rede pública (municipal ou estadual) às linhas de transporte escolar oferecidas para levar o aluno de casa até a escola. A secretaria pode cadastrar alunos, veículos, motoristas e rotas oferecidas. A secretaria também deseja realizar a programação das viagens que deverá conter a rota, designação dos veículos que executará a viagem, o motorista responsável e o horário de início da viagem.

Os veículos devem conter todas as informações básicas como Placa, Ano, Modelo, capacidade (número de assentos). Os veículos podem ser próprios (da própria secretaria) ou alugados. No caso dos veículos alugados, eles devem indicar o número do contrato a que ele está associado.

Para os motoristas, devem ser cadastradas as informações de dados pessoais (nome civil, nome social, CPF, nome do pai e nome da mãe e naturalidade), dados de contato (telefone, endereço) e número e a categoria da habilitação. Os motoristas podem ser servidores da secretaria ou terceirizados. Em sendo terceirizado, o motorista também deve estar ligado a um contrato.

Para os alunos deve-se cadastrar as informações de dados pessoais (nome civil, nome social, CPF, nome do pai e nome da mãe e naturalidade), dados de contato (telefone, endereço), dados acadêmicos (matrícula, série e escola, turno) e rota. Aos alunos de escola privada deve-se cadastrar o Número de Identificação Social (NIS).

A escola pode ser pública (federal, estadual ou municipal) ou privada e deve ter nome, CNPJ e dados de contato (telefone, endereço).

## Exercício Incremental - Parte II - Implementação das Classes Veículo e Motorista

Continuando a nossa proposta de desenvolvimento incremental do projeto SchoolBus, após a identificação das classes feita por vocês na Etapa I, faremos a implementação de duas dessas classes na Etapa II.

Chamaremos de Veículo a classe que representa o veículo que levará o aluno de casa até a escola e chamaremos de Motorista a classe que representa a pessoa responsável por conduzir o Veículo.

### As seguintes atividades devem ser realizadas na Etapa II:

#### Criar a classe Motorista com os seguintes atributos:

 - nome_civil (nome civil do motorista): tipo String

 - nome (nome social do motorista): tipo String

 - Caso o nome social não seja informado, este deve ser preenchido com o nome civil.

 - mãe (nome da mãe do motorista): tipo String

 - pai (nome do pai do motorista): tipo String

 - naturalidade (cidade onde o motorista nasceu): tipo String

 - cpf_cnpj (cpf no caso de pessoa física ou cnpj no caso de pessoa jurídica): tipo String

 - data_nascimento (data de nascimento do motorista): tipo Date

 - rua (nome da rua do motorista): tipo String

 - numero (número da casa do motorista): tipo Integer

 - complemento (complemento do endereço do motorista): tipo String

 - bairro (bairro do motorista): tipo String

 - telefone (telefone do motorista): tipo String

 - num_habilitacao (número da habilitação do motorista): tipo String

 - cat_habilitacao (categoria da habilitação do motorista): tipo String

 - tipo (servidor - 0 ou terceirizado - 1): tipo Integer

 - num_contrato (o número do contrato ao qual o motorista está associado - apenas para tipo = 1)

#### Criar a classe Veículo com os seguintes atributos:

 - placa: tipo String

 - ano (ano de fabricação do veículo): tipo Integer

 - modelo (modelo do veículo): tipo String

 - capacidade (número de assentos do veículo): tipo Integer

 - tipo (próprio - 0 ou alugado - 1): tipo Integer

 - num_contrato (o número do contrato ao qual o veículo está associado - apenas para tipo = 1)

 - A classe deve ter um ou mais construtores, além dos métodos acessores (gets e sets).

 - Na classe Motorista, escreva um método que verifique se o motorista é servidor ou terceirizado.

 - Na classe Veículo, escreva um método que verifique se o veículo é próprio ou alugado.

 - Em ambas as classes Motorista e Veículo, o método setNumContrato deve emitir a mensagem de erro "Método inválido." caso o tipo = 0.

 - Em ambas as classes Motorista e Veículo, o construtor deve exigir o número do contrato para motorista terceirizado e veículo alugado. Já quando o motorista for servidor ou o veículo for próprio o atributo num_contrato não deve ser iniciado.

 - O exercício deve ser entregue em uma pasta compactada .zip ou .rar contendo as implementações.
