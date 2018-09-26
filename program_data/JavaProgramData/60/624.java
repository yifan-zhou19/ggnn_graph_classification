package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int d;
		int i;
		d = Math.sqrt(x);
		for (i = 2;i <= d;i++)
		{
						 if (x % i == 0)
						 {
							 break;
						 }
		}
		if (i == d + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		  int n;
		  int j;
		  int p = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (j = 2;j <= n - 2;j++)
		  {
						   if ((ss(j) == 1) && (ss(j + 2) == 1))
						   {
													  p++;
													  if (p == 1)
													  {
														  System.out.printf("%d %d",j,j + 2);
													  }
													  else
													  {
														  System.out.printf("\n%d %d",j,j + 2);
													  }
						   }
		  }
		  if (p == 0)
		  {
			  System.out.print("empty");
		  }
	}

}

