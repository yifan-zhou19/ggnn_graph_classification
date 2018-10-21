package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int k;
		int j;
		int l;
		char[][] str = new char[1000][1000];
		char[][] stt = new char[1000][1000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stt[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(str[i]).length();
			k = String.valueOf(stt[i]).length();
			for (j = m - 1;j >= m - k;j--)
			{
				if (str[i][j] >= stt[i][j + k - m])
				{
					str[i][j] = str[i][j] - stt[i][j + k - m] + 48;
				}
				else
				{
					str[i][j] = str[i][j] - stt[i][j + k - m] + 58;
					str[i][j - 1] = str[i][j - 1] - 1;
					l = j - 1;
					while (str[i][l] < 48)
					{
						str[i][l] = str[i][l] + 10;
						l = l - 1;
						str[i][l] = str[i][l] - 1;
					}
				}
			}
			System.out.printf("%s\n",str[i]);
		}
	}
}

