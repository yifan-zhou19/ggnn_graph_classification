package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		String s = new String(new char[20]);
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			l = s.length();
			for (j = 0;s.charAt(j);j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, s.charAt(l - j - 1));
			}
			if (str.charAt(0) == 'r' || str.charAt(0) == 'y')
			{
				for (j = 0;j < l - 2;j++)
				{
			System.out.printf("%c",s.charAt(j));
				}
			}
			if (str.charAt(0) == 'g')
			{
				for (j = 0;j < l - 3;j++)
				{
			System.out.printf("%c",s.charAt(j));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

