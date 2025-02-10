public class Plantae extends LivingThings{
    protected char nutrientType;
    protected String reproductionType;
    protected boolean cellStructure;
    protected int cellCount;

// no-args constructors 

public Plantae(){
    this.nutrientType = 'U';
    this.reproductionType = "Unknown";
    this.cellStructure = false;
    this.cellCount = 0;
}
//full-args constructor
public Plantae(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death, char nutrientType, String reproductionType, boolean cellStructure, int cellCount){
    super(movement, reproduction, nutritionNumber, irritability, growthDate, excretion, respirationType, death);
    this.nutrientType = nutrientType;
    this.reproductionType = reproductionType;
    this.cellStructure = cellStructure;
    this.cellCount = cellCount;
}
public void setNutrientType( char nutrientType){
    this.nutrientType = nutrientType;
}
public char getNutrientType(){
    return nutrientType;
}
public void setReproductionType(String reproductionType){
    this.reproductionType = reproductionType;
}
public String getReproductionType(){
    return reproductionType;
}
public void setCellStructure(boolean cellStructure){
    this.cellStructure = cellStructure;
}
public boolean getCellStructure(){
    return cellStructure;
}
public void setCellCount(int cellCount){
    this.cellCount = cellCount;
}
public int getCellCount(){
    return cellCount;
}
}