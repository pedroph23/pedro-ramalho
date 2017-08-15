<!DOCTYPE html>

<html>
	<head>
	<ttle>Cadastro de Carros</ttle>
	     <meta charset="UTF-8">
		<link rel= "stylesheet"  href="/opt/lampp/htdocs/Style.css"  />
		<link rel= "stylesheet"  href="/opt/lampp/htdocs/PhpEMysql/css/bootstrap.css"  />
	</head>

	<body>
				<div class="container" >
				 <div class="principal">
					<?php

					    $nomeCarro = $_GET['nomeCarro'];
					    $precoCarro= $_GET['precoCarro'];
					?>


			   		 <h1> Carros Cadastrados </h1>
			   
			    	 <h4 class="alert-success">Nome do Carro: <?= $nomeCarro?>,Preço do Carro: <?= $precoCarro ?></h4><br/>

			    </div>
			    </div>

	</body>

</html>
