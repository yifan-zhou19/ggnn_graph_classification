package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????(11-12) ??2?N??   **
	//*?????? 1300012745 **
	//*???2013.11.19  **
	//********************************
	public static int Main()
	{
		int[] num = new int[100];
		int N;
		int i;
		int j;
		int wei = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
		}
		if (N == 1)
		{
			System.out.print(2);
		}
		if (N > 1)
		{
			num[0] = 2;
			for (i = 2; i <= N; i++)
			{
				for (j = 0; j <= 99; j++)
				{
					num[j] *= 2;
				}
				for (j = 0; j <= 99; j++)
				{
					if (num[j] >= 10)
					{
						num[j] -= 10;
						num[j + 1]++;
					}
				}
			}
			j = 99;
			while (num[j] == 0)
			{
				j--;
			}
			for (i = j; i >= 0; i--)
			{
				System.out.print(num[i]);
			}
		}
		return 0;
	}









}

