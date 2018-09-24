package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int flag = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] str = new int[1000];
		str[0] = 1;
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < 1000; j++)
			{
				str[j] = str[j] * 2;
			}
			for (j = 0; j < 1000; j++)
			{
				if (str[j] > 9)
				{
					str[j + 1] += str[j] / 10;
					str[j] = str[j] % 10;
				}
			}
		}
		for (i = 999; i >= 0; i--)
		{
			if (str[i] != 0)
			{
				flag = 1;
			}
			if (flag != 0)
			{
				System.out.print(str[i]);
			}
		}
		return 0;
	}
}

