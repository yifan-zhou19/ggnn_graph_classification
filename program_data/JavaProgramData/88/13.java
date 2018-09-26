package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[30]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
			{
				System.out.printf("%c",s.charAt(i));
			}
			else if (s.charAt(i + 1) > 47 && s.charAt(i + 1) < 58)
			{
				System.out.print("\n");
			}
		}
		System.in.read();
		System.in.read();
	}
}
