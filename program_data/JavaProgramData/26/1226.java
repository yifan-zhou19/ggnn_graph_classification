package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int n;
		int k;
		int j;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0,k = 0;i <= n;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
			b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			k = k + 1;
		}
		System.out.println(b);
		return 0;
	}
}

