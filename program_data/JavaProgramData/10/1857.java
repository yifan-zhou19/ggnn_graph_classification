package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int max;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] h = new int[25];
		int[] m = new int[25];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		m[n - 1] = 1;
		max = m[n - 1];
		for (i = n - 2;i >= 0;i--)
		{
			m[i] = 1;
		for (k = i + 1;k <= n - 1;k++)
		{
			if ((h[i] >= h[k]) && (m[i] < 1 + m[k]))
			{
				m[i] = m[k] + 1;
			}
		}
			if (m[i] > max)
			{
				max = m[i];
			}
		}
		System.out.printf("%d",max);
	}
}

