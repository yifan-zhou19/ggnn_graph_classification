package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sum = new int[100];
		int c;
		char[][] str = new char[100][100];
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
			sum[i] = 0;
			for (j = 0;str[i][j] != '\0';j++)
			{
				if (j == 0)
				{
					if ((str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] >= 'A' && str[i][j] <= 'Z') || (str[i][j] == '_'))
					{
						sum[i]++;
					}
				}
				else if (j > 0)
				{
					if ((str[i][j] >= 'a' && str[i][j] <= 'z') || (str[i][j] >= 'A' && str[i][j] <= 'Z') || (str[i][j] >= '0' && str[i][j] <= '9') || (str[i][j] == '_'))
					{
						sum[i]++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			c = String.valueOf(str[i]).length();
			if (sum[i] == c)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
			return 0;
	}


}

