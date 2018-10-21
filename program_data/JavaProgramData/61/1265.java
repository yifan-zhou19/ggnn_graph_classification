package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		if (a == 2)
		{
			return 1;
		}
		else
		{
			return f(a - 1) + f(a - 2);
		}
	}
	public static int Main()
	{
		int n = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.printf("%d\n",f(m));
		}
		return 0;
	}
}

