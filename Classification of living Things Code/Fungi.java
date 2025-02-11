public class Fungi extends LivingThings{
    protected int cellCount;
    protected boolean parasite;
    protected String nutritionMethod;
    protected boolean asexual;
    protected String reproductionMethod;


//no-args constructor

public Fungi(){
    this.cellCount = 0;
    this.parasite = true;
    this.nutritionMethod = "sucker";
    this.asexual = true;
    this.reproductionMethod = "sexual";
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

//getters and setters
public void setcellCount(int cellCount){
    this.cellCount = cellCount;
}
public int getcellCount(){
    return cellCount;
}
public void setParasite(boolean parasite){
    this.parasite = parasite;
}
public boolean getParasite(){
    return parasite;
}
public void setNutritionMethod(String nutritionMethod){
    this.nutritionMethod = nutritionMethod;
}
public String getNutritionMethod(){
    return nutritionMethod;
}
public void setAsexual(boolean asexual){
    this.asexual = asexual;
}
public boolean getAsexual(){
    return asexual;
}
public void setReproductionMethod(String reproductionMethod){
    this.reproductionMethod = reproductionMethod;
}
public String getReproductionMethod(){
    return reproductionMethod;
}
}