package <missing>;

public class GlobalMembers
{
	public static int count(int m,int n)
	{
		int c;
		if (m < 0)
		{
		c = 0;
		}
		else if (n == 1)
		{
		c = 1;
		}
		else
		{
		c = count(m, n - 1) + count(m - n, n);
		}
		return c;
	}
	public static void Main(String[] args)
	{
	  int t;
	  int i;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= t - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  System.out.printf("%d\n",count(m, n));
	  }
	}
}

