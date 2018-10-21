package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[110][110];
	public static int day;
	public static int n;
	public static void F(int x)
	{

		if (x == day)
		{
			return;
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (A[i][j] >= 0)
				{
					if (A[i - 1][j] == -1 || A[i - 1][j] > A[i][j] + 1)
					{
						A[i - 1][j] = A[i][j] + 1;
					}
					if (A[i + 1][j] == -1 || A[i + 1][j] > A[i][j] + 1)
					{
						A[i + 1][j] = A[i][j] + 1;
					}
					if (A[i][j + 1] == -1 || A[i][j + 1] > A[i][j] + 1)
					{
						A[i][j + 1] = A[i][j] + 1;
					}
					if (A[i][j - 1] == -1 || A[i][j - 1] > A[i][j] + 1)
					{
						A[i][j - 1] = A[i][j] + 1;
					}
				}
			}
		}
		F(x + 1);
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char p;


		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				  p = ConsoleInput.readToWhiteSpace(true).charAt(0);
				  if (p == '@')
				  {
					  A[i][j] = 0;
				  }
				  else if (p == '.')
				  {
					  A[i][j] = -1;
				  }
				  else
				  {
					  A[i][j] = -2;
				  }

			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		F(1);
		int num = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (A[i][j] < day && A[i][j] >= 0)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}

}

