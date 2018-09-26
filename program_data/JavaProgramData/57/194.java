package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][20];
		char[][] b = new char[100][20];
		String temp1 = new String(new char[4]);
		String temp2 = new String(new char[3]);
		int l;
		int i;
		int n;
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			l = String.valueOf(a[i]).length();
			temp1 = tangible.StringFunctions.changeCharacter(temp1, 0, a[i][l - 3]);
			temp1 = tangible.StringFunctions.changeCharacter(temp1, 1, a[i][l - 2]);
			temp1 = tangible.StringFunctions.changeCharacter(temp1, 2, a[i][l - 1]);
			temp1 = tangible.StringFunctions.changeCharacter(temp1, 3, '\0');
			temp2 = tangible.StringFunctions.changeCharacter(temp2, 0, a[i][l - 2]);
			temp2 = tangible.StringFunctions.changeCharacter(temp2, 1, a[i][l - 1]);
			temp2 = tangible.StringFunctions.changeCharacter(temp2, 2, '\0');

			if ((strcmp(temp2,"er") == 0) || (strcmp(temp2,"ly") == 0))
			{
				b[i] = String.valueOf(a[i]).substring(0, l - 2);
				b[i][l - 2] = '\0';
			}
			else if (strcmp(temp1,"ing") == 0)
			{
				b[i] = String.valueOf(a[i]).substring(0, l - 3);
				b[i][l - 3] = '\0';
			}
			else
			{
				b[i] = a[i];
			}

			System.out.printf("%s\n",b[i]);
		}
	}
}

