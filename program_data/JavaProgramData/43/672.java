package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i = 0;
	  int su = int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i = i + 2)
	  {
		  if (su(i) == 1 && su(m - i) == 1)
		  {
				System.out.printf("%d %d",i,m - i);
			 if (i < m / 2)
			 {
				  System.out.print("\n");

			 }
		  }




	  }
		 return (0);


	}
	public static int su(int n)
	{
		int i = 2;
		int t = 1;
	   for (i = 2;i < n - 1;i++)
	   {
		   if (n % i == 0)
		   {
			   t = 0;
			  break;
		   }


	   }
	   return (t);

	}
}

