package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j1;
		int j2;
		int j;
		double[] a = new double[50];
		double[] b = new double[50];
		double[] c = new double[50];
		char[][] xb = new char[50][10];
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
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		j1 = 0;
		for (i = 0;i < n;i++)
		{
		 if (strcmp(xb[i],"male") == 0)
		 {
			 b[j1] = a[i];
			 j1++;
		 }
		}
		j2 = 0;
		for (i = 0;i < n;i++)
		{
		 if (strcmp(xb[i],"female") == 0)
		 {
			 c[j2] = a[i];
			 j2++;
		 }
		}
		for (i = j1 - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (b[j] > b[j + 1])
				{
					double t1;
					t1 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t1;
				}
			}
		}
		for (i = 0;i < j1;i++)
		{
		System.out.printf("%.2lf ",b[i]);
		}
		for (i = j2 - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (c[j] > c[j + 1])
				{
					double t2;
					t2 = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t2;
				}
			}
		}
		for (i = j2 - 1;i > 0;i--)
		{
		System.out.printf("%.2lf ",c[i]);
		}
			 System.out.printf("%.2lf",c[0]);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}


}

