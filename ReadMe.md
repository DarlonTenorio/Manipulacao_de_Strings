## Explicação do código ##

### Esse código trata-se de uma sequência de chamadas usando métodos e manipulação de strings ###


Esse código é uma implementação de duas classes em Java,`Va1` e `Va2`. A classe Va1 tem três métodos: `getStr`, `ini` e `fin`. O método `getStr` retorna uma string **"abcdefghijklmnop"**. O método `ini` retorna uma substring da string fornecida como entrada, com tamanho especificado pelo parâmetro `cpr`. O método `fin` retorna uma string que é a concatenação de duas substrings da string fornecida como entrada: a primeira `cpr` caracteres da string original e as últimas `cpr` caracteres da string original.

<hr/>
#### Explicando de uma maneira mais nerd ####
- Primeiramente, é criada uma classe chamada "Main", que possui um método main estático(_static void main_) para iniciar a execução do código. Dentro desse método main criamos um objeto "o" da classe `Va2` com a referência ao tipo `Va1`. Em seguida, chamamos o método `fin()` passando o objeto **"o"** e o retorno de **o**.`getStr()` com o argumento `"cpr"` sendo 5.

- A classe Va1 possui dois métodos, o `getStr()` e o ini(). O método `getStr()` retorna a string "abcdefghijklmnop" e o método ini() retorna uma sub-string de uma string de entrada, com base na posição inicial e final definida pelo argumento "cpr".

- Depois, temos uma classe interna chamada Va2 que estende a classe Va1 e sobrepõe o método `getStr()` para retornar a string _"0123456789ABCDEF"_. Além disso, o método ini() é redefinido para retornar uma sub-string de uma string de entrada a partir da posição final.

- O método `fin()` retorna a concatenação de duas sub-strings, uma retornada pelo método `ini()` e outra retornada diretamente da string original. A sub-string retornada pelo mét`ini()` é calculada a partir da posição final da string original, com base no argumento `"cpr"`.

- Ao final, temos a saída "lmnoplmnop", que corresponde à concatenação de duas sub-strings de tamanho 5, ambas retiradas da string "0123456789ABCDEF".

- Em resumo, a saída _"lmnoplmnop"_ é resultado da manipulação de strings e da chamada de métodos na classe `Va2`", que herda comportamentos da classe `Va1`.


<br>
<br>
<br>
<br>
<br>
<blockquote>
<p>   Eu retirei esse código de uma questão do concurso público do banco do Brasil de 2021.<p>
<blockquote>