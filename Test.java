class Test
{
	public int addTwoNumber(int a,int b)
	{
		return a+b;
	}
  
	public static void main(String args[])
	{
		Test ob=new Test();
    
		int c=ob.addTwoNumber(10,20);
   
		System.out.println("Addition of 10 and 20 is- "+c);
 
 	}
}