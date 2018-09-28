package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l - 1;i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
			System.out.printf("%c",s.charAt(i));
			}
			if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)) == 0)
			{
			System.out.print("\n");
			}
		}
		if (Character.isDigit(s.charAt(l - 1)))
		{
		System.out.printf("%c",s.charAt(l - 1));
		}
		return 0;
	}
}
