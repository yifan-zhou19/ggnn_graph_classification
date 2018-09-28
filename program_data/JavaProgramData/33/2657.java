package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[3000][300];
		String b = new String(new char[300]);
		int n;
		int i;
		int j;
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
			for (i = 0;a[j][i] != '\0';i++)
			{
			if (a[j][i] == 'A')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 'T');
			}
			else if (a[j][i] == 'T')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 'A');
			}
			else if (a[j][i] == 'G')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 'C');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 'G');
			}
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			System.out.printf("%s\n",b);
		}
		return 0;
	}

}

