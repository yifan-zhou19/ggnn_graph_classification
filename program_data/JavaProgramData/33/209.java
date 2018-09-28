package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int n;
		char ch;
		String str = new String(new char[1000]);
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
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (j = 0;j < len;j++)
			{

				switch (str.charAt(j))
				{
				case 'A':
					str = tangible.StringFunctions.changeCharacter(str, j, 'T');
					break;
				case 'T':
					str = tangible.StringFunctions.changeCharacter(str, j, 'A');
					break;
				case 'C':
					str = tangible.StringFunctions.changeCharacter(str, j, 'G');
					break;
				case 'G':
					str = tangible.StringFunctions.changeCharacter(str, j, 'C');
					break;
				}
			}
			System.out.printf("%s",str);
					System.out.print("\n");

		}
		return 0;
	}

}

