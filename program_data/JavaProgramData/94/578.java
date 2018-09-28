package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[500];
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		int t = 0;
		int[] m = new int[500];
		for (i = 0;i < n;i++)
		{
			if (num[i] % 2 != 0)
			{
				m[t] = num[i];
				t++;
			}
		}
		for (i = 0;i < t;i++)
		{
			for (l = t;l > i;l--)
			{
				if (m[l] < m[l - 1])
				{
					int k = m[l];
					m[l] = m[l - 1];
					m[l - 1] = k;
				}
			}
		}
		for (i = 1;i < t;i++)
		{
			System.out.printf("%d,",m[i]);
		}
		for (i = t;i < t + 1;i++)
		{
			System.out.printf("%d\n",m[i]);
		}
		return 0;
	}

}

