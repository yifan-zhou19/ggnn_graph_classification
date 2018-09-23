package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int nmale = 0;
		int nfemale = 0;
		char[][] s = new char[40][7];
		double[] a = new double[40];
		double e;
		double[] male = new double[40];
		double[] female = new double[40];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(s[i],"male") == 0)
			{
				male[nmale] = a[i];
				nmale++;
			}
			else
			{
				female[nfemale] = a[i];
				nfemale++;
			}
		}
		for (j = 0;j < nmale;j++)
		{
			for (k = 0;k < nmale - j - 1;k++)
			{
				if (male[k] > male[k + 1])
				{
					e = male[k];
					male[k] = male[k + 1];
					male[k + 1] = e;
				}
			}
		}
		for (j = 0;j < nfemale;j++)
		{
			for (k = 0;k < nfemale - j - 1;k++)
			{
				if (female[k] < female[k + 1])
				{
					e = female[k];
					female[k] = female[k + 1];
					female[k + 1] = e;
				}
			}
		}
		for (j = 0;j < nmale;j++)
		{
			if (j == 0)
			{
				System.out.printf("%.2lf",male[j]);
			}
			else
			{
				System.out.printf(" %.2lf",male[j]);
			}
		}
		for (j = 0;j < nfemale;j++)
		{
			System.out.printf(" %.2lf",female[j]);
		}
		return 0;
	}


}

