package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[30];
		int[] num = new int[30];
		int i;
		for (i = 1;i <= k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = 0;
		}
		int max = 0;
		for (i = k;i >= 1;i--)
		{
			int m = 0;
			for (int j = i + 1;j <= k;j++)
			{
				if (a[i] >= a[j] != 0 && num[j] > m)
				{
					m = num[j];
				}
			}
			num[i] = 1 + m;
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.print(max);

	}


}

