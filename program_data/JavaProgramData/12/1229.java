package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[16];
		int i;
		int j;
		int n;
		int sum;
		for (; ;)
		{
			sum = 0;
			for (i = 0; ; i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((num[i] == 0) || (num[i] == -1))
				{
					break;
				}
			}
			if (num[i] == -1)
			{
				break;
			}
			n = i;
			for (i = 0; i < n - 1; i++)
			{
				for (j = i + 1; j <= n - 1; j++)
				{
					if ((num[j] == num[i] * 2) || (num[i] == num[j] * 2))
					{
						sum = sum + 1;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

