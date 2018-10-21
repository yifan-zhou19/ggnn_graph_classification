package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] num = new int[100];
		int[] mark = new int[100];
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		mark[n - 1] = 1;
		for (i = n - 2; i >= 0; i--)
		{
			max = 0;
			for (j = i + 1; j < n; j++)
			{
				if (num[j] <= num[i] != 0 && mark[j] > max)
				{
					max = mark[j];
				}
			}
			mark[i] = max + 1;
		}
		max = 0;
		for (i = 0; i < n; i++)
		{
			if (mark[i] > max)
			{
				max = mark[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

