package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int num = 1;
		int[] s = new int[101];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s[0] = 1;
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < num; j++)
			{
				s[j] = s[j] * 2;
			}
			for (j = 0; j < num; j++)
			{
				if (s[j] >= 10)
				{
					s[j] -= 10;
					s[j + 1]++;
				}
			}
			if (s[num] == 1)
			{
				num++;
			}
		}
		for (i = num - 1; i >= 0; i--)
		{
			System.out.print(s[i]);
		}
		return 0;
	}
}

