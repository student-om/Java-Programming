class Program1_13{

	public static void main(String args[]){
	char[] line={'h','e','l','l','o','\0'};
	int i,v,c,ch,d,s,o;
	o=v=c=ch=d=s=0;
	
	for(i=0;line[i]!='\0';++i)
	{
	if(line[i]=='a' || line[i]=='e' || line[i]=='i' || line[i]=='o' || line[i]=='u' ||
	line[i]=='A' || line[i]=='E' || line[i]=='I' || line[i]=='O' || line[i]=='U')
	v++;
	else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
	c++;
	else if(line[i]>='0'&&c<='9')
	d++;
	else if (line[i]==' ')
	s++;
	}
	System.out.printf("Vowels: %d",v);
	System.out.printf("\nConsonants: %d",c);
	System.out.printf("\nDigits: %d",d);
	System.out.printf("\nWhite spaces: %d",s);
	
		}
}
