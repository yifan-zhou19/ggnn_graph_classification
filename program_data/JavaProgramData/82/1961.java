package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int high = 0;
		int low = 0;
		int k = 1;
		int z = 1;
		int n;
		int max;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (z = 1;z <= n;z++)
		{
			high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((high <= 140) && (high >= 90) && (low <= 90) && (low >= 60))
			{
				a[k]++;
			}
			else
			{
				k++;
			}
		}
		max = a[1];
		for (k = 1;k <= 100;k++)
		{
			if (a[k] > max)
			{
				max = a[k];
			}
		}
		System.out.print(max);
		return 0;
	}
}

