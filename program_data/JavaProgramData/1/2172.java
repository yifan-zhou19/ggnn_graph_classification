package <missing>;

public class GlobalMembers
{
	public static int f(int t,int k)
	{
		int u = 1;
		int i;
		if (t > 2)
		{
		for (i = k;i <= Math.sqrt(t);i++)
		{
			if (t % i == 0)
			{
				u += f(t / i, i);
			}
		}
		return u;
		}
		else if (t == 2)
		{
		return 1;
		}
		else if (t == 1)
		{
		return 0;
		}
	}
	public static int Main()
	{
		  int i;
		  int n;
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  t = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",f(t, 2));
		  }
	}

}

