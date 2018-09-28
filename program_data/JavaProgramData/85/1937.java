package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] str = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (str[i][0] < 'A' || (str[i][0]>'Z' && str[i][0] < 'a' && str[i][0] != '_') || str[i][0]>'z')
			{
					System.out.print("no\n");
			}
			else
			{
				for (j = 0;j < String.valueOf(str[i]).length();j++)
				{
					if (str[i][j] < '0' || (str[i][j]>'9' && str[i][j] < 'A') || (str[i][j]>'Z' && str[i][j] < 'a' && str[i][j] != '_') || str[i][j]>'z')
					{
							System.out.print("no\n");
							break;
					}
					else if (j == String.valueOf(str[i]).length() - 1)
					{
						System.out.print("yes\n");
					}
				}
			}
		}
		return 0;
	}

}

