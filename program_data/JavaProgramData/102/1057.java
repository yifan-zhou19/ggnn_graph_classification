package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[50];
		double sg;
		double e = 0;
		int n = 0;
		int z = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int y = 0;
		String xb = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		y = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xb = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sg = Double.parseDouble(tempVar3);
			}
			if (xb.charAt(0) == 'm')
			{
				a[z] = sg;
				z++;
			}
			else
			{
				a[y] = sg;
				y--;
			}
		}
			for (j = 0;j < z - 1;j++)
			{
				for (k = j;k < z;k++)
				{
					if (a[j] > a[k])
					{
					e = a[j];
					a[j] = a[k];
					a[k] = e;
					}
				}
			System.out.printf("%.2lf ",a[j]);
			}
		System.out.printf("%.2lf ",a[z - 1]);

				for (j = n;j > y + 1;j--)
				{
					for (k = j;k > y;k--)
					{
						if (a[j] > a[k])
						{
					e = a[j];
					a[j] = a[k];
					a[k] = e;
						}
					}
				}
				for (i = y + 1;i < n;i++)
				{
			System.out.printf("%.2lf ",a[i]);
				}
			   System.out.printf("%.2lf",a[n]);

					return 0;
	}

}

