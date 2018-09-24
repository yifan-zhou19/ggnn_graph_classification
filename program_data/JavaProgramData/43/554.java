package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
	int i;
	int n;
	if (a == 1)
	{
		return 0;
	}
	n = (int)Math.sqrt((double)a);
	for (i = 2;i <= n;i++)
	{
	if (a % i == 0)
	{
		return 0;
	}
	}
	 return 1;
	}
	public static void Main()
	{
	  int i;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i = i + 2)
	  {
		  if (prime(i) != 0 && prime(m - i) != 0)
		  {
			  System.out.printf("%d %d\n",i,m - i);
			  continue;
		  }
	  }
	}

}

