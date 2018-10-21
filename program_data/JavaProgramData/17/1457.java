package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][101];
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[m] = tempVar2.charAt(0);
		}
		}
		for (m = 0;m < n;m++)
		{
			int i = 0;
			int j = 0;
			int k = 0;
			int n;
			n = String.valueOf(a[m]).length();
			for (i = 0;i < n;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			}


			for (i = n - 1;i >= 0;i--)
			{
				if (a[m][i] == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, a[m][i]);
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[m][i] == ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a[m][i]);
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				if (b.charAt(i) == '(')
				{
					for (j = i + 1;j < n;j++)
					{
					if (c.charAt(j) == ')')
					{
						c = tangible.StringFunctions.changeCharacter(c, j, ' ');
					 b = tangible.StringFunctions.changeCharacter(b, i, ' ');
						break;
					}
					}
				}
			}
			System.out.printf("%s\n",a[m]);
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) != ' ')
				{
				   a[m][i] = '$';
				}
				 if (c.charAt(i) != ' ')
				 {
					 a[m][i] = '?';
				 }
				if (b.charAt(i) == ' ' && c.charAt(i) == ' ')
				{
					a[m][i] = ' ';
				}
			}
			System.out.printf("%s\n",a[m]);
		}
	}

}

