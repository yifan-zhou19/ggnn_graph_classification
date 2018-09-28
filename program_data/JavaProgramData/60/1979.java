package <missing>;

public class GlobalMembers
{
	public static int is(int a)
	{
		int sq = (int)Math.sqrt(a);
		int i;
		for (i = 2;i <= sq;i++)
		{
				if (a % i == 0)
				{
					 return 0;
				}
		}
		return 1;
	}

	public static int Main()
	{
		  int n;
		  int m = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int k = 3;k < n - 1;k++)
		  {
				  if (is(k) == 1 && is(k + 2) == 1)
				  {
					  System.out.printf("%d %d\n",k,k + 2);
					  m++;
				  }
		  }
		  if (m == 0)
		  {
				   System.out.print("empty");
		  }
	}
}

