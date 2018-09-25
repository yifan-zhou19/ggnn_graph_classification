package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i = 0;
		int j;
		int[] d = new int[50];
		int[] a = new int[50];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		while (t-- != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d[i++] = Integer.parseInt(tempVar2);
		}
		}
		a[0] = 1;
		m = 1;
		for (j = 1;j < n;j++)
		{
						a[j] = 1;
		}
						for (j = 1;j < n;j++)
						{
										for (i = 0;i < j;i++)
										{
														if (d[i] >= d[j])
														{
															if (a[i] + 1 > a[j])
															{
														a[j] = a[i] + 1;
															}
														}
										}
														if (a[j] > m)
														{
														m = a[j];
														}
						}
														System.out.printf("%d\n",m);
														System.in.read();
														System.in.read();
														System.in.read();

	}



}

