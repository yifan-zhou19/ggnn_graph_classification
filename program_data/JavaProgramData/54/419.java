package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int r = 1;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;r < n;i++)
		{
			for (j = i, s = (j * n + k) % (n - 1), r = 1;s == 0 && r < n;r++)
			{
				j = (j * n + k) / (n - 1);
				s = (j * n + k) % (n - 1);
			}
		}
		System.out.printf("%d\n",j * n + k);
	}
}

