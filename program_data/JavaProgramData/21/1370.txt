package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] num = new int[300];
		double ping = 0;
		double[] cha = new double[300];
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
				num[i] = Integer.parseInt(tempVar2);
			}
			ping += (double) num[i] / n;
		}


		for (i = 0;i < n;i++)
		{
			cha[i] = num[i] - ping;

		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (cha[j] > cha[j + 1])
				{
					double tmp;
					tmp = cha[j + 1];
					cha[j + 1] = cha[j];
					cha[j] = tmp;
				}
			}
		}


		if (cha[0] + cha[n - 1] > 0)
		{
			System.out.printf("%.0lf",cha[n - 1] + ping);
		}
		else if (cha[0] + cha[n - 1] == 0)
		{
			System.out.printf("%.0lf,%.0lf",ping + cha[0],ping + cha[n - 1]);
		}
		else
		{
			System.out.printf("%.0lf",ping + cha[0]);
		}


		return 0;
	}





}

