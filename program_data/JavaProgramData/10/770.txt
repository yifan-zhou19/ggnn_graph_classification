package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int p;
		int[] h = new int[100];
		int[] m = new int[100];
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j < k;j++)
			{
				if ((h[j] <= h[i]) && (m[i] < m[j] + 1))
				{
					m[i] = m[j] + 1;
				}
			}
		}
		for (p = 0;p < k;p++)
		{
			if (m[p] > max)
			{
				max = m[p];
			}
		}
		System.out.printf("%d",max + 1);
		return 0;
	}



}

