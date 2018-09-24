package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
			{
				for (j = i;j < l;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				i--;
			}
		}
		System.out.println(a);
	}
}

