package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			a = str.length();
			if (str.charAt(a - 2) == 'e' && str.charAt(a - 1) == 'r')
			{
				str = tangible.StringFunctions.changeCharacter(str, a - 2, '\0');
			}
			if (str.charAt(a - 2) == 'l' && str.charAt(a - 1) == 'y')
			{
				str = tangible.StringFunctions.changeCharacter(str, a - 2, '\0');
			}
			if (str.charAt(a - 3) == 'i' && str.charAt(a - 2) == 'n' && str.charAt(a - 1) == 'g')
			{
				str = tangible.StringFunctions.changeCharacter(str, a - 3, '\0');
			}
			System.out.println(str);
			if (i < n - 1)
			{
				System.out.print("\n");
			}

		}
	}



}

