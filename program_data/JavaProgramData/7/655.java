package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int x = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int sl = s.length();
		int al = a.length();
		int bl = b.length();
		for (int i = 0;i < sl;i++)
		{
			if ((a.charAt(0) == s.charAt(i) && a.charAt(al - 2) == s.charAt(i + al - 2)) && x == 0)
			{
				for (int w = 0;w < bl;w++)
				{
					System.out.printf("%c",b.charAt(w));
				}
				i += al - 1;
				x = 1;

			}

			else
			{

					System.out.printf("%c",s.charAt(i));

			}
		}
			return 0;
	}

}
