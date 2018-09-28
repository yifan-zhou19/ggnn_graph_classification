package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int n;
		int m = 0;
		char[][] str = new char[101][100001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			m = 0;

			for (j = 0;j < String.valueOf(str[i]).length();j++)
			{
				n = 0;
				for (k = 0;k < String.valueOf(str[i]).length();k++)
				{
					if (str[i][j] == str[i][k] && j != k)
					{
						break;
					}
					if (str[i][j] != str[i][k])
					{
						n++;
					}
				}
				if (n == String.valueOf(str[i]).length() - 1)
				{
					System.out.printf("%c\n",str[i][j]);
					break;
				}
				else
				{
					m++;
				}
			}
			if (m == String.valueOf(str[i]).length())
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}
}

