package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] m = new int[1000];
		char[][] a = new char[1000][1000];
		String b = new String(new char[1000]);
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
			m[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				}
				if (a[i][j] == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				}
				if (a[i][j] == 'G')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				}
				if (a[i][j] == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				}
				System.out.printf("%c",b.charAt(j));

			}
			System.out.print("\n");

		}
		return 0;
	}

}

