package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		String s = new String(new char[300]);
	s = new Scanner(System.in).nextLine();
	l = s.length();
	for (i = 0;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) != 32)
	{
		System.out.printf("%c",s.charAt(i));
	}
	if (s.charAt(i) == 32 && s.charAt(i + 1) != 32)
	{
		System.out.printf("%c",s.charAt(i));
	}

	}


		return 0;
	}
}
