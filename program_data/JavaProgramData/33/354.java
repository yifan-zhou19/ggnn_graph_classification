package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			num = a.length();
			for (j = 0;j < num;j++)
			{
				switch (a.charAt(j))
				{
				case'A':
				b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				continue;
				case'T':
				b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				continue;
				case'C':
				b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				continue;
				case'G':
				b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				continue;
				}
			}
			for (j = 0;j < num;j++)
			{
				System.out.printf("%c",b.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

