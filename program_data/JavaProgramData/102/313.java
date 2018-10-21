package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int p = 0;
		int q = 0;
		int k;
		double h;
		double[] d = new double[40];
		double[] e = new double[40];
		double l;
		String a = new String(new char[10]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(a,"male") == 0)
			{
				   d[p] = h;
				   p++;
			}
				   else
				   {
					   e[q] = h;
				   q++;
				   }
		}

		if (p > 1)
		{
		for (k = p - 2;k >= 0;k--)
		{
			  for (i = 0;i <= k;i++)
			  {
				  if (d[i] > d[i + 1])
				  {
					  l = d[i];
				  d[i] = d[i + 1];
				  d[i + 1] = l;

				  }
			  }

		}

		}

			if (q > 1)
			{
		for (k = q - 2;k >= 0;k--)
		{
			  for (i = 0;i <= k;i++)
			  {
				  if (e[i] > e[i + 1])
				  {
					  l = e[i];
				  e[i] = e[i + 1];
				  e[i + 1] = l;

				  }
			  }

		}

			}


		System.out.printf("%.2f",d[0]);

		for (i = 1;i < p;i++)
		{
			System.out.printf(" %.2f",d[i]);
		}
		for (i = q - 1;i >= 0;i--)
		{
			System.out.printf(" %.2f",e[i]);
		}

	return 0;
	}
}

