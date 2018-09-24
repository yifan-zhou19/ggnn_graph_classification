package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int a = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n * n;i++)

		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		if (m == 0)
		{
			a = a + 1;
		}
		}

		t = (a + 4) / 4;
		System.out.printf("%d",(t - 2) * (t - 2));
		return 0;
	}
}

