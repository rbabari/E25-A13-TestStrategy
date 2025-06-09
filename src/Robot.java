public class Robot {
    IBehaviour behaviour;
    String nom;

    public Robot()
    {
        this.nom = "";
        // Couplage fort
        // NON NON La classe robot depend (a besoin pour son fonctionnement )
        // de la classe AgressifBehaviour
        this.behaviour = null;
    }
    public Robot(String nom)
    {
        this.nom = nom;
        this.behaviour = null;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move()
    {
        System.out.print(this.nom + " ");
        behaviour.mouve();

    }


}
