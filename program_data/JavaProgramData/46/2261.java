package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int p = 1;
		int q = 1;
		double[][] a = new double[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (p = 1;p <= x;p++)
		{
			for (q = 1;q <= y;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[p][q] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (q = 0;q <= y;q++)
		{
				a[0][q] = 0.5;
		}
		for (q = 0;q <= y;q++)
		{
			  a[x + 1][q] = 0.5;
		}
		for (p = 1;p <= x;p++)
		{
				a[p][0] = 0.5;
		}
		for (p = 1;p <= x;p++)
		{
				a[p][y + 1] = 0.5;
		}
		int i = 1;
		int j = 1;
		while (a[i][j] - Math.floor(a[i][j]) == 0)
		{
			  System.out.printf("%.0lf\n",a[i][j]);
			  a[i][j] = 0.5;
			if (a[i][j + 1] - Math.floor(a[i][j + 1]) == 0 && a[i + 1][j] - Math.floor(a[i + 1][j]) == 0 || a[i][j + 1] - Math.floor(a[i][j + 1]) == 0 && a[i + 1][j] - Math.floor(a[i + 1][j]) != 0 && a[i - 1][j] - Math.floor(a[i - 1][j]) != 0)
			{
				j = j + 1;
			}
			else if (a[i + 1][j] - Math.floor(a[i + 1][j]) == 0)
			{
				 i = i + 1;
			}
				  else if (a[i][j - 1] - Math.floor(a[i][j - 1]) == 0)
				  {
						j = j - 1;
				  }
						else if (a[i - 1][j] - Math.floor(a[i - 1][j]) == 0)
						{
							  i = i - 1;
						}
							 else
							 {
								 break;
							 }
		}
	  System.in.read();
	  System.in.read();
	return 0;
	}
}

