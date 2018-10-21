package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String x = new String(new char[100]);
		String y = new String(new char[100]);
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		int lenx = x.length();
		int leny = y.length();
		for (i = 0;i < lenx;i++)
		{
			if (x.charAt(i) > 'A' && x.charAt(i) <= 'Z')
			{
				x.charAt(i) += 32;
			}
		}
		for (i = 0;i < leny;i++)
		{
			if (y.charAt(i) > 'A' && y.charAt(i) <= 'Z')
			{
				y.charAt(i) += 32;
			}
		}
		if (strcmp(x,y) > 0)
		{
			System.out.print(">");
		}
		else
		{
			if (strcmp(x,y) < 0)
			{
				System.out.print("<");
			}
			else
			{
				System.out.print("=");
			}
		}
		return 0;
	}
}
