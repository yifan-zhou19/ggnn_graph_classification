package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int a;
		int c = 1;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				if (c != 0)
				{
					t = i;
					c = 0;
				}
				k = i;
			}
		}
		s = (k % n - t % n - 1) * (k / n - t / n - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

