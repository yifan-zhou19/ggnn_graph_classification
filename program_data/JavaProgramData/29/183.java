package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] sz1 = new int[300];
			int[] sz2 = new int[300];
			int m;
			int[] n = new int[300];
			int i;
			int j;
			double sum = 0.0;
			double[] fenshu = new double[300];
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
					n[i] = Integer.parseInt(tempVar2);
				}

				for (j = 0;j < n[i];j++)
				{
					sz1[0] = 2;
					sz1[1] = 3;
					sz2[0] = 1;
					sz2[1] = 2;
					if (j >= 2)
					{
						sz1[j] = sz1[j - 1] + sz1[j - 2];
						sz2[j] = sz1[j - 1];
					}
					fenshu[j] = 1.0 * sz1[j] / sz2[j];
					sum += fenshu[j];
				}
				System.out.printf("%.3lf\n",sum);
				sum = 0.0;
			}
			return 0;
	}
}

