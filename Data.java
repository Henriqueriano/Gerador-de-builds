// Retirados de: fonte: https://artcetera.art/games/itens-do-lol/
import java.util.ArrayList;
import java.io.File;
abstract class Data 
{
    // Arquivos aqui:
    protected File basicos = new File("basicos.txt");
    protected File consumiveis = new File("consumiveis.txt");
    protected File botas = new File("botas.txt");
    protected File epicos = new File("epicos.txt");
    protected File iniciais = new File("iniciais.txt");
    protected File lendarios = new File("lendarios.txt");
    protected File miticos = new File("miticos.txt");
    protected File fontes = new File("fontes.txt");
    // Listas aqui:
    protected ArrayList<String> AllList = new ArrayList<String>();
    protected ArrayList<String> basicosList = new ArrayList<String>();
    protected ArrayList<String> botasList = new ArrayList<String>();
    protected ArrayList<String> consumiveisList = new ArrayList<String>();
    protected ArrayList<String> epicosList = new ArrayList<>();
    protected ArrayList<String> miticosList = new ArrayList<>(); 
    protected ArrayList<String> lendariosList = new ArrayList<>();
    protected ArrayList<String> iniciaisList = new ArrayList<>();

}