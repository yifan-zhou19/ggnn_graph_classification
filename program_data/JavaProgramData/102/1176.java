package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int p;
		double[] h = new double[40];
		double[] mh = new double[40];
		double e;
		double[] wh = new double[40];
		char[][] s = new char[40][10];
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
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(s[i],"male") == 0)
			{
				mh[j] = h[i];
				j++;
			}
			else if (strcmp(s[i],"female") == 0)
			{
				wh[k] = h[i];
				k++;
			}
		}
		for (p = 1; p <= j; p++)
		{
			for (i = 0; i < j - p; i++)
			{
				if (mh[i] > mh[i + 1])
				{
					e = mh[i + 1];
					mh[i + 1] = mh[i];
					mh[i] = e;
				}
			}
		}
			for (p = 1; p <= k; p++)
			{
			for (i = 0; i < k - p; i++)
			{
				if (wh[i] > wh[i + 1])
				{
					e = wh[i + 1];
					wh[i + 1] = wh[i];
					wh[i] = e;
				}
			}
			}
			System.out.printf("%.2lf",mh[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2lf",mh[i]);
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",wh[i]);
		}
		return 0;
	}

}

