package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int u;
		int m;
		int n;
		int x;
		int y;
		int sum;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[50];
		double[] c = new double[50];
		double d;
		char[][] b = new char[50][10];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Double.SIZE / Byte.SIZE));
		x = 0;
		y = 0;
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							b[i] = tempVar2.charAt(0);
						}
						if (b[i][0] == 'm')
						{
										   String tempVar3 = ConsoleInput.scanfRead();
										   if (tempVar3 != null)
										   {
											   a[i] = Double.parseDouble(tempVar3);
										   }
										   y++;
						}
						else if (b[i][0] == 'f')
						{
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								c[i] = Double.parseDouble(tempVar4);
							}
							x++;
						}
		}
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n - i;j++)
						{
										  if (a[j] < a[j + 1])
										  {
													d = a[j];
													a[j] = a[j + 1];
													a[j + 1] = d;
										  }
						}
		}
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n - i;j++)
						{
										  if (c[j] < c[j + 1])
										  {
													d = c[j];
													c[j] = c[j + 1];
													c[j + 1] = d;
										  }
						}
		}
		for (i = y - 1;i >= 0;i--)
		{
						   if (i == y - 1)
						   {
						   System.out.printf("%.2lf",a[i]);
						   }
						   else
						   {
						   System.out.printf(" %.2lf",a[i]);
						   }
		}
		for (i = 0;i < x;i++)
		{
						System.out.printf(" %.2lf",c[i]);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			u = Integer.parseInt(tempVar5);
		}
		return 0;
	}



}

