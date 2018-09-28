package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][20];
		int i;
		int j;
		int n;
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
				s[i] = tempVar2.charAt(0);
			}
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (!((s[i][j] == '_') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= '0' && s[i][j] <= '9' && j>0)))
				{
					break;
				}
			}
			if (s[i][j] == '\0')
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

