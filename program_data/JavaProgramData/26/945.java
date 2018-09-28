package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int l;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i <= k;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1) && a.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}

		System.out.println(b);
		return 0;
	}
}

