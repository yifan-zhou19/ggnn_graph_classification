package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] h = new int[50];
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] num = new int[50];
		int max;
		num[0] = 1;
		for (i = 1;i < k;i++)
		{
			max = 0;
			for (j = 0;j < i;j++)
			{
				if (h[j] >= h[i] != 0 && num[j] > max)
				{
					max = num[j];
				}
			}
			num[i] = max + 1;
		}
		max = 0;
		for (i = 1;i < k;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

