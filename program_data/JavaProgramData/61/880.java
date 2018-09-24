package <missing>;

public class GlobalMembers
{
	public static int num(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 1;
		}
		if (n >= 3)
		{
			return num(n - 1) + num(n - 2);
		}
	}

	public static int Main()
	{
		int n;
		int s;
		int i;
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
				s = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",num(s));
		}
		System.in.read();
		System.in.read();
	}
}

