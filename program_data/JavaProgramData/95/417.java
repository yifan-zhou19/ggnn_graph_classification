package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int x;
		int y;
		int c;
		int d;
		int e;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		x = a.length();
		e = 0;
		for (y = 0;y < x;y++)
		{
			if (a.charAt(y) < 96)
			{
				c = a.charAt(y) + 32;
			}
			else
			{
				c = a.charAt(y);
			}
			if (b.charAt(y) < 96)
			{
				d = b.charAt(y) + 32;
			}
			else
			{
				d = b.charAt(y);
			}
			if (c == d)
			{
				continue;
			}
			else if (c > d)
			{
				e++;
				System.out.print(">\n");
				break;
			}
			else if (c < d)
			{
				e++;
				System.out.print("<\n");
				break;
			}
		}
		if (e == 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
