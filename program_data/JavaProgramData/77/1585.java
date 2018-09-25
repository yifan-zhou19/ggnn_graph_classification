package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static char p;
	public static char q;

	public static void solve()
	{
		int i = 0;
		int b;
		int g;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == p)
			{
				b = i;
			}
			else if (a.charAt(i) == q)
			{
				g = i;
				a = tangible.StringFunctions.changeCharacter(a, b, '0');
				a = tangible.StringFunctions.changeCharacter(a, g, '0');
				System.out.print(b);
				System.out.print(' ');
				System.out.print(g);
				System.out.print("\n");
				solve();
				break;
			}
			i++;
		}
		return;
	}


	public static int Main()
	{

		cin.get(a,100);
		p = a.charAt(0);
		int i = 0;
		while (true)
		{
			if (a.charAt(i) != p)
			{
				q = a.charAt(i);
				break;
			}
			i++;
		}
		solve();

		return 0;
	}


}

