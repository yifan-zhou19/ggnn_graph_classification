package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int t;
		int m;
		int s;
		int i;
		int j;
		s = 1;
		j = 0;
		i = 1;
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
		while (i <= n)
		{
			s = s * n;
			i++;
		}
		for (m = s;m >= n + k;m--)
		{
			t = m;
			for (j = 0;j <= n;j++)
			{
				t -= k;
				if ((t % n) != 0)
				{
					break;
				}
				t -= t / n;

			}
			if (j == n)
			{
				System.out.printf("%d\n",m);
			}
		}
	}


}

