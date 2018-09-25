package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int q = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		String sex = new String(new char[7]);
		double[] h = new double[41];
		double[] mh = new double[41];
		double[] fh = new double[41];
		double cs;
		double sf;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				mh[j] = h[i];
				j++;
			}
			else
			{
				fh[q] = h[i];
				q++;
			}
		}
		for (int k = 0;k < j;k++)
		{
			for (int m = 0;m < j;m++)
			{
				if (mh[m] > mh[m + 1])
				{
					cs = mh[m];
					mh[m] = mh[m + 1];
					mh[m + 1] = cs;
				}
			}
		}
		for (int r = 1;r <= j;r++)
		{
			System.out.printf("%.2lf ",mh[r]);
		}
		for (int l = 0;l < q;l++)
		{
			for (int d = 0;d < q;d++)
			{
				if (fh[d] < fh[d + 1])
				{
					sf = fh[d];
					fh[d] = fh[d + 1];
					fh[d + 1] = sf;
				}
			}
		}
		for (int o = 0;o < q - 1;o++)
		{
			System.out.printf("%.2lf ",fh[o]);
		}
			System.out.printf("%.2lf",fh[q - 1]);
		return 0;
	}

}

