package <missing>;

public class GlobalMembers
{
	/*
	  Name: ????
	  Author: chenminhuan?1200012757? 
	*/


	public static int n;
	public static void print(int n)
	{
		  if (n == 1) //??n==1  ????
		  {
			 System.out.print("End");
			 return;
		  }
		  if (n % 2 != 0) //??n??? ???n*3+1
		  {
			 System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
			 print(n * 3 + 1);
		  }
		  else //??n??? ???n/2
		  {
			 System.out.printf("%d/2=%d\n",n,n / 2);
			 print(n / 2);
		  }
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		print(n); //????
		return 0;
	}
}

