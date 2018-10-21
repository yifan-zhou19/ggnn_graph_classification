package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag = 0;
		int count = 0;
		int j;
		int i = 0;
		int[] sum = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (j = 99;j >= 0;j--)
			{
				if (sum[j] == 0 && flag == 0)
				{
					continue;
				}
				else
				{
					flag = 1;
				}
				sum[j] *= 2;
				if (sum[j] >= 10)
				{
					sum[j] -= 10;
					sum[j + 1] += 1;
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (sum[i] != 0)
			{
				for (j = i;j >= 0;j--)
				{
					System.out.print(sum[j]);
				}
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

