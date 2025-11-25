Design e arquitetura de software 

Abstração - é o ate de representar elementos do mundo real dentro do software. Em Java, por exemplo, é comum utilizar classes no pacote entiry para modelar entidades que correspondem aos dados existentes no banco de dados.

Princípios de Projeto de Código

São boas práticas que servem para guiar a forma como o desenvolvemos software. A ideia é deiar o sistema mais fácil de entender, manter e evoluir, usando conceitos como abstração, modularização, baixo acoplamento e alta coesão.

Organização por Camadas:

Controller = API Rest / HTML
Entity = Dados
Repository = con bd
Service = Lógica
Config = Centraliza as configurações das aplicações

Padronização de Código 

Tem a ver com seguir convenções de escrita e formatação para que todos programem de forma consistente. Isso ajuda na leitura e manutenção do projeto. Um exemplo simples é a convenção de nomes em Java, onde as classes usam CamelCase e as variáveis usam camelCase.

Ocultamento de Informações

Também chamado de encapsulamento, significa esconder detalhes internos de uma classe e expor apenas o que for realmente necessário. Isso evita que outras partes do sistema fiquem dependentes da implementação interna. Normalmente, fazemos isso declarando atributos como private e acessando-os por meio de métodos get e set 

Coesão

Está relacionada ao quanto os elementos de uma classe ou módulo trabalham em torno de uma única responsabilidade. Quanto maior a coesão, mais clara e organizada é a estrutura do código, o que facilita sua compreesão.

Acoplamento 

Mede o nível de dependência entre classes ou módulos. O ideal é manter um baixo acoplamento, para que cada parte do sistema funcione de forma independente, o que facilita tanto a manutenção quanto a possibilidade de reaproveitar o código em outros contextos.


Classe anêmica:
Classe que só tem o nome, os atributos e os getters e setters

Diagrama UML
Flecha Vazia Contínua: Herança Ex: "Cachorro é um Animal".
Flecha Vazia Pontilhada: Interface Ex: "Professor ensina Aluno".
Flecha Preenchida Contínua: Associação "Carro implementa Veículo".

Débito Técnico 

Débito técnico são partes do código que forma mal implementados e que, futuramente, podem causar problemas no sistema.

SOLID

O principal objetivo do SOLID é nos fazer utilizar a programação orienteada a objetos de forma correta, estruturando o código de forma coesa, desacoplada e flexível.

S - Single Responsibility Principle

O Príncipio da Responsabilidade Única diz que uma classe deve ter apenas um motivo para mudar, ou seja, deve ser responsável por apenas uma coisa dentro do sistema. Quando uma classe assume várias responsabilidades, ela fica mais difícil de entender, testar e manter. Seguindo esse princípio, cada classe foca em uma tarefa específica, deixando o código mais organizado e facilitando alterações.

I - Interface Segregation Principle

O Príncipio da Segregação da Interface afirma que uma classe não deve ser obrigada a implementar métodos que não utiliza. Em vez de criar interfaces muito grandes e genéricas, é melhor dividi-las em interfaces menores e mais específicas, para que cada classe implemente apenas o que realmente faz sentido para ela. isso evita código desnecessário e torna o sistema mais organizado a fácil de manter.

Arquitetura MVC é uma arquitetura utilizada para organizar melhor um projeto, dividindo suas responsabilidades.
M = Model = Dados da aplicação / Entidade
V = View = Interface
C = Controller = Intermediário entre o View e Model, organizando as informações, recebendo as informações dos usuários, depois chamando as partes certas do Model para resolver e entrega o resultado para o View.

Swing - Janela em JAVA

package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janelinha extends JFrame{

    private JButton botaozinho;
    private Controlador controlador;

    public Janelinha() {
        setTitle("Eu nao acredito");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaozinho = new JButton("ME CLICA");
        controlador = new Controlador();
        botaozinho.addActionListener(controlador);

        /*botaozinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oi");
            }
        });*/
        
        add(botaozinho);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
}

Princípio da inversão de dependência

O Princípio de Inversão de Dependência afirma que módulos de alto nível não devem depender diretamente de módulos de baixo nível, mas sim de abstrações. Em outras palavras, em vez de uma classe depender de outra classe concreta, ela deve depender de interfaces ou contratos. Isso torna o sistema mais flexível e facilita mudanças, já que você pode trocar implementações sem alterar o código principal.

Prefira composições a herança

Significa que é melhor construir funcionalidades combinando objetos (composições) do que depender fortemente de heranças de classes. A herança pode criar estruturas rígidas e difíceis de manter, enquanto a composição permite maior reutilização de código e flexibilidade para montar comportamentos diferentes.

Princípio de Demeter (menor conhecimento)

É um conceito de design de software que busca reduzir o acoplamento entre os módulos ou classes de um sistema, evitando a utilização de variáveis globais.

Princípio Aberto / Fechado

Princípio Aberto/Fechado diz que uma entidade de software (como uma classe ou módulo) deve estar aberta para extensão mas fechada para modificação. Isso quer dizer que, quando precisarmos adicionar novas funcionalidades, devemos fazê-lo estendendo ou adicionando código, e não mudando diretamente o que já funciona. Assim evitamos quebrar funcionalidades existentes e mantemos o sistema mais seguro para evoluir.

Aberto: Adicionar funcionalidades novas sem mexer no que já foi feito, preservando a estabilidade do sistema.
Fechado: Evita alterações que podem gerar novos bugs.

Abstração em Java:

Classe = Contém atributos e métodos.
Interface = Define um contrato (métodos sem implementação).
Classe Abstrata = Mistura classe e interface; já traz parte do código pronto, mas exige que os métodos abstratos sejam implementados pelos filhos.
@autowired É usado para diminuir acoplamento, evitando que uma classe implemente em outra classe.

SOLID

L - Liskov Substitution Principle

Liskov garante que uma classe filho possa ser usada como se fosse a classe pai, sem surpresas. Isso mantém o código mais previsível e seguro para alterações futuras.

Design Patterns

São soluções reutilizáveis para problemas recorrentes no desenvolvimento de software. Foram popularizados pelos “Gang of Four” em 1994.

Categorias

No livro existem 23 padrões, divididos em três categorias:

Criacionais: soluções para criação de objetos. Exemplos: Abstract Factory, Factory Method, Singleton, Builder, Prototype.

Estruturais: soluções para composição de classes e objetos. Exemplos: Proxy, Adapter, Facade, Decorator, Bridge, Composite, Flyweight.

Comportamentais: soluções para interação e divisão de responsabilidades. Exemplos: Strategy, Observer, Template Method, Visitor, Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, State.

Factory Method

Suponha um sistema distribuído baseado em TCP/IP. Três funções (f, g,h) criaram objetos TCPChannel para comunicação:

void f() {
  TCPChannel c = new TCPChannel();
  ...
}

void g() {
  TCPChannel c = new TCPChannel();
  ...
}

void h() {
  TCPChannel c = new TCPChannel();
  ...
}

Problema

Se for necessário usar UDP, o sistema quebra o Princípio Aberto/Fechado

Solução 

Criar um método fábrica estático que centralize a criação dos objetos:

class ChannelFactory {
  public static Channel create() { // método fábrica estático
    return new TCPChannel();
  }
}

void f() {
  Channel c = ChannelFactory.create();
  ...
}

void g() {
  Channel c = ChannelFactory.create();
  ...
}

void h() {
  Channel c = ChannelFactory.create();
  ...
}

Agora, se o canal mudar para UDP, apenas o método create da ChannelFactory precisa ser alterado.

Fábrica Abstrata 

Uma variação utiliza uma classe abstrata para definir vários métodos fábrica:

abstract class ProtocolFactory { // Fábrica Abstrata
  abstract Channel createChannel();
  abstract Port createPort();
  ...
}

void f(ProtocolFactory pf) {
  Channel c = pf.createChannel();
  Port p = pf.createPort();
  ...
}

Singleton

Suponha uma classe Logger usada para registrar operações do sistema:

void f() {
  Logger log = new Logger();
  log.println("Executando f");
}

void g() {
  Logger log = new Logger();
  log.println("Executando g");
}

void h() {
  Logger log = new Logger();
  log.println("Executando h");
}

O problema é que criamos múltiplas instâncias do Logger, o que não é eficiente nem desejável
Solução

Aplicar o padrão Singleton garantindo que a classe possua apenas uma única instância global:

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void println(String msg) {
        System.out.println(msg);
    }
}

// Uso
Logger log = Logger.getInstance();
log.println("Executando f");

Observer


Exemplo prático: sistemas de eventos e notificações.

Estrutura 

Subject = objeto observado 
Observer = interessados que “escutam” mudanças no subject

Exemplo em Java

// Interface Observer
public interface Observer {
    void update(String message);
}

// Subject
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

// Concrete Observer
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " recebeu: " + message);
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");

        publisher.addObserver(s1);
        publisher.addObserver(s2);

        publisher.notifyObservers("Novo artigo publicado!");
    }
}

Conclusão

Padrões de Projeto são essenciais para criar sistemas flexíveis e reutilizáveis.
Eles ajudam tanto no desenvolvimento próprio quanto na compreensão de sistemas de terceiros.
Os principais grupos são: Criacionais, Estruturais e Comportamentais.
Exemplos práticos: Factory, Singleton, Observer.

Expectativas de um arquiteto

No livro Fundamentos da Arquitetura de Software - INtrodução, os autores destacam que as expectativas em torno do arquiteto de software vão além da competência técnica. Esse profissional deve ser capaz de tomar decisões estruturais importantes, promover a comunicação entre equipes de desenvolvimento, operação e negócios, além de garantir que o sistema atenda tanto às funcionalidades esperadas quanto aos requisitos de qualidade, com desempenho, escalabilidade e segurança.

Decisão de arquitetura 

As decisões de arquitetura são consideradas críticas, pois moldam a estrutura do sistema e impactam diretamente sua capacidade de evolução. Essas escolhas envolvem estilos arquiteturais, padrões, frameworks, tecnologias e trade-offs, que devem ser cuidadosamente avaliados, já que se tratam de definições difíceis de modificar após implantadas. O arquiteto é responsável por equilibrar necessidades técnicas e estratégias ao tomar mais decisões.

Analisar continuamente a arquitetura

Outro ponto fundamental do papel do arquiteto é a análise contínua da arquitetura. Isso significa revisar periodicamente se a estrutura do sistema ainda atende às demandas atuais di negócio e às necessidades de qualidade. O arquiteto deve identificar pontos de melhoria, ajustar decisões e garantir que a arquitetura continue relevante e eficaz diante das mudanças no mercado e na tecnologia. 

Manter-se atualizado 

Os autores reforçam também a importância de o arquiteto manter-se atualizado. A área de tecnologia evolui rapidamente, e um profissional que não acompanha novas práticas, linguagens, frameworks e tendências corre o risco de propor soluções ultrapassadas que comprometem a longevidade do sistema. Estar em constante aprendizado é, portanto, essencial para garantir decisões assertivas e alinhadas com o estado da arte.

Domínio do negócio 

Por fim, o domínio do negócio é apresentado com requisitos indispensáveis. O arquiteto de software pode atuar de forma isolada apenas no campo técnico; ele deve compreender os objetivos, processos e prioridades da organização. esse entendimento permite alinhar a arquitetura às metas estratégicas do negócio, garantindo que as soluções técnicas ofereçam valor real e sustentem os resultados desejados pela imprensa.


DevOps

É uma abordagem que integra as equipes de Desenvolvimento (Dev) e Operações (Ops) para melhorar a colaboração e a produtividade. Em vez de trabalhar em silos, as equipes compartilham práticas e ferramentas para planejar, desenvolver, testar, implantar e monitorar aplicativos de forma contínua e eficiente.

Por que utilizar DevOps
Adotar práticas de DevOps pode trazer diversos benefícios para as organizações:

Redução do tempo de ciclo: Ao trabalhar em lotes menores e automatizar processos, é possível entregar software mais rapidamente.

Melhoria contínua: Com feedback constante, as equipes podem aprender e melhorar seus processos.

Maior colaboração: A integração entre desenvolvimento e operações promove uma comunicação mais eficaz.

Maior estabilidade: A automação e o monitoramento constante ajudam a identificar e corrigir problemas rapidamente.

Diferença entre: Arquitetura e Design

Arquitetura de software é responsável pelas decisões estruturais mais importantes de um sistema, aquelas que têm impacto direto na sua qualidade, evolução e manutenção. Ela envolve escolas de estilos arquiteturais, padrões, tecnologias e trade-offs que são difíceis de mudar depois de implementadas. Já o design de software se concetra em decisões de nível mais baixo, voltadas à organização interna de componentes, classes e métodos. Essas decisões são mais fáceis de modificar e lidam com os detalhes da implementação garantindo clareza e coesão no código.

Formação do conhecimento de um arquiteto de TI 

A formação de um arquiteto de software deve seguir o conceito de profissional em “T”. A barra horizontal do T representa conhecimento amplo, que envolve transitar por diversas áreas com linguagens de programação, bancos de dados, nuvem, DevOps, segurança e redes, possibilitando compreender o sistema como um todo e dialogar com diferentes equipes. Já a barra vertical do T simboliza o conhecimento profundo, ou seja, a especialização em algumas áreas específicas, como micro serviços, performance ou segurança, permitindo que o arquiteto seja referência técnica nesses pontos críticos. Essa combinação entre amplitude e profundidade torna o arquiteto mais completo e preparado para tomar decisões estratégicas.

Trade-off

Trade-off é a validação das consequências ao escolher uma opção em detrimento de outra dentro da arquitetura de software. Toda decisão arquitetural implica ganhos e perdas, e o papel do arquiteto é analisar cuidadosamente essas trocas para equilibrar prioridades como desempenho, segurança, escalabilidade, custos, manutenção e tempo de entrega. Não existe solução perfeita; cada escolha traz benefícios em certos aspectos, mas também limitações em outros. Por exemplo, optar por uma arquitetura de micro serviços pode aumentar a escalabilidade e a flexibilidade, mas, ao mesmo tempo, elevar a complexibilidade operacional e os custos de monitoramento. O processo de análise de trade-offs exige considerar o contexto do negócio, os requisitos de qualidade e as restrições existentes, avaliando impactos de curto e longo prazo. Dessa forma, um arquiteto eficiente não busca eliminar os trade-offs, mas sim tomar decisões conscientes e justificadas, comunicando claramente às partes interessadas os motivos da escolha.


Segundo Bimestre 
Aula 29/09 – Circuit Breaker

O Circuit Breaker protege a comunicação entre sistemas, funcionando como um disjuntor que evita falhas encadeadas.

Estados

Closed (Fechado)
Comunicação normal; tudo funcionando.

Open (Aberto)
Erros ou timeouts ultrapassam um limite; novas chamadas são bloqueadas.

Half-open (Meio aberto)
O sistema testa novamente a comunicação.

Se funcionar repetidas vezes → volta para Closed

Se falhar → retorna para Open

Exemplo:
Se o serviço A chamar B e ocorrerem vários timeouts, o circuito abre.
Após um tempo, entra em Half-open para testar.
Sucesso → volta ao normal. Falha → abre novamente.

Aula 06/10 – Características Arquiteturais

Uma característica de arquitetura deve:

Representar uma preocupação de design fora do domínio do negócio.

Impactar diretamente a estrutura do sistema.

Ser essencial para o sucesso da aplicação.

Podem ser vistas como três critérios em equilíbrio (um “triângulo” arquitetural).

Aula 07/10 – CQRS

CQRS (Command Query Responsibility Segregation) separa operações de leitura e escrita.

Benefícios:

Cada parte pode ser otimizada de forma independente.

Facilita manutenção e escalabilidade.

Melhora organização e desempenho quando bem aplicado.

Aula 13/10 – Retry & Estilos Arquiteturais
Retry

Imediato: tenta novamente logo após falha.

Com atraso: aguarda algum tempo antes de nova tentativa.

Estilos Arquiteturais

Um software pode usar vários padrões juntos.

Grande Bola de Lama: código bagunçado, sem planejamento, difícil de evoluir.

Arquitetura Unitaria: comum em softwares embarcados (micro-ondas, geladeiras etc.).

Cliente/Servidor: separação clara de papéis.

Desktop + Servidor de Banco: vários PCs acessam um servidor com o banco.

Navegador + Servidor Web: navegador acessa o web server, que acessa o banco.

Aula 14/10 – Monolito, Microsserviços e Falácias
Monolito

Tudo no mesmo projeto, fácil de iniciar, mas pode virar um gargalo quando cresce demais.

Microsserviços

Vários serviços menores e independentes, cada um com responsabilidade específica.

Microsserviços não são solução mágica — há cenários onde o monolito é melhor.

Falácias de Sistemas Distribuídos

A rede não falha

Latência é insignificante

Largura de banda infinita

Rede totalmente segura

Topologia não muda

Padrões em Arquiteturas Distribuídas

Log distribuído: centralização de logs de vários serviços.

Transações distribuídas: operações que envolvem múltiplos serviços e precisam de coordenação.

Aula 20/10 – Arquitetura em Camadas

Arquitetura simples, comum e de baixo custo.

Camadas típicas

Apresentação

Negócio

Persistência

Banco de dados

Cada camada possui responsabilidade própria e deve permanecer isolada.

Benefícios

Manutenção facilitada

Organização clara

Troca de componentes sem afetar o restante

Tipos de Camadas

Fechadas: acessam apenas a camada imediatamente abaixo.

Abertas: permitem inserir camadas intermediárias.

Antipadrão: Sinkhole

Requisições atravessam muitas camadas sem lógica útil.
Aceitável até ~20%. Acima disso, má arquitetura.

Boa escolha quando:

Sistema pequeno

Pouco tempo ou orçamento

Requisitos ainda pouco claros

Aula 27/10 – Arquitetura Pipeline

Processamento ocorre em etapas sequenciais.

Componentes típicos:

Produtor

Transformador

Verificador

Consumidor

Aula 03/11 – Arquitetura Microkernel

O núcleo possui apenas o essencial. Quase todas as funcionalidades são adicionadas por plug-ins.

Plug-ins

Autônomos e independentes

Contêm código que pode mudar com frequência

Conectam-se diretamente ao núcleo

Quando remotos, tornam o sistema distribuído (mais complexo)

Registro de Plug-ins

Pode ser um mapa simples (chave → plug-in)

Ou um sistema avançado de descoberta

Contratos

Definem regras de comunicação entre núcleo e plug-ins.

Pontos Fortes

Simples

Barato

Alta testabilidade

Confiável

Pontos Fracos

Escalabilidade limitada

Baixa tolerância a falhas

Elasticidade baixa

Aula 10/11 – Arquitetura de Microsserviços

Inspirada no DDD, especialmente nos bounded contexts.

Cada serviço contém apenas o necessário para operar.

Distribuição

Rodam em máquinas/VMs separadas → maior latência e mais verificações de segurança.

Contexto Delimitado

Cada microsserviço representa um domínio ou fluxo completo.

Granularidade

Não deve ser “micro demais”.

Serviços que dependem muito uns dos outros talvez precisem ser unidos.

Isolamento de Dados

Cada serviço possui seu próprio banco, podendo escolher tecnologias diferentes.

Camada de API

Expõe funcionalidades

Não deve orquestrar serviços

Sidecar

Centraliza operações como logs, monitoramento e segurança.

Front-Ends

Dois estilos:

Usar diretamente a API

Ser um microsserviço independente

Comunicação

Síncrona ou assíncrona

Coreografia orientada a eventos é preferível

Orquestração é centralizada e menos alinhada à filosofia

Transações

Evitar transações entre serviços.
Usar Sagas para manter consistência.

Resumo

Vantagens: escalável, elástico, evolui continuamente
Desvantagens: mais latência, mais sobrecarga por segurança e rede























