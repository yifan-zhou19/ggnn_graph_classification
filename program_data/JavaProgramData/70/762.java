package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] s = new double[200][2];
		double k;
		double max = 0;
		double y;
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
				s[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				k = (s[i][0] - s[j][0]) * (s[i][0] - s[j][0]) + (s[i][1] - s[j][1]) * (s[i][1] - s[j][1]);
				y = Math.sqrt(k);

				if (y > max)
				{
					max = y;
				}
			}
		}

			System.out.printf("%.4lf\n",max);
			return 0;


	}


}

