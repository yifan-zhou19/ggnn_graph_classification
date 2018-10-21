package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j = 0;
		int p;
		float average;
		float[] a = new float[100];
		float sum = 0F;
		float[] c = new float[100];
		float[] d = new float[100];
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
		for (i = 0;i < n - 1;i++)
		{
			for (k = 0;k < n - i - 1;k++)
			{
				if (a[i] > a[i + 1])
				{
					float t = 0F;
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		average = sum / n;
		for (i = 0;i < n;i++)
		{
			c[i] = average - a[i];
			if (c[i] < 0F)
			{
				c[i] = a[i] - average;
			}
		}
		float max = 0F;
		for (i = 0;i < n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == max)
			{
				  d[j] = a[i];
							 j++;
			}

		}
			 if (j == 1)
			 {
				  System.out.printf("%.0f", d[j - 1]);
			 }
			  else if (j > 1)
			  {
					 for (p = 0;p < j - 1;p++)
					 {
					   System.out.printf("%.0f,", d[p]);
					 }
					 System.out.printf("%.0f",d[j - 1]);
			  }
		return 0;



	}

}

