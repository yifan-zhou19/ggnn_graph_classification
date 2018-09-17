package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[30];
		int[] count = new int[30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count [i] = 1;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (num[i] <= num[j])
				{
					if (count[i] < count[j] + 1)
					{
						count[i] = count[j] + 1;
					}
				}
			}
		}
		int max = 1;
		for (i = 0; i < n; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

