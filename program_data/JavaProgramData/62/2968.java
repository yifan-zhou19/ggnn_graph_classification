package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		String s = new String(new char[380]);
		s = new Scanner(System.in).nextLine();
		System.out.printf("%c",s.charAt(0));
		for (i = 1;s.charAt(i);i++)
		{
			if (s.charAt(i - 1) == ' ' && s.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		return 0;
	}
}
