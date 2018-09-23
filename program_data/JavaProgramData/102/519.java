package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int m = 0;
		int j;
		double b;
		double[] c = new double[100];
		double[] h = new double[100];
		double s;
		double k;
		String f = new String(new char[100]);
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
				f = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			c[i] = 0.0;
			h[i] = 0.0;
			if (strcmp(f,"male") == 0)
			{
				c[i] = b;
			}
			else if (strcmp(f,"female") == 0)
			{
				m++;
				h[i] = b;
			}
		}
	for (i = 1;i < n;i++)
	{
		for (j = 0;j < n - i;j++)
		{
			if (c[j] > c[j + 1])
			{
				s = c[j];
				c[j] = c[j + 1];
				c[j + 1] = s;
			}
			if (h[j] < h[j + 1])
			{
				k = h[j];
				h[j] = h[j + 1];
				h[j + 1] = k;
			}
		}
	}
	  for (i = 0;i < n;i++)
	  {
		  if (c[i] != 0)
		  {
			  System.out.printf("%.2lf ",c[i]);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (h[i] != 0)
		  {
			  if (t < m - 1)
			  {
				  System.out.printf("%.2lf ",h[i]);
				  t++;
			  }
		  else
		  {
			  System.out.printf("%.2lf",h[i]);
		  }
		  }
	  }
	   return 0;

	}

}

