package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] b = new int[100001];
		int[] a = new int[100000];
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
	if (m < a[i])
	{
	m = a[i];
	}
		}
			b[1] = 1;
			b[2] = 1;
			for (i = 3;i <= m;i++)
			{
			b[i] = b[i - 1] + b[i - 2];
			}
	for (i = 1;i <= n;i++)
	{
			System.out.printf("%d\n",b[a[i]]);
	}
		return 0;
	}

}

