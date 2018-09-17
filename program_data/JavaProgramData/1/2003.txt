package <missing>;

public class GlobalMembers
{
	public static int factoring(int a,int b)
	{
		int i;
		int kind = 0;
		if (a == 1)
		{
			kind = 1;
		}

		else
		{
			for (i = b;i <= a;i++)
			{
				if (a % i == 0)
				{
					kind = factoring(a / i, i) + kind;
				}
			}
		}
		return kind;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[30000];
		int[] b = new int[30000];
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
			b[i] = factoring(a[i], 2);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

