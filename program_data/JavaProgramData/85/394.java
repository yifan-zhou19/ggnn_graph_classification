package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[100][21];
		int n;
		int i;
		int j;

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
		}

		for (i = 0;i < n;i++)
		{
			if (s[i][0] != '_' && (s[i][0] < 'A' || (s[i][0]>'Z' && s[i][0] < 'a') || s[i][0]>'z'))
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 1;j < String.valueOf(s[i]).length();j++)
				{
					if (s[i][j] != '_' && (s[i][j] < '0' || (s[i][j]>'9' && s[i][j] < 'A') || (s[i][j]>'Z' && s[i][j] < 'a') || s[i][j]>'z'))
					{
						System.out.print("no\n");
						break;
					}
				}
			}

				if (j == String.valueOf(s[i]).length())
				{
						System.out.print("yes\n");
				}
		}
	}
}

