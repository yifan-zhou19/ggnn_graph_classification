package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] arr = new int[30];
	public static int[] num = new int[30];

	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			arr[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < k;i++)
		{
			num[i] = 1;
		}
		for (int i = 0;i < k;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (arr[j] >= arr[i] != 0 && num[j] >= num[i])
				{
					num[i] = num[j] + 1;
				}
			}
		}
		int res = -1;
		for (int i = 0;i < k;i++)
		{
			if (num[i] > res)
			{
				res = num[i];
			}
		}
		System.out.print(res);
		System.out.print("\n");
		return 0;
	}

}

