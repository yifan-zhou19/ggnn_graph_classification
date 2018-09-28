package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int max = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000]; //c????????,a?????
		int[] c = new int[1000];
		double[] b = new double[1000]; //b?????

		for (int i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] > max)
			{
				max = a[i]; //max??????????
			}
		}
		c[1] = 1;
		c[2] = 2;
		b[0] = 0;
		for (int i = 3;i <= max + 2;i++)
		{
			c[i] = c[i - 1] + c[i - 2];
		}
	//????????
		for (int i = 1;i <= max + 2;i++)
		{
			b[i] = b[i - 1] + (float)c[i + 1] / c[i];
		}
	//????????????

		for (int i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",b[a[i]]);
		}

		return 0;
	}

}

