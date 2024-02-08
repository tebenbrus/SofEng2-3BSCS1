public class Character{
    private String type;
    private Strategy strategy;

    public Character(String type, Strategy strategy){
        this.type = type;
        this.strategy = strategy;
    }
    public void attack(){
        strategy.attackStrategy();

    }
    public void defend(){
        strategy.defenseStrategy();

    }
    
}
