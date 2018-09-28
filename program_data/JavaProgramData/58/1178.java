package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[100][81];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			System.in.read();
			cin.get(str[i],81);
		}
		for (i = 0;i < n;i++)
		{
			int flag = 0;
			if (str[i][0] == '_' || (str[i][0] >= 'a' && str[i][0] <= 'z') || (str[i][0] >= 'A' && str[i][0] <= 'Z'))
			{
				j = 1;
				flag = 1;
				while (str[i][j] != '\0')
				{
					if (str[i][j] == '_' || (str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] >= 'A' && str[i][j] <= 'Z') || (str[i][j] >= '0' && str[i][j] <= '9'))
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
					j++;
				}
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}
}

