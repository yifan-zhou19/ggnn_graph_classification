package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[2][50];
		int i;
		int j;
		int len;
		int k;
		int sum = 0;
		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
		}
		k = String.valueOf(s[1]).length();
		len = String.valueOf(s[0]).length();
		for (j = 0;j < k;j++)
		{
			if (s[1][j] == s[0][0])
			{
				for (i = 1;i < len;i++)
				{
					if (s[1][j + i] == s[0][i])
					{
						sum++;
					}
					if (sum == (len - 1))
					{
						System.out.printf("%d",j);
					}
				}
			}
		}
		return 0;
	}

}

