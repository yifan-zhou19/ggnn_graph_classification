package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int sum0;
		int n;
		int s;
		int t;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum0 = 0;
		t = 0;
		for (i = 1;i <= n;i++)
		{
			s = 0;
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
		if (a == 0)
		{
			sum0 = sum0 + 1;
		s = s + 1;
		}
		}
		if (s != 0)
		{
			t = s;
		}
		else
		{
			t = t;
		}
		}
		b = (t - 2) * (sum0 - 2 * t) / 2;
		System.out.printf("%d\n",b);
		return 0;
	}


}

