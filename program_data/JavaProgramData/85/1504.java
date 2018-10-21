package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] str = new char[100][22];
	 int len;
	 int n;
	 int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(str[i]).length();
			m = 0;
			if (((str[i][0] >= 'A') && (str[i][0] <= 'Z')) || ((str[i][0] >= 'a') && (str[i][0] <= 'z')) || (str[i][0] == 95))
			{
			for (int j = 1;j < len;j++)
			{
				if ((('A' <= str[i][j]) && (str[i][j] <= 'Z')) || (('a' <= str[i][j]) && (str[i][j] <= 'z')) || (str[i][j] == 95) || ((48 <= str[i][j]) && (str[i][j] <= 57)))
				{
				continue;
				}
				else
				{
					System.out.print("no\n");
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.print("yes\n");
			}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

