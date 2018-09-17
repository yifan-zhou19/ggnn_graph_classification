package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int j;
		int k;
		int a;
		int b;
		String sex = new String(new char[6]);
		double he;
		double[] mahe = new double[40];
		double[] fehe = new double[40];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0,k = 0;i < n;i++)
		{
			char[] sex = {0, '\0', '\0', '\0', '\0', '\0'};
			he = 0;
			scanf("\n");
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				he = Double.parseDouble(tempVar3);
			}
			if (sex[0] == 'm')
			{
				 mahe[j] = he;
				 j++;
			}
			else
			{
				if (sex[0] == 'f')
				{
					fehe[k] = he;
					k++;
				}
			}
		}
		for (a = 1;a < j;a++)
		{
			for (b = 0;b < j - a;b++)
			{
				if (mahe[b] > mahe[b + 1])
				{
					  e = mahe[b];
					  mahe[b] = mahe[b + 1];
					  mahe[b + 1] = e;
				}

			}
		}
		for (a = 1;a < k;a++)
		{
			for (b = 0;b < k - a;b++)
			{
				if (fehe[b] < fehe[b + 1])
				{
					  e = fehe[b];
					  fehe[b] = fehe[b + 1];
					  fehe[b + 1] = e;
				}

			}
		}
		System.out.printf("%.2lf",mahe[0]);
		for (i = 1;i < j;i++)
		{
		System.out.printf(" %.2lf",mahe[i]);
		}
		System.out.printf(" %.2lf",fehe[0]);
		for (i = 1;i < k;i++)
		{
		System.out.printf(" %.2lf",fehe[i]);
		}
		return 0;


	}
}

