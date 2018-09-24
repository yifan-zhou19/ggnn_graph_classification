package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int male = 1;
		int female;
		int j;
		int k;
		double shengao;
		double[] pai = new double[45];
		double huan;
		String x = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		female = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n ");
			if (tempVar3 != null)
			{
				shengao = Double.parseDouble(tempVar3);
			}
			if (x.charAt(0) == 'm')
			{
				pai[male] = shengao;
				male++;
			}
			if (x.charAt(0) == 'f')
			{
				pai[female] = shengao;
				female--;
			}
		}
			male--;
			female++;
			for (j = 1;j <= male;j++)
			{
				for (k = j;k <= male;k++)
				{
					if (pai[k] < pai[j])
					{
						huan = pai[k];
						pai[k] = pai[j];
						pai[j] = huan;
					}
				}
			}
			for (j = male+1;j <= n;j++)
			{
				for (k = j;k <= n;k++)
				{
					if (pai[k] > pai[j])
					{
						huan = pai[k];
						pai[k] = pai[j];
						pai[j] = huan;
					}
				}
			}
			for (i = 1;i < n;i++)
			{
			System.out.printf("%.2lf ",pai[i]);
			}
			System.out.printf("%.2lf\n",pai[n]);
			return 0;
	}

}

