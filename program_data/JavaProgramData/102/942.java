package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sex = new char[45][9];
		double[] l = new double[45];
		double[] l1 = new double[45];
		double[] l2 = new double[45];
		double e;
		int n;
		int i;
		int j = 0;
		int k = 0;
		int s;
		int sum1 = 0;
		int sum2 = 0;
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sex[i][0] == 'm')
			{
				l1[j++] = l[i];
				sum1++;

			}
			if (sex[i][0] == 'f')
			{
				l2[k++] = l[i];
				sum2++;
			}
		}
		for (s = 1;s <= sum1;s++)
		{
			for (j = 0;j < sum1 - s;j++)
			{
				if (l1[j] > l1[j + 1])
				{
					e = l1[j];
					l1[j] = l1[j + 1];
					l1[j + 1] = e;
				}
			}
		}
		for (s = 1;s <= sum2;s++)
		{
			for (k = 0;k < sum2 - s;k++)
			{
				if (l2[k] > l2[k + 1])
				{
					e = l2[k];
					l2[k] = l2[k + 1];
					l2[k + 1] = e;
				}
			}
		}
		for (j = 0;j < sum1;j++)
		{
			System.out.printf("%.2lf ",l1[j]);
		}
		for (k = sum2 - 1;k > 0;k--)
		{
			System.out.printf("%.2lf ",l2[k]);
		}
		System.out.printf("%.2lf",l2[0]);
		return 0;
	}

}

