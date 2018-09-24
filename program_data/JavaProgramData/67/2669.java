package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		double[] c = new double[n];
		for (i = 1 ; i <= n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = b[i] / (a[i] * 0.01);
		}
		for (int k = 2 ; k <= n ; k++)
		{
			if ((c[k] - c[1]) > 5.00)
			{
			System.out.print("better");
			System.out.print("\n");
			}
			else if ((c[1] - c[k]) > 5.00)
			{
			System.out.print("worse");
			System.out.print("\n");
			}
			else
			{
			System.out.print("same");
			System.out.print("\n");
			}
		}
			return 0;
	}
}

