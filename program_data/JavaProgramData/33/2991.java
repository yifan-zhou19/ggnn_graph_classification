package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			System.in.read();
		i = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
					int l = a.length();
					a = tangible.StringFunctions.changeCharacter(a, l, '\0');
			for (x = 0;x < 300;x++)
			{
			if (a.charAt(x) == 'A')
			{
				a = tangible.StringFunctions.changeCharacter(a, x, 'T');
				System.out.printf("%c",a.charAt(x));
			}
			else if (a.charAt(x) == 'T')
			{
				a = tangible.StringFunctions.changeCharacter(a, x, 'A');
				System.out.printf("%c",a.charAt(x));
			}
			else if (a.charAt(x) == 'G')
			{
				a = tangible.StringFunctions.changeCharacter(a, x, 'C');
				System.out.printf("%c",a.charAt(x));
			}
			else if (a.charAt(x) == 'C')
			{
				a = tangible.StringFunctions.changeCharacter(a, x, 'G');
				System.out.printf("%c",a.charAt(x));
			}
			else
			{
				break;
			}
			}
		System.out.print("\n");
		}
		return 0;
	}
}

