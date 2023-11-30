import java.util.Scanner;
public class Logic extends Data 
{
    public void carregarListas() 
    {
        try {
            Scanner sc = new Scanner(basicos);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                basicosList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(botas);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                botasList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(consumiveis);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                consumiveisList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(epicos);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                epicosList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(iniciais);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                iniciaisList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(miticos);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                miticosList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();

            sc = new Scanner(lendarios);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String[] tempSplited = temp.split("\\|");
                lendariosList.add(tempSplited[0]);
                AllList.add(tempSplited[0]);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Erro na classe Populate!");
        }
    }
    public void start() 
    {
        // Apresentação:
        System.out.println("Digite 0: Para sair!\nDigite 1: Para uma build COMPLETAMENTE ALEATORIA!\nDigite 2: para uma build em Ordem!");
        // Atributos locais
        Scanner sc = new Scanner(System.in);
        int tItens = AllList.size();
        int tBotas = botasList.size();
        int tIniciais = iniciaisList.size();
        int tLendarios = lendariosList.size();
        int tMiticos = miticosList.size();
        boolean run = true;
    while (run) 
    {
        int cause = sc.nextInt();
        switch (cause) 
        {
            case 0:
            run = false;
            sc.close();
            break;
            case 1: // Build Aleatória (Genérica)
            System.out.println("Itenização aleatória geral num 1:");
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",AllList.get((int)(Math.random() * tItens)),botasList.get((int)(Math.random() * tBotas)),AllList.get((int)(Math.random() * tItens)),AllList.get((int)(Math.random() * tItens)),AllList.get((int)(Math.random() * tItens)),AllList.get((int)(Math.random() * tItens)));
            break;
            case 2: // Build Aleatória Pos
            System.out.println("Itenização aleatória num 2:");
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",iniciaisList.get((int)(Math.random() * tIniciais)), botasList.get((int)(Math.random() * tBotas)), miticosList.get((int)(Math.random() * tMiticos)), lendariosList.get((int)(Math.random() * tLendarios)),lendariosList.get((int)(Math.random() * tLendarios)),lendariosList.get((int)(Math.random() * tLendarios)));
            break;
            
        } 
        
    }
}}

