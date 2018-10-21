package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] sz = new int[100];
		int[] sx = new int[100];
		int[] sc = new int[100];
		double sum = 0;

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
				sc[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (sc[j] == 1)
			{
				System.out.print("2.000\n");
			}
			else if (sc[j] == 2)
			{
				System.out.print("3.500\n");
			}
			else
			{
			for (k = 2;k < sc[j];k++)
			{
	sz[0] = 2;
		sx[0] = 1;
		sz[1] = 3;

		sx[1] = 2;
				sz[k] = sz[k - 1] + sz[k - 2];
				sx[k] = sx[k - 1] + sx[k - 2];
				sum += (double)sz[k] / (double)sx[k];
			}
			System.out.printf("%.3lf\n",sum + 3.5);
			sum = 0;
			}
		}
		return 0;
	}
}

