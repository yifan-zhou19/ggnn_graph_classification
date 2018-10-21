package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		char[][] s = new char[50][50];
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
			a = String.valueOf(s[i]).length();
			if ((s[i][a - 2] == 'e' && s[i][a - 1] == 'r') || (s[i][a - 2] == 'l' && s[i][a - 1] == 'y'))
			{
				for (j = 0;j < a - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.print("\n");
			}
			else if ((s[i][a - 3] == 'i' && s[i][a - 2] == 'n' && s[i][a - 1] == 'g'))
			{
				for (j = 0;j < a - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.print("\n");
			}
			else
			{
				System.out.printf("%s\n",s[i]);
			}
		}

	}


}

