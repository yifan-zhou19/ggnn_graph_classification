package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 6;i <= n;i = i + 2)
		{
			int m = i;
		int l = 3;
		int a = 1;
			do
			{
				int r;
				int k;
			k = Math.sqrt(l);
			for (r = 3;r <= k;r = r + 2)
			{
				if (l % r == 0)
				{
					break;
				}
			}
				if (r >= k + 1)
				{
				int s;
				s = m - l;
				int t = Math.sqrt(s);
				int j;
				for (j = 3;j <= t;j = j + 2)
				{
				if (s % j == 0)
				{
					break;
				}
				}
				if (j >= t + 1)
				{
				System.out.printf("%d=%d+%d\n",m,l,s);
				a = 0;
				}
				else
				{
					l = l + 2;
				}
				}
				else
				{
					l = l + 2;
				}
			} while (a != 0);
		}
	}
}

