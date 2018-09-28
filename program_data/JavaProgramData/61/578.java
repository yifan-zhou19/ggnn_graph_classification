package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int result;
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			result = f(n - 1) + f(n - 2);
			return result;
		}
	}
	public static int Main()
	{
		int n;
		int t;
		int i;
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
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(n));
		}



		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

