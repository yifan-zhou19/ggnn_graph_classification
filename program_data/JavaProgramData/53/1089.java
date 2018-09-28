package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] sz = new int[300];
		int flag;
		double[] xsz = new double[300];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		xsz[0] = sz[0];
		for (i = 1;i < n;i++)
		{
			k = 0;
			while (k < i)
			{
				if (sz[i] == xsz[k])
				{
					flag = 0;
					xsz[i] = 0.1;
					break;
				}
				else
				{
					flag = 1;
					k++;
				}
			}
			if (flag = 1)
			{
				xsz[k] = sz[i];
			}
		}
		System.out.printf("%.lf",xsz[0]);
			 for (j = 1;j < i;j++)
			 {
			if (xsz[j] != 0.1)
			{
				System.out.printf(",%.lf",xsz[j]);
			}
			 }
		return 0;
	}
}

