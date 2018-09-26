package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		if (n <= 2)
		{
			return 1;
		}
		return F(n - 1) + F(n - 2);
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",F(a[i]));
		}
		return 0;
	}


}

