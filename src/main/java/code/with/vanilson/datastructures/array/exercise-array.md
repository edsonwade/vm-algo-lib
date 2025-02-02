# Exercício 1: Encontrar um número em um array

- **Problema**:
  Dado um array de números inteiros, determine se um número específico está presente no array ou não.

- **Passos para pensar**:

    1. Como acessar os elementos do array um por um?
    2. Como comparar cada elemento com o número procurado?
    3. Como saber se o número foi encontrado ou não?

## Exercício 2: Contar quantas vezes um número aparece em um array

- **Problema**:
  Dado um array de números inteiros, contar quantas vezes um número específico aparece no array.

- **Passos para pensar**:

    1. Como percorrer o array inteiro?
    2. O que fazer quando encontramos o número desejado?
    3. Como manter a contagem?

## Exercício 3: Encontrar o maior número em um array

- **Problema**:
  Dado um array de números inteiros, encontre o maior número presente nele.

- **Passos para pensar**:

    1. Como inicializar a variável que armazenará o maior número?
    2. Como comparar cada número com o maior número encontrado até agora?
    3. Como atualizar o maior número quando encontramos um número maior?

## Exercício 4: Criar um novo array apenas com os números pares

- **Problema**:
  Dado um array de números inteiros, crie um array contendo apenas os números pares do array original.

- **Passos para pensar**:

    1. Como identificar se um número é par?
    2. Como armazenar os números pares em um novo array?
    3. Como determinar o tamanho do novo array se não sabemos quantos números pares existem antes de percorrer o array
       original?
       Problema:

Dado um array de números inteiros, queremos criar um novo array que contenha apenas os números pares do array original.
Passos para pensar no problema

1️⃣ Identificar o que queremos extrair

    Queremos somente os números pares.
    Como sabemos se um número é par? Se ele for divisível por 2 (ou seja, número % 2 == 0).

2️⃣ Precisamos armazenar esses números

    Mas quantos números pares existem no array? Não sabemos de antemão!
    Então, primeiro precisamos contar quantos números pares existem.

3️⃣ Criar um novo array do tamanho correto

    Depois de contar quantos números pares temos, podemos criar um novo array do tamanho exato.

4️⃣ Preencher o novo array com os números pares

    Percorremos o array original novamente e salvamos apenas os números pares no novo array.

Resumo do raciocínio sem código

1️⃣ Percorremos o array e contamos quantos números pares existem.
2️⃣ Criamos um novo array do tamanho exato para armazenar esses números pares.
3️⃣ Percorremos o array novamente, pegamos os números pares e colocamos no novo array.
4️⃣ Retornamos o novo array contendo apenas os números pares.

1️⃣ Primeiro loop → Conta quantos números pares existem para saber o tamanho do novo array.
2️⃣ Criar o novo array → O tamanho dele será exatamente o número de pares encontrados.
3️⃣ Segundo loop → Percorre novamente o array original e adiciona os números pares ao novo array.

    Aqui precisamos de um índice separado (indexNovoArray por exemplo) para controlar as posições do novo array.

## Exercício 5: Inverter um array

**Problema**:
Dado um array, retorne um novo array com os elementos na ordem inversa.

- **Passos para pensar**:

    1. Como acessar os elementos do final para o início?
    2. Como armazenar os valores na nova ordem?
    3. Como evitar sobrescrever valores do array original?

## Exercício 6: Criar um array apenas com os números ímpares

📌 **Problema**:
Dado um array de números inteiros, crie um array contendo apenas os números ímpares do array original.

- **Passos para pensar**:

    1. Como identificamos um número ímpar?
    2. Como determinar o tamanho do novo array?
    3. Como percorrer e armazenar os números ímpares no novo array?

Resumindo:

1️⃣ Identificação de ímpares:
Em vez de verificar numbers[i] % 2 == 0 (para os pares), você verifica se numbers[i] % 2!= 0 (para os ímpares). Isso vai
garantir que o número seja ímpar.

2️⃣ Novo array:

    Como não sabemos quantos números ímpares existem, você vai primeiro fazer um loop para contar quantos existem.
    Depois, você cria um novo array com esse tamanho (igual à quantidade de ímpares encontrados).

3️⃣ Armazenamento no novo array:

    Depois de contar os ímpares, você faz um segundo loop para colocar os números ímpares no novo array.
    Lembre-se de usar um índice separado para o novo array, porque o array de ímpares não vai começar na posição 0 (senão você sobrescreveria os valores anteriores!).

## Exercício 7: Criar um array apenas com números maiores que um valor X

📌 Problema:
Dado um array de números inteiros e um número X, crie um array contendo apenas os números maiores que X.

Passos para pensar:

    Como decidir se um número entra no novo array?
    Como contar quantos números são maiores que X?
    Como armazenar esses números no novo array?

## Exercício 8: Contar quantas vezes cada número aparece no array

📌 Problema:
Dado um array de números inteiros, conte quantas vezes cada número aparece e exiba os resultados.

Passos para pensar:

    Como armazenar a contagem de cada número?
    Como percorrer o array e atualizar as contagens?
    Como garantir que cada número só seja contado uma vez?

## Exercício 9: Encontrar o segundo maior número no array

📌 Problema:
Dado um array de números inteiros, encontre o segundo maior número sem ordenar o array.

Passos para pensar:

    Como encontrar o maior número?
    Como garantir que o segundo maior seja diferente do primeiro?
    Como percorrer o array sem precisar ordená-lo?

## Exercício 10: Encontrar o segundo maior número em um array

    Problema: Dado um array de números inteiros, encontre o segundo maior número.
        Dica: Para isso, você pode percorrer o array uma vez, mantendo o maior e o segundo maior número. No final, você terá os dois.

## Exercício 12: Contar os números negativos em um array

**Problema**: Dado um array de inteiros, conte quantos números negativos ele contém.
Dica: Percorra o array e, para cada número, verifique se é negativo (menor que zero).

## Exercício 13: Reverter um array

**Problema**: Dado um array de números inteiros, inverta os elementos do array.
Dica: Percorra o array do começo ao fim, mas adicione os elementos ao novo array de trás para frente. Isso pode ser
feito alterando o próprio array ou criando um.

## Exercício 14: Remover duplicatas de um array

**Problema**: Dado um array de números inteiros, remova os números duplicados, mantendo apenas um de cada número.
Dica: Isso pode ser feito criando um array ou lista, verificando, para cada elemento, se ele já foi adicionado.

## Exercício 15: Verificar se o array está ordenado

**Problema**: Dado um array de números inteiros, verifique se o array está em ordem crescente.
Dica: Percorra o array e compare cada elemento com o próximo. Se algum número for maior que o próximo, o array não está
ordenado.

## Exercício 16: Soma dos números em um array

**Problema**: Dado um array de números inteiros, calcule a soma de todos os números.
Dica: Percorra o array e adicione cada valor à uma variável acumuladora.

## Exercício 17: Encontrar o número mais frequente em um array

**Problema**: Dado um array de números inteiros, encontre o número que aparece com mais frequência.
Dica: Crie um contador de frequências e percorra o array para contar quantas vezes cada número aparece. O número com o
maior contador será o mais frequente.

## Exercício 18: Buscar um valor no array

**Problema**: Dado um array de números inteiros, verifique se um número específico existe no array.
Dica: Percorra o array e, para cada elemento, verifique se ele é igual ao número procurado.