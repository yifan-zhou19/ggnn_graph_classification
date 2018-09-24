package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] ren = new char[50][10];
		double[] h = new double[50];
		int i;
		char[][] boy = new char[50][10];
		char[][] girl = new char[50][10];
		double[] hb = new double[50];
		double[] hg = new double[50];
		int k1 = 0;
		int k2 = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ren[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}

			if (String.valueOf(ren[i]).length() == 4)
			{
				boy[k1] = ren[i];
				hb[k1] = h[i];
				k1++;

			}
			else
			{
				girl[k2] = ren[i];
				hg[k2] = h[i];
				k2++;
			}
		}
		int k;
		for (k = 1;k <= k1;k++)
		{
			for (i = 0;i < k1 - k;i++)
			{
				if (hb[i] > hb[i + 1])
				{
					double e;
					e = hb[i];
					hb[i] = hb[i + 1];
					hb[i + 1] = e;
				}
			}

		}
		for (i = 0;i < k1;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%.2lf",hb[i]);

		}
			for (k = 1;k <= k2;k++)
			{
			for (i = 0;i < k2 - k;i++)
			{
				if (hg[i] > hg[i + 1])
				{
					double e;
					e = hg[i];
					hg[i] = hg[i + 1];
					hg[i + 1] = e;
				}
			}

			}
		for (i = k2 - 1;i >= 0;i--)
		{

			System.out.print(" ");
			System.out.printf("%.2lf",hg[i]);

		}

		return 0;

	}

}

