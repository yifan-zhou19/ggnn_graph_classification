package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int nan = 0;
	int nv = 0;
	int j;
	double[] h = new double[40];
	double[] h1 = new double[40];
	double[] h2 = new double[40];
	double e;
	char[][] a = new char[40][7];
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
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h[i] = Double.parseDouble(tempVar3);
		}
		for (j = 0;j < 10;j++)
		{
			if (a[i][j] == 'f')
			{
			h1[nv] = h[i];
			nv++;
			break;
			}
			else if (a[i][j] == 'm')
			{
			   h2[nan] = h[i];
			   nan++;
			   break;
			}
		}
	}
			for (i = 0;i < nan;i++)
			{
				for (j = 0;j < nan - i - 1;j++)
				{
					if (h2[j] > h2[j + 1])
					{
								e = h2[j];
								h2[j] = h2[j + 1];
								h2[j + 1] = e;
					}
				}
			}
		   for (i = 0;i < nv;i++)
		   {
				for (j = 0;j < nv - i - 1;j++)
				{
					if (h1[j] < h1[j + 1])
					{
								e = h1[j];
								h1[j] = h1[j + 1];
								h1[j + 1] = e;
					}
				}
		   }
					 for (i = 0;i < nan;i++)
					 {
					  System.out.printf("%.2lf ",h2[i]);
					 }

						 for (i = 0;i < nv - 1;i++)
						 {
					  System.out.printf("%.2lf ",h1[i]);
						 }
					  System.out.printf("%.2lf",h1[nv - 1]);





				 return 0;

	}





}

