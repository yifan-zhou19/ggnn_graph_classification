package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e;
		int n;
		int t;
		int j;
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
		for (j = 1,e = 0;e == 0;j++)
		{
		for (i = 0,t = j;i < n;i++)
		{
			e = t * n + k;
			if (e % (n - 1) == 0 || i == n - 1)
			{
				t = e / (n - 1);
			}
			else
			{
				e = 0;
				break;
			}
		}
		}
		System.out.printf("%d\n",e);
		return 0;
	}
}

