package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int l = 0;
		double[] a = new double[1000];
		double[] male = new double[1000];
		double[] female = new double[1000];
		double m;
		char[][] sex = new char[1000][10];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				male[k] = a[i];
				k++;
			}
			else if (sex[i][0] == 'f')
			{
				female[l] = a[i];
				l++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (male[i] > male[j])
				{
					m = male[j];
					male[j] = male[i];
					male[i] = m;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = i + 1;j < l;j++)
			{
				if (female[i] < female[j])
				{
					m = female[j];
					female[j] = female[i];
					female[i] = m;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (j = 0;j < l - 1;j++)
		{
			System.out.printf("%.2lf ",female[j]);
		}
		System.out.printf("%.2lf",female[l - 1]);
		return 0;
	}





}

