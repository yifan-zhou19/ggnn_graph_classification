package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;1;j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, System.in.read());
			if (a.charAt(j) == '\n')
			{
				m = j;
				break;
			}
		}
		for (j = 0;j <= m - 1;j++)
		{
			 switch (a.charAt(j))
			 {
			case 'A':
				b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				break;
			case 'T':
				b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				break;
			case 'G':
				b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				break;
			case 'C':
				b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				break;
			 }
		}
		for (j = 0;j <= m - 1;j++)
		{
			System.out.printf("%c",b.charAt(j));
		}
		System.out.print('\n');

	}
	return 0;
	}
}

