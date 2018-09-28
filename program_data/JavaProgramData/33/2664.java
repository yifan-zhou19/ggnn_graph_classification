package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int p;
		String a = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
			p = 0;
			do
			{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, p, tempVar2);
			}
			switch (a.charAt(p))
			{
				case 'A':
					a = tangible.StringFunctions.changeCharacter(a, p, 'T');
					break;
				case 'T':
					a = tangible.StringFunctions.changeCharacter(a, p, 'A');
					break;
				case 'G':
					a = tangible.StringFunctions.changeCharacter(a, p, 'C');
					break;
				case 'C':
					a = tangible.StringFunctions.changeCharacter(a, p, 'G');
					break;
			}
			System.out.printf("%c",a.charAt(p));
			p = p + 1;
			}while (a.charAt(p - 1) != '\n');
		}
		return 0;
	}



}

