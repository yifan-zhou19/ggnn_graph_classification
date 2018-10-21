package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag;
		char[][] str = new char[100][25];
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
			if ((str[i][0] >= 'a' && str[i][0] <= 'z') || (str[i][0] >= 'A' && str[i][0] <= 'Z') || str[i][0] == '_')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
			}
			if (flag == 0)
			{
				for (j = 1;str[i][j] != '\0';j++)
				{
					if ((str[i][j] >= '0' && str[i][j] <= '9') || (str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] >= 'A' && str[i][j] <= 'Z') || str[i][j] == '_')
					{
						flag = 0;
					}
					else
					{
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}

