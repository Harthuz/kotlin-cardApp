# **Form App - Projeto de Treinamento Android Developer**

## **Descrição do Projeto**

Este projeto foi desenvolvido como parte do treinamento Android Developer oferecido pela Google. O objetivo é criar um aplicativo simples utilizando **Jetpack Compose** para a construção da interface de usuário de um formulário básico, com elementos como **Text**, **Image** e **Spacer** para o espaçamento entre elementos.

A estrutura do aplicativo inclui a exibição de uma imagem de fundo, seguida de um título e dois parágrafos. A interface é configurada para ocupar toda a tela do dispositivo, aproveitando o conceito de **Edge to Edge**.

### **Funcionalidades Principais:**
- Exibição de uma **imagem de fundo**.
- Exibição de um **título**.
- Exibição de **parágrafos de texto** justificados.
- Layout responsivo que se adapta a diferentes tamanhos de tela.

---

## **Arquitetura e Componentes**

### **1. MainActivity:**
A `MainActivity` é a entrada principal do aplicativo, onde é configurado o conteúdo da tela com o tema `FormTheme`. O layout é estruturado usando o **Scaffold**, um componente do Material Design que fornece uma estrutura básica para o conteúdo da tela.

- **enableEdgeToEdge**: Permite que a interface ocupe toda a tela, removendo as margens padrão.
- **setContent**: Define o conteúdo da tela, aplicando o tema e exibindo a função composable `formApp`.

### **2. Função formApp:**
Esta função composable define a estrutura do layout, que é composta por uma **Column** contendo várias linhas de elementos (Row):
- **Imagem**: Utiliza a função `Image` para exibir uma imagem de fundo, com **ContentScale.Fit** para garantir que a imagem seja redimensionada corretamente.
- **Título**: Um **Text** que exibe o título principal, com o estilo configurado para tamanho de fonte 26sp.
- **Parágrafos**: Dois textos com alinhamento **Justify** para garantir que o texto ocupe toda a largura disponível, com a fonte definida para 16sp.

### **3. Layout e Estilo:**
- **Spacer**: Utilizado entre os elementos para adicionar espaçamento vertical.
- **Modifier**: Vários modificadores são usados para aplicar estilos como preenchimento (padding) e ajuste de tamanho (fillMaxWidth, fillMaxSize).
- **TextAlign**: Usado para justificar o texto nos parágrafos, garantindo que o conteúdo ocupe a largura total disponível na tela.

---

## **Estrutura do Projeto**

- **MainActivity.kt**: Arquivo principal que define a interface do usuário e a lógica da tela.
- **ui.theme.FormTheme**: Tema personalizado aplicado a todo o aplicativo.
- **strings.xml**: Arquivo de recursos onde estão armazenadas as strings usadas no aplicativo, como os textos do título e dos parágrafos.
- **drawable/bg_compose_background**: Imagem de fundo usada no layout.

---

## **Como Rodar o Projeto:**
1. Clone o repositório ou baixe o código fonte do projeto.
2. Abra o projeto no **Android Studio**.
3. Compile e execute o aplicativo no **emulador** ou em um dispositivo Android.

---

## **Resultado Esperado**
Ao executar o aplicativo, o usuário verá uma tela com:
- Uma imagem de fundo.
- Um título "Form App".
- Dois parágrafos de texto justificados, com o layout adaptado para ocupar toda a tela do dispositivo.
