public class TestaVetorPolimorfico {
    public static void main(String[] args){
        int i;
        Desenvolvedor[] camaleao= new Desenvolvedor[4];

        camaleao[0] = new Junior("Jairo", "JS", 2900, "Carlos");
        camaleao[1] = new Pleno("Carlos", "Java", 5600, 7);
        camaleao[2] = new Senior("Nicolas", "C#", 9000, 3000);
        camaleao[3] = new Junior("Leonardo", "Java", 2900, "Carlos");

        for(i = 0; i <= 3; i++){
            camaleao[i].codar();
            System.out.println("Bônus: " + camaleao[i].calcularBonus());
            System.out.println(camaleao[i].toString());
        }
    }
}
