class Year{
	int studentsRegNo[];
	int totalStudents;
	int RegularStudents;
	int dsyStudents;
	int tfwsStudents;

	public Year(int totalStudents,int RegularStudents,int dsyStudents,int tfwsStudents){
		this.totalStudents=totalStudents;
		this.RegularStudents=RegularStudents;
		this.tfwsStudents=tfwsStudents;
		this.dsyStudents=dsyStudents;
	}

	public void getRegNumbers(){
        studentsRegNo = new int[totalStudents];
        int i=0,j=151,k=501;
        for(;i<totalStudents;i++){
        if(i<RegularStudents){
        studentsRegNo[i]=i+1;
        }
        else if(j<=150+tfwsStudents){
        studentsRegNo[i]=j;
        j++;
        }
        else if(k<=500+dsyStudents){
        studentsRegNo[i]=k;
        k++;
        }
        } 
	}
	
	public void displayRegNo(){
	for(int i:studentsRegNo){
	System.out.println(i);
	}
	}
	
	public static void  main(String args[]){
	Year awm = new Year(78,64,11,3);
	awm.getRegNumbers();
	awm.displayRegNo();
	}
}
