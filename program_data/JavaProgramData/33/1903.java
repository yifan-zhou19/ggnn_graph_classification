package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int n;
		int i;
		int a1;
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
				a = tempVar2.charAt(0);
			}
			a1 = a.length();
			for (j = 0;j < a1;j++)
			{
				switch (a.charAt(j))
				{
				case 'A':
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
					break;
				case 'T':
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
					break;
				case 'C':
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
					break;
				case 'G':
					b = tangible.StringFunctions.changeCharacter(b, j, 'C');
					break;
				}
				System.out.printf("%c",b.charAt(j));
			}
			System.out.print("\n");
		}

	}
}

