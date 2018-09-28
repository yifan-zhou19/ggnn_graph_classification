package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int t = 0;
		int[] result = new int[1000];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result[0] = 1;
		for (i = 0; i < N; i++)
		{
			result[0] = result[0] * 2;
			for (j = 0; j < 100; j++)
			{
				if (result[j] > 9)
				{
					result[j + 1] = result[j + 1] * 2 + 1;
					result[j] = result[j] - 10;
				}
				else
				{
					result[j + 1] = result[j + 1] * 2;
				}
			}
		}
		for (i = 90; i > 0; i--)
		{
			if (result[i] != 0)
			{
				t = i;
				break;
			}
		}
		for (i = t; i >= 0; i--)
		{
			System.out.print(result[i]);
		}
		return 0;
	}
}

