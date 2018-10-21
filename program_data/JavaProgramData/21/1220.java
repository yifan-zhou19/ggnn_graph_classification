package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		float average = 0F;
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			average += a[i];
		}
		average /= n;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = n - 1;j >= i + 1;j--)
			{
				if (a[j] < a[j - 1])
				{
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		float s = (average - a[0]) - (a[n - 1] - average);
		if (s > 0F)
		{
			System.out.print(a[0]);
		}
		else if (s < 0F)
		{
			System.out.print(a[n - 1]);
		}
		else
		{
			System.out.print(a[0]);
			System.out.print(',');
			System.out.print(a[n - 1]);
		}
		return 0;
	}
}

