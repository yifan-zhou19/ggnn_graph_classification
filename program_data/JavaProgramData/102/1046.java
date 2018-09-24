package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int n;
		int k;
		char[][] m = new char[40][8];
		double[] male = new double[40];
		double[] female = new double[40];
		double p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = 0;
	b = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p = Double.parseDouble(tempVar3);
		}
		if (strcmp(m[i],"male") == 0)
		{
			male[a] = p;
			a++;
		}
		else if (strcmp(m[i],"female") == 0)
		{
			female[b] = p;
			b++;
		}
	}
	for (k = a - 1;k > 0;k--)
	{
	for (i = 0;i < k;i++)
	{
		if (male[i] > male[i + 1])
		{
			double tmp;
			tmp = male[i + 1];
			male[i + 1] = male[i];
			male[i] = tmp;
		}
	}
	}
	for (k = b - 1;k > 0;k--)
	{
	for (i = 0;i < k;i++)
	{
		if (female[i] > female[i + 1])
		{
			double tmp;
			tmp = female[i + 1];
			female[i + 1] = female[i];
			female[i] = tmp;
		}
	}
	}
	System.out.printf("%.2lf",male[0]);
	for (i = 1;i < a;i++)
	{
	System.out.printf(" %.2lf",male[i]);
	}
	for (i = b - 1;i >= 0;i--)
	{
	System.out.printf(" %.2lf",female[i]);
	}
	return 0;
	}
}

