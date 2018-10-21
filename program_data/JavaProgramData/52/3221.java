package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an = new int[100];
		int n;
		int m;
		int i;
		int x;
		int y;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				an[i] = Integer.parseInt(tempVar3);
			}
		}
		x = an[n - 1];
		k = 0;
		for (i = 0;;i++)
		{
			if (i > n - 1)
			{
				i = 0;
				x = an[n - 1];
			}
			else
			{
				i = i;
			}
			y = an[i];
			an[i] = x;
			x = y;
			k = k + 1;
			if (k == m * n)
			{
				break;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",an[i]);
		}
		System.out.printf("%d",an[i]);
		return 0;
	}

}

