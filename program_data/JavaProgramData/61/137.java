package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int k;
		if (n == 1 || n == 2)
		{
			k = 1;
		}
		else
		{
			k = f(n - 2) + f(n - 1);
		}
		return k;
	}
	public static int Main()
	{
		int t;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (j = 0;j < t;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			i = f(n);
			System.out.printf("%d\n",i);
		}


		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

