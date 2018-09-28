package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[302];
		int i;
		int count = 0;
		double y;
		double n;
		double num = 0;
		double max = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = num + a[i];
		}
		y = num / n;
		for (i = 1; i <= n; i++)
		{
			if (Math.abs(a[i] - y) > max)
			{
				max = Math.abs(a[i] - y);
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (Math.abs(y - a[i] - max) < 0.0001)
			{
				count++;
				System.out.print(a[i]);
			}
			if (Math.abs(a[i] - y - max) < 0.0001)
			{
				if (count == 1)
				{
					System.out.print(",");
					System.out.print(a[i]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

