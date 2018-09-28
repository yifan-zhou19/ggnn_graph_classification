package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		int n = 0;
		while (m != 0)
		{
				   n = 10 * n + m % 10;
				   m = m / 10;
		}
		return (n);
	}
	public static int g(int m)
	{
		int i;
		int s = 0;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
							   if (m % i == 0)
							   {
								   s++;
								   break;
							   }
		}
		if (s == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}



	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int s = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = m;i <= n;i++)
		  {
						   if (f(i) == i && g(i) == 1)
						   {
							   System.out.printf("%d",i);
							   s++;
							   break;
						   }
		  }
		  if (s == 0)
		  {
			  System.out.print("no");
		  }
		  else
		  {
				for (j = i + 1;j <= n;j++)
				{
						   if (f(j) == j && g(j) == 1)
						   {
							   System.out.printf(",%d",j);
						   }
				}
		  }


	}

}

