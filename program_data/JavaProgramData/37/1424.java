package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[t][10000];
		for (i = 0;i <= t - 1;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len;
			len = String.valueOf(str[i]).length();
			int k;
			int j;
			int s = 0;


			for (k = 0;k <= len - 1;k++)
			{
				for (j = k + 1;j <= len - 1;j++)
				{
					if (str[i][k] == str[i][j])
					{
						 str[i][k] = '\0';
						 str[i][j] = '\0';
					}
				}
				for (j = k - 1;j >= 0;j--)
				{
					if (str[i][k] == str[i][j])
					{
											 str[i][k] = '\0';
											 str[i][j] = '\0';
					}
				}
			}
			for (k = 0;k <= len - 1;k++)
			{
				if (str[i][k] != '\0')
				{
									 System.out.print(str[i][k]);
									 System.out.print("\n");
									 break;
				}
			}
			if (k == len)
			{
					   System.out.print("no");
					   System.out.print("\n");
			}
		}

		return 0;
	}
}

