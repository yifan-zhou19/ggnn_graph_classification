package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[110][110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch,'#',(Character.SIZE / Byte.SIZE));
		int n;
		int m;
		int count = 0;
		int i;
		int j;
		int[][] flag = new int[110][110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				ch[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 1)
		{
			m--;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (ch[i][j] == '@' && flag[i][j] == 0)
					{
						if (ch[i - 1][j] == '.')
						{
							ch[i - 1][j] = '@';
							flag[i - 1][j] = 1;
						}
						if (ch[i + 1][j] == '.')
						{
							ch[i + 1][j] = '@';
							flag[i + 1][j] = 1;
						}
						if (ch[i][j - 1] == '.')
						{
							ch[i][j - 1] = '@';
							flag[i][j - 1] = 1;
						}
						if (ch[i][j + 1] == '.')
						{
							ch[i][j + 1] = '@';
							flag[i][j + 1] = 1;
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE));
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (ch[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;


	}






}

