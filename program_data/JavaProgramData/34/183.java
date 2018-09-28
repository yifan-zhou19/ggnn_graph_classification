package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	while (true)
	{

		if (n % 2 == 0)
		{
		 System.out.printf("%d/2=%d\n",n,n / 2);
		 n = n / 2;
		 if (n == 1)
		 {
			 System.out.print("End");
			 break;
		 }
		}
		if (n % 2 != 0)
		{
		  if (n == 1)
		  {
			 System.out.print("End");
			 break;
		  }
		  System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
		  n = n * 3 + 1;

		}

	}
	}

}

