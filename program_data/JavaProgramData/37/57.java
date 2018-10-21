package <missing>;

public class GlobalMembers
{
	//???2010?11?17?
	//???1000010586_???
	//??????????????? 

	public static int Main()
	{
		int t;
		int len;
		int k;
		int j;
		char[][] str = new char[100][100001];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 0 ; m <= t - 1 ; m++)
		{
			str[m] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0 ; i <= t - 1 ; i++)
		{
			len = String.valueOf(str[i]).length();
			for (j = 0 ; j <= len - 1 ; j++)
			{
				for (k = 0 ; k <= len - 1 ; k++)
				{
					if (str[i][j] == str[i][k] && j != k)
					{
						break;
					}
				}
				if (k == len)
				{
					System.out.print(str[i][j]);
					System.out.print("\n");
					break;
				}
			}
			if (j == len)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

