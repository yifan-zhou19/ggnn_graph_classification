package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
				a = tempVar2.charAt(0);
			}
			for (j = 1;j <= a.length();j++)
			{
				if (a.charAt(j - 1) == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, j - 1, 'T');
				}
				else if (a.charAt(j - 1) == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, j - 1, 'A');
				}
				else if (a.charAt(j - 1) == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, j - 1, 'G');
				}
				else if (a.charAt(j - 1) == 'G')
				{
					b = tangible.StringFunctions.changeCharacter(b, j - 1, 'C');
				}
			}
			for (m = 1;m <= a.length();m++)
			{
				System.out.printf("%c",b.charAt(m - 1));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

