package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		String s = new String(new char[40]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if ((s.charAt(i) == 0 || s.charAt(i - 1) < '0' || s.charAt(i - 1)>'9') && (s.charAt(i - 1) != '-'))
			{
				while ((s.charAt(i) >= '0') && (s.charAt(i) <= '9') && (i < s.length()))
				{
					System.out.printf("%c",s.charAt(i++));
				}
				System.out.print("\n");
			}
		}
	}
}
