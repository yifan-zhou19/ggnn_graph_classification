package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int LEN;
		int[] sz = new int[1000];
		int i;
		int[] j = new int[500];
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			LEN = Integer.parseInt(tempVar);
		}
		for (i = 0;i < LEN;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1; k <= LEN; k++)
		{
			int e;
			for (int i = 0; i < LEN - k; i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}

		}
		for (i = 0;i < LEN;i++)
		{
			if (sz[i] % 2 != 0)
			{

				j[l] = sz[i];
				l++;
			}
		}
	System.out.printf("%d",j[0]);
		for (i = 1;i < l;i++)
		{
			System.out.printf(",%d",j[i]);
		}
		return 0;
	}

}

