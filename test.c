#include <stdio.h> 
//Standard Input Output Header Cabeçalho de Entrada e Saida Padrão 
//com ela podemos imprimir dados na tela como a função printf(), ler entrada com scanf(),
//ou trabalhar com arquivos , usando funções como fopen() fread(), fwrite(), fclose().

void saudacao() {
    printf("HELLO DIRETO DA FUNÇÃO!\n");
}

int main() {
    printf("OLÁ MUNDO!\n");
    saudacao();
    return 0;
}

//gcc nomearquivo.c -o nomeexecutavel  >> compila co código em um exe
//./nomeexecutavel >> executa o código em línux, bash
//nomeexecutavel >> executa o código no cmd
