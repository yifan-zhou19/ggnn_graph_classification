package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int nan = 0;
		int nv = 0;
		double[] h1 = new double[40];
		double[] h2 = new double[40];
		double h;
		String sex = new String(new char[7]);
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
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				h1[j] = h;
				nan++;
				j++;
			}
			if (sex.charAt(0) == 'f')
			{
				h2[k] = h;
				nv++;
				k++;
			}
		}
		for (i = 0;i < nan - 1;i++)
		{
			for (j = 0;j < nan - 1 - i;j++)
			{
				if (h1[j] > h1[j + 1])
				{
					h = h1[j + 1];
					h1[j + 1] = h1[j];
					h1[j] = h;
				}
			}
		}
		for (i = 0;i < nv - 1;i++)
		{
			for (j = 0;j < nv - 1 - i;j++)
			{
				if (h2[j] < h2[j + 1])
				{
					h = h2[j + 1];
					h2[j + 1] = h2[j];
					h2[j] = h;
				}
			}
		}
		System.out.printf("%.2lf",h1[0]);
		for (i = 1;i < nan;i++)
		{
			System.out.printf(" %.2lf",h1[i]);
		}
		for (i = 0;i < nv;i++)
		{
			System.out.printf(" %.2lf",h2[i]);
		}
		return 0;
	}
}

