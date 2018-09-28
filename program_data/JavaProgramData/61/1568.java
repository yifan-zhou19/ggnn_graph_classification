package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int f1 = 1;
		int f2 = 1;
		int f3 = f1 + f2;
		int i;
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i < n;i++)
			{
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f3;
		}
	}

	public static int Main()
	{
		int[] n = new int[1000];
		int[] a = new int[1000];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			a[i] = F(n[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",a[i]);
		}

		return 0;
	}

}

