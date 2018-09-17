package <missing>;

public class GlobalMembers
{
	public static int F(int n,int a)
	{
	  if (n == 1)
	  {
		  return 1;
	  }
	  if (a == 1)
	  {
		  return 0;
	  }
	  if (n % a == 0)
	  {
		  return F(n / a, a) + F(n, a - 1);
	  }
				 return F(n, a - 1);
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",F(a, a));
		}
	}
}

