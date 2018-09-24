package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int malenum = 0;
		double[] h0 = new double[40];
		double[] hmale = new double[40];
		double[] hfe = new double[40];
		double e;
		char[][] stu0 = new char[40][10];
		final String male = "male";
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
				stu0[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h0[i] = Double.parseDouble(tempVar3);
			}
			hmale[i] = 100;
			hfe[i] = 0;
			if (strcmp(stu0[i],male) == 0)
			{
				hmale[i] = h0[i];
				malenum++;
			}
			else
			{
				hfe[i] = h0[i];
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (hmale[i] > hmale[i + 1])
				{
					e = hmale[i + 1];
					hmale[i + 1] = hmale[i];
					hmale[i] = e;
				}
			}
		}
		for (i = 0;i < malenum;i++)
		{
			System.out.printf("%.2lf ",hmale[i]);
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (hfe[i] < hfe[i + 1])
				{
					e = hfe[i + 1];
					hfe[i + 1] = hfe[i];
					hfe[i] = e;
				}
			}
		}
		for (i = 0;i < n - malenum - 1;i++)
		{
			System.out.printf("%.2lf ",hfe[i]);
		}
		System.out.printf("%.2lf",hfe[n - malenum - 1]);
		return 0;
	}
}

