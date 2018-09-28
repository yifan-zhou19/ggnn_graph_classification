package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int order = 0;
		int temp;
		double sum = 0;
		double Max = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		sum = (double)sum / n;
		for (i = 1 ; i <= n ; i++)
		{
			Max = Math.max(Max, (abs)(sum - a[i]));
		}
		for (i = 1 ; i <= n ; i++)
		{
			if (Max == (Math.abs(sum - a[i])))
			{
				b[order] = i;
				order++;
			}
		}
		for (i = order - 1 ; i >= 0 ; i--)
		{
			for (j = 0 ; j < i ; j++)
			{
				if (a[b[j]] > a[b[j + 1]])
				{
					temp = a[b[j]];
					a[b[j]] = a[b[j + 1]];
					a[b[j + 1]] = temp;
				}
			}
		}
		for (i = 0 ; i < order ; i++)
		{
			System.out.print(a[b[i]]);
			if (i != order - 1)
			{
				System.out.print(",");
			}
		}
	}
}

