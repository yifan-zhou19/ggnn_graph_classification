package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j = 1;
		int k = 0;
		int t = 0;
		int[] a = new int[500];
		int[] b = new int[300];
		double sum = 0;
		double ave = 0;
		double c = 0;
		double d = 0;

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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		ave = sum / n;
		b[0] = a[0];
		c = ave - b[0];
		if (c < 0)
		{
			c = -c;
		}
		for (i = 1;i < n;i++)
		{
			d = ave - a[i];
			if (d < 0)
			{
				d = -d;
			}
			if (d > c)
			{
				b[0] = a[i];
				c = d;
			}
			else if (d == c)
			{
				b[j] = a[i];
				j++;
			}
		}

		if (j == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				for (k = 0;k < j - 1 - i;k++)
				{
					if (b[k] > b[k + 1])
					{
						t = b[k];
						b[k] = b[k + 1];
						b[k + 1] = t;
					}
				}
			}
		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
			System.out.printf(",%d",b[i]);
			}
		}
		}
	}




}

