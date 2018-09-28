package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz[0] = n + 13 - 1;
		sz[1] = sz[0] + 31;
		sz[2] = sz[1] + 28;
		sz[3] = sz[2] + 31;
		sz[4] = sz[3] + 30;
		sz[5] = sz[4] + 31;
		sz[6] = sz[5] + 30;
		sz[7] = sz[6] + 31;
		sz[8] = sz[7] + 31;
		sz[9] = sz[8] + 30;
		sz[10] = sz[9] + 31;
		sz[11] = sz[10] + 30;
		for (i = 0;i < 12;i++)
		{
			if (sz[i] % 7 == 5)
			{
			 System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

