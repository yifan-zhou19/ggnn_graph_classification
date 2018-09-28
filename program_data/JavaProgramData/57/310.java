package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int p;
		char[][] a = new char[50][20];
		final String b = "ing";

		String c = new String(new char[4]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < k;i++)
		{
			p = String.valueOf(a[i]).length();
			c = tangible.StringFunctions.changeCharacter(c, 0, a[i][p - 3]);
			c = tangible.StringFunctions.changeCharacter(c, 1, a[i][p - 2]);
			c = tangible.StringFunctions.changeCharacter(c, 2, a[i][p - 1]);
			c = tangible.StringFunctions.changeCharacter(c, 3, '\0');
			if (strcmp(c,b) == 0)
			{
				for (j = 0;j < p - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print("\n");

			}
				else
				{
					for (j = 0;j < p - 2;j++)
					{
						System.out.printf("%c",a[i][j]);
					}
					System.out.print("\n");
				}
		}
		return 0;
	}






}

