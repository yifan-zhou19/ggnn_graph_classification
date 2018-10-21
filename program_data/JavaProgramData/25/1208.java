package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N; //N????
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[32];
		num[1] = 1;
		int cntbyte = 1;

		for (int i = 1 ; i <= N ; i++)
		{
			for (int j = 1 ; j <= cntbyte ; j++)
			{
				num[j] *= 2;
			}
			for (int j = 1 ; j <= cntbyte ; j++)
			{
				if (num[j] >= 10)
				{
					num[j] -= 10;
					num[j + 1]++;
				}
			}
			if (num[cntbyte + 1] != 0)
			{
				cntbyte++;
			}
		}
		for (int k = cntbyte; k >= 1; k--)
		{
			System.out.print(num[k]);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

