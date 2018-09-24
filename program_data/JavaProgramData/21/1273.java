package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int x = 0;
		float m = 0F;
		float k;
		float[] b = new float[300];
		float[] c = new float[300];
		float d;
		float[] a = new float[300];
		float n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = m + a[i];
		}
		k = m / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					d = a[j];
					a[j] = a[j + 1];
					a[j + 1] = d;
				}

			}
		}
			for (i = 0;i < n;i++)
			{
				if (a[i] >= k)
				{
				b[i] = a[i] - k;
				}
				else
				{
					b[i] = k - a[i];
				}

			}

			for (i = 0;i < n;i++)
			{
				c[i] = b[i];
			}


		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (c[j] < c[j + 1])
				{
					d = c[j];
					c[j] = c[j + 1];
					c[j + 1] = d;
				}

			}
		}
		for (i = 0;i < n;i++)
		{
				if (b[i] == c[0])
				{

					if (x != 0)
					{
					System.out.printf(",%d",(int)a[i]);
					}
					else
					{
						System.out.printf("%d",(int)a[i]);
					}
					x++;
				}
		}



	}


}

