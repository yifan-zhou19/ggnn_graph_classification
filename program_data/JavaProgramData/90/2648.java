package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{
		if (m < n && m != 0 && n>1)
		{
			   return apple(m, n - 1);
		}
		else if (m >= n != 0 && m != 0 && n > 1)
		{
			   return apple(m, n - 1) + apple(m - n, n);
		}
		else if (m == 0)
		{
		return 1;
		}
		else if (n == 1 && m != 0)
		{
		return 1;
		}
	}
	public static int Main()
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
		  for (i = 0;i < t;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  m = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  n = Integer.parseInt(tempVar3);
						  }
						  System.out.printf("%d\n",apple(m, n));
		  }
	}

}

