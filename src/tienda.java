public class tienda {

    private especies especie1;
    private especies especie2;
    private especies especie3;
    private especies especie4;

    public tienda(){
    especie1 =new especies("cacatua blanca",especies.Categoria.mamifero,30,"mamifero",250,50);
        especie2 =new especies("Boa constructora",especies.Categoria.reptiles,58,"ave",150,50);
        especie3 =new especies("Titi dorado",especies.Categoria.mamifero,20,"mamifero",75,50);
        especie4 =new especies("guacamaya roja",especies.Categoria.aves,30,"mamifero",250,50);
    }
    public especies darespecie1(){
        return especie1;
    }
    public especies darespecie2() {
        return especie2;
    }
    public especies darespecie3() {
        return especie3;
    }
    public especies darespecie4() {
        return especie4;
    }

    }


