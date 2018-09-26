package <missing>;

public class GlobalMembers
{
	//***********************************
	//????1000012825_2              *
	//??????                      *
	//???11. 18                      *
	//???????????            *
	//***********************************
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[100][10000];
		for (i = 1; i <= t; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; str[i][j] != '\0'; j++)
			{
				for (k = 0; str[i][k] != '\0' ; k++) //????? ????
				{
					if (j == k)
					{
						continue; // ?? j=k?????
					}
					if (str[i][k] == str[i][j])
					{
						break; //???????????
					}
				}
				if (str[i][k] == '\0') // ???????????????????????????????
				{
					System.out.print(str[i][j]);
					System.out.print("\n");
					break;
				}
			}
			if (str[i][j] == '\0') // ????????????�no�
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

