package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int result;
		if (n == 1 || n == 2)
		{
			result = 1;
		}
		else
		{
			result = f(n - 1) + f(n - 2);
		}
		return result;
	}
	public static void Main(String[] args)
	{
		int m;
		int p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (i = 0;i < p;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(m));
		}
	}
}

