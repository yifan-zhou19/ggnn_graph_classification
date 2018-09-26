package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		m[0] = 2;
		int N;
		int i;
		int j;
		int temp = 0;
		int t = 0;
		int count = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 1 ; i < N ; i++)
			{
				for (j = 0 ; j <= count + 1 ; j++)
				{
					t = m[j] * 2 + temp;
					temp = t / 10;
					m[j] = t % 10;
				}
				for (j = 100 ; j >= 0 ; j--)
				{
					if (m[j] == 0 && m[j - 1] != 0)
					{
						count = j;
						break;
					}
				}
			}
			for (i = 99 ; m[i] == 0 ; i--)
			{
				;
			}
			for (j = i ; j >= 0 ; j--)
			{
				System.out.print(m[j]);
			}
		}
		return 0;
	}
}

