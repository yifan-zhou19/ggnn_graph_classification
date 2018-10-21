package <missing>;

public class GlobalMembers
{
	public static int fei(int n)
	{
		if (n == 1 || n == 2)
		{
		return 1;
		}
		else
		{
		return fei(n - 1) + fei(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				int p = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
				int q = fei(p);
				System.out.printf("%d\n",q);
		}
	}
}

