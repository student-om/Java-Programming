 class College{
 String Collegename;
 College(String Collegename){
 this.Collegename = Collegename;
 }
 College(){    //invisible super() found this so not error generated(if no argument constructor were absent, then error would be generated)
 this.Collegename = "randomname";
 }
 }
 
 class TechUni extends College{
 String UniName;
 TechUni(String UniName){
 // super(UniName); no error if this line commented out
 //super(); error  
this.UniName = UniName;
 
 }
 public static void main(String args[]){
 TechUni sggs = new TechUni("SGGS");
 }
 }
 
 
 
 
 //College(String Collegename){
 //this.Collegename = Collegename;
 //}
 
