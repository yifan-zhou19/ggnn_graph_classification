package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int n;
		n = a.length();
		int i;
		int j;
		int k;
		String b = new String(new char[100]);
		for (i = 0,k = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				k++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				k++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		return 0;
	}

}

