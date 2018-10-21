package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] a = new int[25];
		int[] b = new int[25];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int max = 1;
		b[0] = 1;
		for (i = 1;i < n;i++)
		{
			t = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] <= a[j] != 0 && t < b[j] + 1)
				{
					t = b[j] + 1;
				}
			}
			b[i] = t;
			max = b[i] > max != 0?b[i]:max;
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

