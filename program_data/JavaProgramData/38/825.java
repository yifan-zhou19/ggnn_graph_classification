package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] ge = new int[100];
		double[][] shu = new double[100][1000];
		double[] pingjun = new double[100];
		double[] s = new double[100];
		int i;
		int j;
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
				ge[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < ge[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shu[i][j] = Double.parseDouble(tempVar3);
				}
				pingjun[i] += shu[i][j] / ge[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < ge[i];j++)
			{
				s[i] += Math.pow((shu[i][j] - pingjun[i]),2) / ge[i];
			}
			System.out.printf("%.5lf\n",Math.sqrt(s[i]));
		}
		return 0;
	}

}

