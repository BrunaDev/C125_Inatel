## Exercício 1 – Space Shooter!

### Crie classes Java que sigam o UML apresentado a seguir: 
Temos uma estrutura de Classes e uma de Pacotes.

<p> Faça os seguintes testes: </p>
<p>- A Nave pode invocar o método atirar(), recebendo como parâmetro um Asteroide;
<p>- Existem dois tipos de asteroides: Pequeno e Grande;
<p>- A nave possui dois tipos de tiro: Normal e Explosivo;
<p>- Asteroides do tipo “Grande” são destruídos apenas com Naves que possuem um tipo de tiro “Explosivo”;
<p>- Se o Asteroide for destruído, ele chama o método destruir(), que apenas imprime uma mensagem.

<p> Crie getters e setters que julgar necessário! </p>

_OBS:_ No diagrama de classes UML, quando temos uma seta, é uma relação de dependência. Assim, Nave depende de Asteroide. Pois um método da classe Nave, recebe uma variável do tipo Asteroide. Mas não temos um membro na classe Nave do tipo Asteroide, por isso não temos uma agregação e/ou composição!

![image](https://user-images.githubusercontent.com/72671246/230746238-9f0cae16-9d07-472e-b849-74d1f8701dfb.png)
