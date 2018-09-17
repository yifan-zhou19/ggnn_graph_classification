package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e = 0;
		int w = 0;
		char[][] sex = new char[50][9];
		double[] height = new double[50];
		double[] mh = new double[50];
		double[] fh = new double[50];
		double temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				mh[e++] = height[i];
			}
			else
			{
				fh[w++] = height[i];
			}
		}
		for (int k = 1;k <= e+1;k++)
		{
			for (int j = 0;j < e - k;j++)
			{
				if (mh[j] > mh[j + 1])
				{
					temp = mh[j];
					mh[j] = mh[j + 1];
					mh[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < e;i++)
		{
		System.out.printf("%.2lf ",mh[i]);
		}
		for (int k = 1;k <= w + 1;k++)
		{
			for (int j = 0;j < w - k;j++)
			{
				if (fh[j] < fh[j + 1])
				{
					temp = fh[j];
					fh[j] = fh[j + 1];
					fh[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < w - 1;i++)
		{
		System.out.printf("%.2lf ",fh[i]);
		}
		System.out.printf("%.2lf",fh[w - 1]);
		return 0;


	}
}

