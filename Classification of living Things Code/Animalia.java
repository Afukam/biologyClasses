public class Animalia extends LivingThings{
    protected boolean backBone;
    protected String skeletalType;
    protected int bodyCavity;
//no-args constructor 
public Animalia(){
    this.backBone = true;
    this.skeletalType = "Unknown"; //exoskelenton, fluid skelenton (atp i've forgotten what it's called), endo skelenton
    this.bodyCavity = 0;
}
public Animalia(boolean movement, boolean reproduction, int nutritionNumber, boolean irritability, String growthDate, char excretion, char respirationType, boolean death, boolean backBone, String skeletalType, int bodyCavity){
    super(movement, reproduction, nutritionNumber, irritability, growthDate, excretion, respirationType, death);
    this.backBone = backBone;
    this.skeletalType = skeletalType; //exoskelenton, fluid skelenton (atp i've forgotten what it's called), endo skelenton
    this.bodyCavity = bodyCavity;
}
public void setBackBone(boolean backBackbone){
    this.backBone = backBackbone;
}
public boolean getBackBone(){
    return backBone;
}
public void setSkeletalType(String skeletalType){
    this.skeletalType = skeletalType;
}
public String  getskelentalType(){
    return skeletalType;
}
public void setBodyCavity(int bodyCavity){
    this.bodyCavity = bodyCavity;
}
public int getBodyCavity(){
    return bodyCavity;
}
}