package <missing>;

public class GlobalMembers
{
	/* Name        : ????
	 * Version     : 1.0
	 * Date        : 2013-01-11
	 * New         : 
	 * Description : 
	 * State       : Design
	 */
	public static int Main()
	{
		int N = 0;
		int D = 0;
		int Sum = 0;
		char[][] Room =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				Room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		D = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int d = 1;d < D;d++)
		{
			for (int i = 0;i < N;i++)
			{
				for (int j = 0;j < N;j++)
				{
					if (Room[i][j] == '@')
					{
						if (j > 0 && Room[i][j - 1] == '.')
						{
							Room[i][j - 1] = '&';
						}
						if (j < N - 1 && Room[i][j + 1] == '.')
						{
							Room[i][j + 1] = '&';
						}
						if (i > 0 && Room[i - 1][j] == '.')
						{
							Room[i - 1][j] = '&';
						}
						if (i < N - 1 && Room[i + 1][j] == '.')
						{
							Room[i + 1][j] = '&';
						}
					}
				}
			}
			for (int i = 0;i < N;i++)
			{
				for (int j = 0;j < N;j++)
				{
					if (Room[i][j] == '&')
					{
						Room[i][j] = '@';
					}
				}
			}
		}
		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				if (Room[i][j] == '@' || Room[i][j] == '&')
				{
					Sum++;
				}
			}
		}
		System.out.print(Sum);
		return 0;
	}

}

