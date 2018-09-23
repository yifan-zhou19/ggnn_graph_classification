package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int j = 0;
		int m;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100]);
		double[] ma = new double[40];
		double[] f = new double[40];
		double t;
		double a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Double.parseDouble(tempVar3);
			}
			if (strcmp(s,"male") == 0)
			{
				ma[k] = a;
				k++;
			}
			else
			{
				f[j] = a;
				j++;
			}
		}
		for (m = 1;m < k + 1;m++)
		{
			for (b = 0;b < k + 1 - m;b++)
			{
				if (ma[b] > ma[b + 1])
				{
					t = ma[b + 1];
					ma[b + 1] = ma[b];
					ma[b] = t;
				}
			}
		}
		for (m = 1;m < j + 1;m++)
		{
			for (b = 0;b < j + 1 - m;b++)
			{
				if (f[b] < f[b + 1])
				{
					t = f[b + 1];
					f[b + 1] = f[b];
					f[b] = t;
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%.2lf ",ma[i]);
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		   System.out.printf("%.2lf",f[j - 1]);
		return 0;
	}








}

