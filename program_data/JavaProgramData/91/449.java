package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char c;
		int len;
		int i;
		int asc1;
		int asc2;
		s = new Scanner(System.in).nextLine();
		len = s.length();

		for (i = 0;i < len - 1;i++)
		{
			asc1 = s.charAt(i);
			asc2 = s.charAt(i + 1);
			c = asc1 + asc2;
			System.out.printf("%c",c);
		}

		asc1 = s.charAt(len - 1);
		asc2 = s.charAt(0);
		c = asc1 + asc2;
		System.out.printf("%c",c);

		return 0;
	}

}
