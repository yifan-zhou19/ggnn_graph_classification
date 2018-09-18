package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t;
		int[] c = new int[300];
		float[] a = new float[300];
		float[] b = new float[300];
		float aver;
		float max;
		float total = 0F;
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
		for (i = 0;i < n;i++)
		{
			total = total + a[i];
		}
		aver = total / n;
		for (i = 0;i < n;i++)
		{
			if ((a[i] - aver) >= 0)
			{
				b[i] = a[i] - aver;
			}
			else
			{
				b[i] = aver - a[i];
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
			   c[k] = (int)a[i];
			   k++;
			}
		}
		if (k == 2)
		{
			if (c[0] > c[1])
			{
				t = c[0];
				c[0] = c[1];
				c[1] = t;
			}
		}
		if (k >= 3)
		{
			for (i = 0;i < k - 1;k++)
			{
				for (j = 0;j < k - 1 - i;j++)
				{
					if (c[j] > c[j + 1])
					{
						t = c[j];
						c[j] = c[j + 1];
						c[j + 1] = t;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i != (k - 1))
			{
				System.out.printf("%d,",c[i]);
			}
			else
			{
				System.out.printf("%d",c[i]);
			}
		}
		System.out.print("\n");
	}


}

