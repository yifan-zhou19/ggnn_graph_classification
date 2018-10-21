package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int m;
		int s;
		int t;
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
		for (s = n + k;;s++)
		{
			t = s;
			m = 0;
			if (t % n == k)
			{
			for (i = 1;i < n;i++)
			{
				t = (t - k) - (t - k) / n;
				if (t % n == k && t >= k + n)
				{
					m = m;
				}
				else
				{
					m = m + 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.printf("%d\n",s);
				break;
			}
			else
			{
				continue;
			}
			}
		}


	}
}

