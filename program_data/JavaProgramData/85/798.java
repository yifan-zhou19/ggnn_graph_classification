package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] len = new int[2000];
		char[][] str = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			len[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if ((('a' <= str[i][0]) && (str[i][0] <= 'z')) || (('A' <= str[i][0]) && (str[i][0] <= 'Z')) || str[i][0] == '_')
			{
				for (j = 0;j < len[i];j++)
				{
					if ((('a' <= str[i][j]) && (str[i][j] <= 'z')) || (('A' <= str[i][j]) && (str[i][j] <= 'Z')) || str[i][j] == '_' || (('0' <= str[i][j]) && (str[i][j] <= '9')))
					{
						t = 0;
					}
					else
					{
						t = 1;
						break;
					}
				}
			}
			else
			{
				t = 1;
			}
			if (t == 0)
			{
				System.out.print("yes\n");
			}
			else if (t == 1)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}
}

