package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] hi = new double[40];
		double[] ghi = new double[40];
		double[] bhi = new double[40];
		double h;
		char[][] sex = new char[40][7];
		int n;
		int i;
		int g;
		int b;
		int k;
		g = 0;
		b = 0;
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hi[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'f')
			{
				ghi[g] = hi[i];
				g++;
			}
			else
			{
				bhi[b] = hi[i];
				b++;
			}
		}
		for (k = 1;k < g;k++)
		{
			for (i = 0;i < g - k;i++)
			{
				if (ghi[i] < ghi[i + 1])
				{
					h = ghi[i];
					ghi[i] = ghi[i + 1];
					ghi[i + 1] = h;
				}
			}
		}
		for (k = 1;k < b;k++)
		{
			for (i = 0;i < b - k;i++)
			{
				if (bhi[i] > bhi[i + 1])
				{
					h = bhi[i];
					bhi[i] = bhi[i + 1];
					bhi[i + 1] = h;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%.2lf ",bhi[i]);
		}
		for (i = 0;i < g;i++)
		{
			System.out.printf("%.2lf",ghi[i]);
			if (i < g - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

