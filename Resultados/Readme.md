# Resultados da execução do gRPC em multiplataformas (Linux BBB, Android BBB, Android Otimizado BBB e APP em Kotlin no Smartphone)

- **Do que se trata?**
Foi construído um programa simples de multiplicação de matrizes de ordem alta em diversas linguagens. Dentre elas podemos destacar **Python**, **C++**, **Java**, **Ruby** e **Go**. Cada uma das linguagens foi utilizado o gRPC para chamadas de procedimento remoto cliente/servidor entre a BeagleBone Black e um aplicativo feito em Kotlin num Smartphone Android de uso pessoal. Foi construído um script em Python que permitiu a execução automática dos programas em tempo real, sem o processo manual de executar e escrever numa planilha os tempos de cálculo. Foram realizados 100 execuções para cada linguagem e o tempo de cada uma foi escrito numa planilha. Ao total, temos 1500 dados de execução em segundos.  

- **Arquivo AndroidBBB-KotlinApp.ods**
É a planilha cujos testes foram feitos usando um S.O Android robusto para a BeagleBone Black (Servidor) e um aplicativo Android em Kotlin (Cliente). 

- **Arquivo DriedAndroidBBB-KotlinApp.ods**
É a planilha cujos testes foram feitos usando um S.O Android otimizado para a BeagleBone Black (Servidor) usando o Yocto Project e um aplicativo Android em Kotlin (Cliente). 

- **Arquivo linuxBBB-KotlinApp.ods**
É a planilha cujos testes foram feitos usando o Linux nativo da BeagleBone Black (Servidor) e um aplicativo Android em Kotlin (Cliente). 


Abaixo está o esquema do App. O usuário entra com o IP e a porta do servidor. O resultado mostrado para o usuário é a multiplicação das matrizes.

<p align="center">
  <img src="https://imageshack.com/a/img924/6927/M6JvB6.png" alt="my alt text">
</p>
