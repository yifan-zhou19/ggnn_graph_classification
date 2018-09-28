package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int re;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				a[j]++;
				b[i]++;
			}
		}
		re = 1;
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1 && b[i] == 0)
			{
				re *= 0;
			}
		}
		if (re == 1)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == n - 1 && b[i] == 0)
				{
					System.out.printf("%d\n",i);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

