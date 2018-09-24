package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][100];
		char d;
		char[][] string = new char[100][100];
		int n;
		int i;
		int j;
		int m;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d = System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			d = System.in.read();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				string[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			  m = String.valueOf(str[i]).length();
			l = String.valueOf(String[i]).length();
			for (j = 1;j <= l;j++)
			{
			str[i][m - j] = str[i][m - j] - string[i][l - j] + 48;
			}
			for (j = m - 1;j > 0;j--)
			{
				if (str[i][j] < 48)
				{
					str[i][j] += 10;
					str[i][j - 1]--;
				}
			}
			System.out.printf("%s\n",str[i]);
		}
	}




}

