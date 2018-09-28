package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int a;
		int r;

		int[] sz = new int[500];
		int[] hz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}

		}
		int j;
		j = 0;
		for (i = 0;i < m;i++)
		{
			if (sz[i] % 2 != 0)
			{

				hz[j] = sz[i];
				j++;
			}
		}
		for (a = j - 1;a > 0;a--)
		{
			for (r = 0;r < a;r++)
			{
				if (hz[r] > hz[r + 1])
				{
					int tmp = hz[r + 1];
					hz[r + 1] = hz[r];
					hz[r] = tmp;
				}
			}
		}


		for (i = 1;i <= j - 1;i++)
		{
			System.out.printf("%d,",hz[i - 1]);
		}
		System.out.printf("%d",hz[i - 1]);
		return 0;
	}



}

