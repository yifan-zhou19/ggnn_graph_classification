package <missing>;

public class GlobalMembers
{
	public static int fun(int x)
	{
		int i;
		for (i = 2; i <= (int)Math.sqrt(x); i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= a / 2;i += 2)
		{
						  if (fun(i) == 1 && fun(a - i) == 1)
						  {
						  System.out.printf("%d %d\n",i,a - i);
						  }
		}
		return 0;
	}


}

