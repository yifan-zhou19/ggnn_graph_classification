package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);
		int i;
		int j;
		int k = 0;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				System.out.printf("%c",s.charAt(i));
				k = 0;
			}
			else if (k == 0)
			{
				System.out.print("\n");
				k = 1;
			}
		}
		return 0;
	}
}
