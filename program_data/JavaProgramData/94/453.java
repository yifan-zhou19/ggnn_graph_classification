package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[500];
		int[] m = new int[500];
		int number;
		int i;
		int k;
		int e;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		i = 0;
		k = 0;
		while (i < number)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] % 2 == 1)
			{
				m[k] = n[i];
				k++;
			}
			i++;
		}
		for (i = 1;i <= k;i++)
		{
			for (p = 0;p < k - i;p++)
			{
				if (m[p] > m[p + 1])
				{
					e = m[p + 1];
					m[p + 1] = m[p];
					m[p] = e;
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",m[i - 1]);
			}
			else
			{
				System.out.printf(",%d",m[i - 1]);
			}
		}
		return 0;
	}
}

