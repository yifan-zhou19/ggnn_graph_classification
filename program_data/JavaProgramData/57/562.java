package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		char[][] a = new char[50][32];
		String x = new String(new char[4]);
		String y = new String(new char[3]);
		String z = new String(new char[30]);
		x = tangible.StringFunctions.changeCharacter(x, 3, '\0');
		y = tangible.StringFunctions.changeCharacter(y, 2, '\0');
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
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(a[i]).length();
			for (j = 0;j < 3;j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, a[i][m - 3 + j]);
			}
			for (j = 0;j < 2;j++)
			{
				y = tangible.StringFunctions.changeCharacter(y, j, a[i][m - 2 + j]);
			}
			if (strcmp(x,"ing") == 0)
			{
				z = String.valueOf(a[i]).substring(0, m - 3);
				System.out.println(z);
				System.out.print("\n");
			}
			else
			{
				if (strcmp(y,"er") == 0 || strcmp(y,"ly") == 0)
				{
					z = String.valueOf(a[i]).substring(0, m - 2);
					System.out.println(z);
					System.out.print("\n");
				}
			}
			for (j = 0;j < 32;j++)
			{
				z = tangible.StringFunctions.changeCharacter(z, j, '\0');
			}
		}
	}
}

