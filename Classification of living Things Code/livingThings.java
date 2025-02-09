public class livingThings{
//fields
private boolean movement;
private boolean reproduction;
private int nutritionNumber; // I thought it would be fun to get down the number of times an organism would eat as a fun fact
private boolean irritability;
private String growthDate; //I decided to make this a string to generate fun facts
private char excretion;
private char respirationType;
private boolean death;
//no-args constructor
public livingThings(){
    this.movement = false;
    this.reproduction = false;
    this.nutritionNumber = 0;
    this.irritability = true;
    this.growthDate = null;
    this.excretion = "N";
    this.respirationType = "U";
    this.death = true;
}
//full-args constructor
public livingThings(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death){
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

}