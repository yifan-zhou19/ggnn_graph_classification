package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[101];
		num[100] = 1;
		int i;
		int N;
		int j;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			for (j = 1; j <= 100; j++)
			{
				if (num[j] * 2 < 10)
				{
					num[j] = num[j] * 2;
				}
				else
				{
					num[j] = num[j] * 2 - 10;
					num[j - 1]++;
				}
			}
		}
		for (i = 1; i <= 100; i++)
		{
			if (num[i] != 0)
			{
				break;
			}
		}
		for (j = i; j <= 100; j++)
		{
			System.out.print(num[j]);
		}
		return 0;
	}
}

