package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] s = new char[50][50];
		l = 0;
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
			l = String.valueOf(s[i]).length();
			if (s[i][l - 1] == 'r')
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.printf("%c\n",s[i][l - 3]);
			}
					 else if (s[i][l - 1] == 'y')
					 {
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.printf("%c\n",s[i][l - 3]);
					 }
					else if (s[i][l - 1] == 'g')
					{
				for (j = 0;j < l - 4;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.printf("%c\n",s[i][l - 4]);
					}
		}
	}
}

