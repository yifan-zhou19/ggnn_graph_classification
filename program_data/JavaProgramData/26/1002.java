package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		j = 0;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				j = j;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}
		b = b.substring(0, j);
		System.out.println(b);
		return 0;
	}

}

