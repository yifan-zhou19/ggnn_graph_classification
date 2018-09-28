package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		double sum = 0;
		int j;
		double ping;
		double cha = 0;
		double[] b = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			sum = sum + a[i];
		}
		ping = sum / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - ping);
			if (b[i] > cha || Math.abs(b[i] - cha) < 1e-6)
			{
				cha = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(b[i] - cha) < 1e-6)
			{
				j = i;
				System.out.print(a[i]);
				break;
			}
		}
		for (i = j + 1; i < n; i++)
		{
			if (Math.abs(b[i] - cha) < 1e-6)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

