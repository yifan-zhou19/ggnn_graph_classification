package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int sum = 0;
		int i;
		int k = 0;
		int flag = 0;
		double[] c = new double[MAX];
		double avr;
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
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		avr = (double) sum / (double) n;
		for (i = 0;i < n;i++)
		{
			c[i] = avr - (double)a[i];
			if (c[i] < 0)
			{
				c[i] = -c[i];
			}
		}
		double max = avr - (double)a[0];
		if (max < 0)
		{
			max = -max;
		}

		for (i = 1;i < n;i++)
		{
			if (c[i] >= max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max == c[i])
			{
				b[k] = a[i];
				k++;
			}
		}
		if (k == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			bubble(b, k);
			System.out.printf("%d",b[0]);
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		}
		return 0;
	}
}

