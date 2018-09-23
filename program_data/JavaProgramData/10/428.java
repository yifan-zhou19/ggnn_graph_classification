package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int min = 0;
		int[] ans = new int[100];
		int k = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= k - 1;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		ans[0] = 1;
		int temp = 0;
		for (int i = 1;i <= k - 1;i++)
		{
			temp = 0;
			for (int j = i - 1;j >= 0;j--)
			{
				if (m[j] >= m[i])
				{
					if (temp < ans[j])
					{
						temp = ans[j];
					}
				}
			}
			ans[i] = temp + 1;
		}
		int max = 0;
		for (int i = 0;i <= k - 1;i++)
		{
			if (max < ans[i])
			{
				max = ans[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
	}
}

