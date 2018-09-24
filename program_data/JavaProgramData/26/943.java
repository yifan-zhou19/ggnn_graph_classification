package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[N + 1]);
		String b = new String(new char[N + 1]);
		int k = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i - 1);i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			k++;
			}
		}
		System.out.println(b);
		return 0;
	}
}

