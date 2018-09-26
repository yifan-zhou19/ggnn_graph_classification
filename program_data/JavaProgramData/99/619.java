package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??
		int[] a = new int[1000];
		int[] c = new int[5];
		double[] b = new double[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++) //??
		{
			if (a[i] <= 18)
			{
			c[1]++;
			}
			else
			{
				if (a[i] <= 35)
				{
				c[2]++;
				}
				else
				{
					if (a[i] <= 60)
					{
					c[3]++;
					}
					else
					{
					c[4]++;
					}
				}
			}
		}
		for (int i = 1;i <= 4;i++) //??
		{
		b[i] = 100 * (double)c[i] / n;
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", b[1]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", b[2]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", b[3]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", b[4]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

