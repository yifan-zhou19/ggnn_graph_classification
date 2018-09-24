package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int a;
		int b;
		int sum1;
		int sum2;
		char[][] xb = new char[40][7];
		double[] sg = new double[40];
		double k;
		double[] nan = new double[40];
		double[] nv = new double[40];
		k = 0;
		b = 0;
		a = 0;
		sum1 = 0;
		sum2 = 0;
		for (i = 0;i < 40;i++)
		{
			nan[i] = 0.0;
			nv[i] = 0.0;
		}
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
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
			j = strcmp(xb[i],"male");
			if (j == 0)
			{
				nan[b] = sg[i];
				b++;
				sum1++;
			}
			else
			{
				nv[a] = sg[i];
				a++;
				sum2++;
			}
		}
		for (i = 0;i < sum1;i++)
		{
			for (j = 0;j < sum1 - 1;j++)
			{
				if (nan[j] > nan[j + 1])
				{
					k = nan[j + 1];
					nan[j + 1] = nan[j];
					nan[j] = k;
				}
			}
		}
		for (i = 0;i < sum2;i++)
		{
			for (j = 0;j < sum2 - 1;j++)
			{
				if (nv[j] < nv[j + 1])
				{
					k = nv[j + 1];
					nv[j + 1] = nv[j];
					nv[j] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			j = strcmp(xb[i],"male");
			if (j == 0)
			{
				System.out.printf("%.2lf",nan[0]);
				break;
			}
		}
		b = 1;
		for (i = i + 1;i < n;i++)
		{
			j = strcmp(xb[i],"male");
			if (j == 0)
			{
				System.out.printf(" %.2lf",nan[b]);
				b++;
			}
		}
		a = 0;
		for (i = 0;i < n;i++)
		{
			j = strcmp(xb[i],"female");
			if (j == 0)
			{
				System.out.printf(" %.2lf",nv[a]);
				a++;
			}
		}
		return 0;
	}








}

