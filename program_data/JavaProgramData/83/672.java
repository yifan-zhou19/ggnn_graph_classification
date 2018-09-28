package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		double[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (k = 0;k < n;k++)
		{
			if (b[k] <= 100 && b[k] >= 90)
			{
			c[k] = 4.0 * a[k];
			}
		else
		{
			if (b[k] <= 89 && b[k] >= 85)
			{
				c[k] = 3.7 * a[k];
			}
			else
			{
				if (b[k] <= 84 && b[k] >= 82)
				{
				   c[k] = 3.3 * a[k];
				}
				else
				{
					  if (b[k] <= 81 && b[k] >= 78)
					  {
					   c[k] = 3.0 * a[k];
					  }

					else
					{
						if (b[k] <= 77 && b[k] >= 75)
						{
							c[k] = 2.7 * a[k];
						}
						  else
						  {
							 if (b[k] <= 74 && b[k] >= 72)
							 {
								c[k] = 2.3 * a[k];
							 }

							 else
							 {
								  if (b[k] <= 71 && b[k] >= 68)
								  {
									 c[k] = 2.0 * a[k];
								  }

									else
									{
									   if (b[k] <= 67 && b[k] >= 64)
									   {
										  c[k] = 1.5 * a[k];
									   }
										 else
										 {
											 if (b[k] <= 63 && b[k] >= 60)
											 {
											   c[k] = 1.0 * a[k];
											 }
											 else
											 {
												 if (b[k] < 60)
												 {
													 c[k] = 0;
												 }
											 }
										 }
									}
							 }
						  }
					}
				}
			}
		}
		}
		double q = 0;
		double w = 0;
		double x;
		int u;
		int v;
		for (u = 0;u < n;u++)
		{
			q = q + c[u];
		}
		for (v = 0;v < n;v++)
		{
			w = w + a[v];
		}
		x = q / w;
		System.out.printf("%.2lf",x);


		return 0;
	}


}

