package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[60][40];
		String b = new String(new char[40]);
		int n;
		int i;
		int j;
		int c;
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
					a[i] = tempVar2.charAt(0);
				}
			}
			for (j = 0;j < n;j++)
			{
				c = String.valueOf(a[j]).length();
				if ((a[j][c - 1] == 'r' && a[j][c - 2] == 'e') || (a[j][c - 1] == 'y' && a[j][c - 2] == 'l'))
				{
					for (i = 0;i < c - 2;i++)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, a[j][i]);
					}
					b = tangible.StringFunctions.changeCharacter(b, i, '\0');
				}
				else
				{
					for (i = 0;i < c - 3;i++)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, a[j][i]);
					}
					b = tangible.StringFunctions.changeCharacter(b, i, '\0');
				}
				System.out.printf("%s\n",b);
			}
			return 0;
	}

}

