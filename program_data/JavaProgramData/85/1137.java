package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int n;
		int i;
		int j;
		int num;
		int a = 0;
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
			num = 0;
			r = String.valueOf(str[i]).length();
			if (str[i][0] < 65 || (str[i][0]>90 && str[i][0] < 97) || (str[i][0]>122))
			{
				if (str[i][0] != '_')
				{
					System.out.print("no\n");
					continue;
				}
			}
			for (j = 0;j < r;j++)
			{
					if ((str[i][j] >= 65 && str[i][j] <= 90) || (str[i][j] >= 97 && str[i][j] <= 122) || str[i][j] == '_' || (str[i][j] >= 48 && str[i][j] <= 57))
					{
						num++;
					}
			}
			if (num == r)
			{
				System.out.print("yes\n");
			}
			if (num != r)
			{
				System.out.print("no\n");
			}
		}



		return 0;
	}
}

