package <missing>;

public class GlobalMembers
{
	public static void print(int n)
	{
		  int p = n;
		  int i;
		  if (p / 10 != 0)
		  {
			 for (i = 0;p / 10 != 0;i++)
			 {
							 int temp = p / 10;
							 p = p - 10 * temp;
			 }
			 System.out.printf("%d",p);
			 n = n / 10;
			 print(n);
		  }
		  else
		  {
		  System.out.printf("%d",n);
		  }
	}



	public static int Main()
	{
		  int number;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  number = Integer.parseInt(tempVar);
		  }
		  print(number);
	}


}

