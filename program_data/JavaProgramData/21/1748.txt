package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] b = new float[400];
		float sum;
		float[] a = new float[400];
		float large;
		float[] c = new float[40];
		float d;
		float[] de = new float[40];
		int i;
		int max;
		int u;
		int t;
		int n;
		int judge;
		int m;
		int fin;
		int final;
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
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		sum = 0F;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		d = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= d)
			{
				b[i] = a[i] - d;
			}
			else
			{
				b[i] = d - a[i];
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > b[max])
			{
			max = i;
			}
		}
		for (i = 0,t = 0;i < n;i++)
		{
			if (b[i] == b[max])
			{
				c[t] = a[i];
			t++;
			}
		}
		m = 0;
		for (i = 0;i <= t - 1;i++)
		{
		  if (c[i] <= d)
		  {
		  m = 1;
		  break;
		  }
		}
		if (m == 1)
		{
			u = 0;
			for (i = 0;i <= t - 1;i++)
			{
		  if (c[i] <= d)
		  {
				de[u] = c[i];
				u++;
		  }
			}
			   fin = u;
			for (i = 0,u = fin;i <= t - 1;i++)
			{
			  if (c[i] > d)
			  {
				de[u] = c[i];
				u++;
			  }
			}
			  final = u;
		}

		else if (m == 0)
		{
			  for (i = 0;i < t;i++)
			  {
			  de[i] = c[i];
			  }
		}
			final = t;
			  judge = 1;
			if (final - 1 == 0)
			{
				judge = 0;
			}
				if (judge == 1)
				{
					   for (i = 0;i < final - 1;i++)
					   {
						 System.out.printf("%.0f,",de[i]);
					   }
			  System.out.printf("%.0f",de[i]);
				}
				else
				{
					System.out.printf("%.0f",de[final - 1]);
				}
	}


}

