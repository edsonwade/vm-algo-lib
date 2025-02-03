**Algoritmo de Pesquisa Linear**

**Definição**: A pesquisa linear é um algoritmo de pesquisa simples usado para encontrar um elemento específico numa
lista. Funciona verificando sequencialmente cada elemento da lista até que o elemento desejado seja encontrado ou a
lista termine.

**Características**:

- **Elementos Não Ordenados**: Pode ser usado em listas onde os elementos não estão ordenados.
- **Sem Repetição**: Funciona em listas sem elementos repetidos, mas também pode lidar com listas com duplicados. 

**Complexidade Temporal**:

- **Pior Caso**: \(O(N)\) - O algoritmo pode precisar verificar todos os elementos da lista.
- **Melhor Caso**: \(O(1)\) - O elemento desejado é encontrado na primeira posição.

**Passos**:

1. Comece pelo primeiro elemento da lista.
2. Compare o elemento atual com o elemento alvo.
3. Se o elemento atual corresponder ao alvo, retorne o seu índice.
4. Se o elemento atual não corresponder, passe para o próximo elemento.
5. Repita os passos 2-4 até que o elemento seja encontrado ou a lista termine.
6. Se o elemento não for encontrado, retorne -1.

**Exemplo**:

```java
public class LinearSearchLS {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = linearSearch(number, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearSearch(int[] number, int target) {
        if (number.length == 0) {
            return -1;
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
```

---

**Algoritmo de Pesquisa Binária**

**Definição**: A pesquisa binária é um algoritmo de pesquisa eficiente usado para encontrar um elemento específico numa
lista ordenada. Funciona dividindo repetidamente o intervalo de pesquisa ao meio.

**Características**:

- **Elementos Ordenados**: Requer que a lista esteja ordenada.
- **Dividir e Conquistar**: Reduz o espaço de pesquisa pela metade a cada passo.

**Complexidade Temporal**:

- **Pior Caso**: \(O(\log N)\) - O algoritmo divide o espaço de pesquisa pela metade a cada vez.
- **Melhor Caso**: \(O(1)\) - O elemento desejado é encontrado na posição do meio.

**Passos**:

1. Comece com a lista inteira.
2. Encontre o elemento do meio da lista.
3. Compare o elemento do meio com o elemento alvo.
4. Se o elemento do meio corresponder ao alvo, retorne o seu índice.
5. Se o elemento do meio for maior que o alvo, repita o processo na metade esquerda da lista.
6. Se o elemento do meio for menor que o alvo, repita o processo na metade direita da lista.
7. Repita os passos 2-6 até que o elemento seja encontrado ou o intervalo de pesquisa esteja vazio.
8. Se o elemento não for encontrado, retorne -1.

```java
public class BinarySearchBS {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(number, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] number, int target) {
        int left = 0; // Índice do primeiro elemento
        int right = number.length - 1; // Índice do último elemento
        if (number.length == 0) {
            return -1;
        }
        // Pesquisa binária enquanto o intervalo de pesquisa não estiver vazio 
        while (left <= right) {
            int mid = (left + right) / 2; // Encontra o elemento do meio
            if (number[mid] == target) {
                return mid; // Elemento encontrado
                // Se o elemento do meio for menor que o alvo, pesquisa na metade direita 
            } else if (number[mid] < target) {
                left = mid + 1; // Pesquisa na metade direita
            } else {
                right = mid - 1; // Pesquisa na metade esquerda
            }
        }

        return -1;
    }
}
```