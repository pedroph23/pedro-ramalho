<?php include("cabecalho.php"); ?>

<?php
$nome = $_GET["nome"];
$preco = $_GET["preco"];

"insert into  bd_lojarros(nome,preco) values ('{$nome}',{$preco})"
mysqli_connect('localhost','root','','bd_lojaCarros');


?>

<p class="alert-success">
    Produto <?= $nome; ?>, <?= $preco; ?> adicionado com sucesso!
</p>

<?php include("rodape.php"); ?>
