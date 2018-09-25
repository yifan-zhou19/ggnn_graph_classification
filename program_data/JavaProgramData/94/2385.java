package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] z = new int[500];
		int s = 0;
		int m = 0;
		int[] j = new int[m];
		int e;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(z[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (z[i] % 2 != 0)
			{
				j[m] = z[i];
				s++;
				m++;
			}
		}
		for (int k = 1;k <= s;k++)
		{
			for (m = 0;m < s - k;m++)
			{
				if (j[m] > j[m + 1])
				{
				e = j[m];
				j[m] = j[m + 1];
				j[m + 1] = e;
				}

			}
		}
		for (m = 0;m < s - 1;m++)
		{
			System.out.printf("%d,",j[m]);
		}
		System.out.printf("%d",j[s - 1]);
		return 0;
	}

}

