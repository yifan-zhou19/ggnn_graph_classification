package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int s = 1;s <= n;s++)
		{
			int m = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[100];
			int sum = 60;
			int totaltime = 0;
			for (int i = 1;i <= m;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (totaltime + a[i] - a[i - 1] < 60 && a[i] < 60)
			{
				totaltime += a[i] - a[i - 1] + 3;
				sum -= 3;
				if (totaltime == 61)
				{
					sum += 1;
				}
				if (totaltime == 62)
				{
					sum += 2;
				}
			}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	return 0;
	}


}

