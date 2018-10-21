package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j1 = 0;
	int j2 = 0;
	double[] sz = new double[40];
	double[] male = new double[40];
	double[] female = new double[40];
	double tmp;
	char[][] sex = new char[40][10];
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
		sz[i] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		if (sex[i][0] == 'f')
		{
			female[j1] = sz[i];
			j1++;
		}
		else
		{
			male[j2] = sz[i];
			j2++;
		}
	}
	for (i = 0;i < j2 - 1;i++)
	{
		if (male[i] > male[i + 1])
		{
			tmp = male[i];
			male[i] = male[i + 1];
			male[i + 1] = tmp;
			if (i != 0)
			{
				i = i - 2;
			}
		}
	}
	for (i = 0;i < j1 - 1;i++)
	{
		if (female[i] < female[i + 1])
		{
			tmp = female[i];
			female[i] = female[i + 1];
			female[i + 1] = tmp;
			if (i != 0)
			{
				i = i - 2;
			}
		}
	}
	for (i = 0;i < j2;i++)
	{
		System.out.printf("%.2lf ",male[i]);
	}
	for (i = 0;i < j1 - 1;i++)
	{
		System.out.printf("%.2lf ",female[i]);
	}
	System.out.printf("%.2lf",female[j1 - 1]);
	return 0;
	}
}

