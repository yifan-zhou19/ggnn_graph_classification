package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int f;
		if (n == 1 || n == 2)
		{
			f = 1;
		}
		else
		{
			f = F(n - 1) + F(n - 2);
		}
		return (f);
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",F(a));
		}
		return 0;
	}

}

