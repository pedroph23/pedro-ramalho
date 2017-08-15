<?php

 function somaArray(){

$soma=0;

for($i= 0;$i < sizeof($numeros);$i ++)
  {
    $soma = $soma + $numeros[$i];
    echo $soma;
  }

  return $soma;
}
 



?>