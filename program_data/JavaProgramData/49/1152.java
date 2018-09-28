package <missing>;

public class GlobalMembers
{
	public static void print(int n1, int n2)
	{
		while (n1 <= n2)
		{
			System.out.printf("%c",s.charAt(n1));
			n1++;
		}
	}
	public static String s = new String(new char[500]);
	public static char[][] z = new char[500][250];
	public static int Main()
	{

		s = new Scanner(System.in).nextLine();
		int h;
		int a;
		int b;
		int c;
		int d;
		h = s.length();
		for (a = 0;a < h - 1;a++)
		{
			if (s.charAt(a) == s.charAt(a + 1))
			{
				z[a][a + 1] = 1;
				print(a, a + 1);
				 System.out.print("\n");
			}
			z[a][a] = 1;
		}
		z[h - 1][h - 1] = 1;
		for (d = 2;d < h;d++)
		{
			for (b = 0;b < h - d;b++)
			{
				c = b + d;
			if ((z[b + 1][c - 1] == 1) && (s.charAt(b) == s.charAt(c)))
			{
				z[b][c] = 1;
			   print(b, c);
			   System.out.print("\n");
			}
			}
		}
		return 0;

	}
}
