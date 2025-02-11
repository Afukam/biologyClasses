public class Fungi extends LivingThings{
    protected int cellCount;
    protected boolean parasite;
    protected String nutritionMethod;
    protected boolean asexual;
    protected String reproductionMethod;


//no-args constructor

public Fungi{
    this.cellCount = cellCount;
    this.parasite = parasite;
    this.nutritionMethod = nutritionMethod;
    this.asexual = asexual;
    this.reproductionMethod = reproductionMethod;
}

//full-args constructor 

public Fungi(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death, int cellCount, boolean parasite, String nutritionMethod, boolean asexual, String reproductionMethod){
    super(movement, reproduction, nutritionNumber, irritability, growthDate, excretion, respirationType, death);
    this.cellCount = cellCount;
    this.parasite = parasite;
    this.nutritionMethod = nutritionMethod;
    this.asexual = asexual;
    this.reproductionMethod = reproductionMethod;
}
}