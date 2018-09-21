package <missing>;

public class GlobalMembers
{
	//********************************
	//* ??? ?????                      
	//* ?????                   *
	//********************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[301];
		int i;
		int j;
		int temp = 0;
		double t = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t += a[i];
		}
		double avrage = t / n;
		double[] b = new double[301];
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - avrage);
		}
		t = 0;
		double[] c = new double[301];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == t)
			{
				c[k] = a[i];
				k++;
			}
		}
		for (i = 1;i <= k - 2;i++)
		{
			for (j = 0;j <= k - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
			for (i = 0;i < k;i++)
			{
				if (i == 0)
				{
					System.out.print(c[i]);
				}
				else
				{
					System.out.print(",");
					System.out.print(c[i]);
				}
			}
		return 0;
	}
}

