package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[101];
		int N;
		int q;
		int i;
		int j = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1;
		for (q = 1;q <= N;q++)
		{
			for (i = 0;i <= 100 ; i++)
			{
				num[i] = num[i] * 2; //???????????
			}
			for (i = 0;i <= 100 ; i++)
			{
				if (num[i] >= 10)
				{
					num[i + 1] = num[i + 1] + num[i] / 10; //?????????
					num[i] = num[i] % 10; //???????????
				}
			}
		}
		i = 100;
		while (num[i] == 0)
		{
			i--;
		} //???????0??
			for (j = i; j >= 0; j--)
			{
				System.out.print(num[j]);
			}
			//??????

	return 0;
	}
}

