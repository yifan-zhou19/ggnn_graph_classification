package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int time;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n + 1];
		for (i = 1;i <= n;i++)
		{
			time = 0,sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[m + 1];
			for (j = 1;j < m + 1;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
				for (j = 1;j < m + 1;j++)
				{
				time = a[j] + 3 * j;
				if (time <= 63)
				{
					sum = a[j];
				}
				if (time >= 60 && time < 63)
				{
					break;
				}
				else if (time > 63)
				{
					time = a[j - 1] + 3 * (j - 1);
					sum = a[j - 1] + 60 - time;
					time = a[j] + 3 * j;
					break;
				}
				}

			if (time < 60)
			{
				sum = sum + 60 - time;
			}
			x[i] = sum;
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(x[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

