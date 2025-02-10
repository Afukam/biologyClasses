public class LivingThings{
//fields
protected boolean movement;
protected  boolean reproduction;
protected  int nutritionNumber; // I thought it would be fun to get down the number of times an organism would eat as a fun fact
protected boolean irritability;
protected String growthDate; //I decided to make this a string to generate fun facts
protected char excretion;  //first character of the method of excretion
protected  char respirationType; //anerobic // aerobic
protected  boolean death;
//no-args constructor
public LivingThings(){
    this.movement = false;
    this.reproduction = false;
    this.nutritionNumber = 0;
    this.irritability = true;
    this.growthDate = null;
    this.excretion = 'N';
    this.respirationType = 'U';
    this.death = true;
}
//full-args constructor
public LivingThings(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death){
    this.movement = movement;
    this.reproduction = reproduction;
    this.nutritionNumber = nutritionNumber;
    this.irritability = irritability;
    this.growthDate = growthDate;
    this.excretion = excretion;
    this.respirationType = respirationType;
    this.death = death;
}
//methods, getters and setters 

public LivingThings(boolean death) {
        this.death = death;
    }

public boolean getMovement(){
    return movement;
}
public void setMovement(boolean movement){
    this.movement = movement;
}
public boolean getReproduction(){
    return reproduction;
}
public void setReproduction(boolean reproduction){
    this.reproduction = reproduction;
}
public int getNutritionNumber(){
    return nutritionNumber;
}
public void setNutritionNumber(int nutritionNumber){
    this.nutritionNumber = nutritionNumber;
}
public boolean getIrritability(){
    return irritability;
}
public void setIrritability(boolean irritability){
    this.irritability = irritability;
}
public String getGrowthDate(){
    return growthDate;
}
public void setGrowthDate(String growthDate){
    this.growthDate = growthDate;
}
public char getExcretion(){
    return excretion;
}
public void setExcretion(char excretion){
    this.excretion = excretion;
}
public char getRespirationType(){
    return respirationType;
}
public void setRespirationType( char respirationType){
    this.respirationType = respirationType;
}
public boolean getDeath(){
    return death;
}
public void setDeath(boolean death){
    this.death= death;
}
}