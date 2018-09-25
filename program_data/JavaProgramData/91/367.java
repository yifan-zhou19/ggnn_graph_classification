package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[150]);
		String b = new String(new char[150]);
		int i;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (i != len - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
		}
		b = b.substring(0, i);
		System.out.printf("%s\n",b);
	}
}

