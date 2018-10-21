package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sum = new int[100];
		char[][] str = new char[21][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			for (j = 0;str[i][j] != '\0';j++)
			{
				if (j == 0)
				{
					if ((str[i][j] >= 'A' && str[i][j] <= 'Z') || (str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] == '_'))
					{
						sum[i] = 1;
					}
					else
					{
						sum[i] = 0;
						break;
					}
				}
				else if (j > 0)
				{
					if ((str[i][j] >= 'A' && str[i][j] <= 'Z') || (str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] == '_') || (str[i][j] >= '0' && str[i][j] <= '9'))
					{
						sum[i] = 1;
					}
					else
					{
						sum[i] = 0;
						break;
					}
				}
				else
				{
					sum[i] = 0;
					break;
				}
			}
			if (sum[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

