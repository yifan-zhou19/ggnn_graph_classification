package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int k;
		int n;
		int t;
		int i;
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
		for (m = 2;;m++)
		{
			t = m;
			for (i = 1;i <= n;i++)
			{
				if ((t - k) % n != 0 || (t - k) <= 0)
				{
					break;
				}
				t = t - (t - k) / n - k;
			}
			if (i >= n + 1)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
	}

}

