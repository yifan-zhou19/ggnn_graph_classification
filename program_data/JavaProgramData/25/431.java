package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		int k = 0;
		int i = 0;
		int j = 0;
		int s = 0;
		num[0] = 1;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				num[j] *= 2;
			}
			for (j = 0;j < 1000;j++)
			{
				num[j + 1] += num[j] / 10;
				num[j] = num[j] % 10;
			}
		}
		for (i = 999;i >= 0;i--)
		{
			if (num[i] != 0)
			{
				s++;
			}
			if (s > 0)
			{
				System.out.print(num[i]);
			}
		}
		return 0;
	}
}

