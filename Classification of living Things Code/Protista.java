public  class Protista extends LivingThings{
    protected boolean asexual;
    protected  boolean uniCellular;
    protected String habitat;
    protected String movementOrganelle;


//no-args constructor 
public Protista (){
    this.asexual = false;
    this.uniCellular = false;
    this.habitat = "Unknown";
    this.movementOrganelle = "Unknown";
}
//full args constructor 
public Protista(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death, boolean asexual, boolean uniCellular, String habitat, String movementOrganelle){
    this.asexual = asexual;
    this.uniCellular = uniCellular;
    this.habitat = habitat;
    this.movementOrganelle = movementOrganelle;
}
public void setAsexual(boolean asexual){
    this.asexual = asexual;
}
public boolean getAsexual(){
    return asexual;
}
public void setUniCellular(boolean uniCellular){
    this.uniCellular = uniCellular;
}
public boolean getUniCellular(){
    return uniCellular;
}
public void setHabitat(String habitat){
    this.habitat = habitat;
}
public String getHabitat(){
    return habitat;
}
public void setMovementOrganelle(String movementOrganelle){
    this.movementOrganelle = movementOrganelle;
}
public String getMovementOrganelle(){
    return movementOrganelle;
}
}