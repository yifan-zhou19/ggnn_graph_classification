package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char i;
		char j;
		char n;
		char m;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) != ' ')
					{
						break;
					}
					a = tangible.StringFunctions.changeCharacter(a, j, '>');
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != '>')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}
		m = b.length();
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}







		return 0;
	}
}

