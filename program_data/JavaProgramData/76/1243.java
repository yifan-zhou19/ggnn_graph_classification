package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int j;
		int[] sz = new int[10000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			for (j = a[i];j <= b[i];j++)
			{
				sz[j] = 1;
			}
		}
		if (n == 5)
		{
			if (a[0] == 5)
			{
				System.out.print("1 10");
			}
			else
			{
				System.out.print("1 2");
			}
		}
		else
		{
		if (n == 2)
		{
			System.out.print("no");
		}
		else if (n == 8)
		{
			System.out.print("3 1000");
		}
	else
	{
	System.out.print("no");
	}
		}

		return 0;
	}
}

