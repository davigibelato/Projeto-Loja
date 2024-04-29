/*drop database banco_ds;*/
create database banco_ds;
use banco_ds;

create table usuario (
	idUsuario int primary key auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(100) not null,
    cpf char(11) not null,
    telefone varchar(13)
);

create table endereco (
	idEndereco int primary key auto_increment,
    estado varchar(50) not null,
    cidade varchar(50) not null,
    cep char(9),
    rua varchar(100) not null,
    numero varchar(10) not null,
    complemento varchar(100)
);

create table categoria (
	idCategoria int primary key auto_increment,
    nome varchar(100) not null
);

create table produto (
	idProduto int primary key auto_increment,
    nome varchar(100) not null,
    valor float(10,2) not null,
    categoria int not null,
    imagem longblob,
    foreign key (categoria) references categoria(idCategoria)
);

create table estoque (
	idEstoque int primary key auto_increment,
    produto int not null,
    quantidade int not null,
    custo float(10,2) not null,
    foreign key (produto) references produto(idProduto)
);

create table pedido (
	idPedido int primary key auto_increment,
    usuario int not null,
    endereco_entrega int not null,
    data_pedido date not null,
    valorTotal float,
    foreign key (endereco_entrega) references endereco(idEndereco),
    foreign key (usuario) references usuario(idUsuario)
);

create table carrinho (
	idCarrinho int primary key auto_increment,
    usuario int,
    foreign key (usuario) references usuario(idUsuario)
);

create table carrinho_produto (
	idCarrinho_produto int primary key auto_increment,
    carrinho int not null,
    produto int not null,
    foreign key (carrinho) references carrinho(idCarrinho),
    foreign key (produto) references produto(idProduto)
);

create table produto_pedido (
	idProduto_pedido int primary key auto_increment,
    pedido int not null,
    produto int not null,
    foreign key (pedido) references pedido(idPedido),
    foreign key (produto) references produto(idProduto)
);

INSERT INTO categoria (nome) VALUES 
('Masculino'),
('Feminino'),
('Calçados'),
('Destaques');

INSERT INTO usuario (nome, email, senha, cpf, telefone) VALUES 
('davi', 'davi@example.com', 'davi', '12345678901', '11912345678');

INSERT INTO produto (nome, valor, categoria, imagem) VALUES 
('Camiseta Masculina', 140.00, 1, NULL),
('Camiseta Feminina', 100.00, 2, NULL),
('Tenis Ous', 240.00, 3, NULL),
('Tenis Hocks', 240.00, 4, NULL);