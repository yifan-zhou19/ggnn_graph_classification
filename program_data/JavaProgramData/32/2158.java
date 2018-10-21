package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int j1;
		int l;
		int l1;
		char[][] str = new char[100][100];
		char[][] str1 = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1[i] = tempVar3.charAt(0);
			}
			 System.in.read();
		}
		for (i = 1;i <= n;i++)
		{
			l = String.valueOf(str[i]).length();
			l1 = String.valueOf(str1[i]).length();
			j = 0;
			while (j < l1)
			{
				str[i][l - 1 - j] = '0' + (int)str[i][l - 1 - j] - (int)str1[i][l1 - 1 - j];
				j1 = j;
				while (str[i][l - 1 - j1] < '0')
				{
					str[i][l - 1 - j1] = 10 + str[i][l - 1 - j1];
					j1++;
					str[i][l - 1 - j1] = '0' + (int)str[i][l - 1 - j1] - (int)'1';
				}
				j++;
			}
			j1 = 0;
			while (str[i][j1] == '0')
			{
				j1++;
			}
			for (j = j1;j < l;j++)
			{
				System.out.print(str[i][j]);
			}
			System.out.print("\n");
		}
	}

}

