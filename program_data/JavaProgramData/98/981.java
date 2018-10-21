package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int f;
		int w = 0;
		int[] m = new int[300];
		int[][] a = new int[300][300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= 299;j++)
			{
				*(*(a + i) + j) = System.in.read();
				if (*(*(a + i) + j) == 32 || *(*(a + i) + j) == 10)
				{
					m[i] = j - 1;
					break;
				}
			}
		}
		while (w < n) //w???????????
		{
			f = 0;
			while (true)
			{
				f = f + m[w + 1];
				w++;
				for (int i = 1;i <= m[w];i++)
				{
				System.out.print(*(*(a + w) + i));
				}
				if (w < n && f + 1 + m[w + 1] <= 80)
				{
					System.out.print(32);
					f = f + 1;
				}
				else
				{
				break;
				}
			}
			System.out.print(10);
		}
		return 0;
	}

}

