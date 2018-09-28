package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] word = new char[10000][22];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			m = 1;
			while (word[i][j] != '\0')
			{
				if (((word[i][j] == '_') || (word[i][j] >= 'a' && word[i][j] <= 'z') || (word[i][j] >= 'A' && word[i][j] <= 'Z') || ((word[i][j] >= '0') && (word[i][j] <= '9') && (j>0))))
				{
					j++;

				}
				else
				{
					m = 0;
					break;

				}

			}
			if (m == 1)
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

