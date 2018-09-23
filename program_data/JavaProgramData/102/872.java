package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int r = 0;
		double[] mh = new double[50];
		double[] fh = new double[50];
		double zs = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zs = Double.parseDouble(tempVar3);
			}
					if (a.charAt(0) == 'm')
					{
				mh[j] = zs;
				j++;
					}
			else if (a.charAt(0) == 'f')
			{
				fh[k] = zs;
				k++;
			}
		}
		for (i = j - 1;i > 0;i--)
		{
			for (r = 0;r < i;r++)
			{
				if (mh[r] > mh[r + 1])
				{
					double tmpm;
					tmpm = mh[r + 1];
					mh[r + 1] = mh[r];
					mh[r] = tmpm;
				}
			}
		}
		for (i = k - 1;i > 0;i--)
		{
			for (r = 0;r < i;r++)
			{
				if (fh[r] > fh[r + 1])
				{
					double tmpf;
					tmpf = fh[r + 1];
					fh[r + 1] = fh[r];
					fh[r] = tmpf;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",mh[i]);
		}
		for (i = k - 1;i >= 0;i--)
		{
			if (i == k - 1)
			{
				System.out.printf("%.2lf",fh[i]);
			}
			else
			{
				System.out.printf(" %.2lf",fh[i]);
			}

		}
		return 0;
	}
}

