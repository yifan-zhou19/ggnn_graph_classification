package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		char[][] s = new char[51][32];
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
			l = String.valueOf(s[i]).length();
			if (l >= 4)
			{
				if (s[i][l - 1] == 'g' && s[i][l - 2] == 'n' && s[i][l - 3] == 'i')
				{
					s[i][l - 3] = '\0';
				}
			}
			if (l >= 3)
			{
				if (s[i][l - 1] == 'r' && s[i][l - 2] == 'e')
				{
					s[i][l - 2] = '\0';
				}
				if (s[i][l - 1] == 'y' && s[i][l - 2] == 'l')
				{
					s[i][l - 2] = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%s",s[i]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

