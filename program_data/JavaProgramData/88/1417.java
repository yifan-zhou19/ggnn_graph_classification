package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		String s = new String(new char[100]);
		int i;
		int flag1 = -1;
		int flag2 = -1;
		int m;
		s = new Scanner(System.in).nextLine();
		m = s.length();
		for (i = 0;i < m;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				System.out.printf("%c",s.charAt(i));
			}
			if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') && (!(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')))
			{
				System.out.print("\n");
			}
		}
	}
}
