<?php

// Conexão com o Banco de Dados

require_once('dbConnect.php');

// Definir UTF8 para a conexão

mysqli_set_charset($conn, $charset);

// Prepara a consulta SQL

$stmt = mysqli_prepare($conn, "SELECT id, sigla, nome FROM estado");


// Executa a consulta

mysqli_stmt_execute($stmt);

// Salva o resultado da consulta

mysqli_stmt_store_result($stmt);

// Gera os dados a serem apresentados
// em variáveis conforme o select.

mysqli_stmt_bind_result($stmt, $id, $sigla, $nome);

// apresenta os dados da consulta

var_dump($stmt);

?>
