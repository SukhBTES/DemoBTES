package Assgn;

public class Pattern {

	int i,j,k;
	public void action()
	{
		for(i=0;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();		
		}
		for(i=1;i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=4;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();	
			
		}
	}
	public static void main(String[] args)
	{
          Pattern pp=new Pattern();
          pp.action();
	}

}
