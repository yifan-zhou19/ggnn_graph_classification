package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int k;
		char[][] M = new char[100][10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			M[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(M[i]).length();
			for (j = 0 ; j < l ; j++)
			{
				for (k = 0 ; k < l ; k++)
				{
					if (M[i][k] == M[i][j] && k != j)
					{
						break;
					}
				}
				if (k == l)
				{
					System.out.print(M[i][j]);
					System.out.print("\n");
					break;
				}
			}
			if (j == l)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

