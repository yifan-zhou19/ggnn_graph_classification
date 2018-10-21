package <missing>;

public class GlobalMembers
{
	public static int f(int a,int x)
	{
		int i;
		int j;
		if (x == 2)
		{
		return 1;
		}

		else
		{
			int result = 1;
			for (i = a;i <= x;i++)
			{
			if (x % i == 0 && x / i >= i)
			{
			result = result + f(i, x / i);
			}
			}
			return result;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(2, a));
		}
	}

}

