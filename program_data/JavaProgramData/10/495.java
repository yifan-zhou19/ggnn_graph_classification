package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] high = new int[30];
		int[] num = new int[30];
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			high[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num[0] = 1;
		for (i = 1;i < k;i++)
		{
			int max = 0;
			for (j = i - 1;j >= 0;j--)
			{
				if (high[i] <= high[j])
				{
					if (max < num[j])
					{
						max = num[j];
					}
				}
			}
			num[i] = max + 1;
		}
		sort(num,num + k);
		System.out.printf("%d",num[k - 1]);
		return 0;
	}
}

