package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String ratio = new String(new char[20]);
		double r;
		double R;
		int i;
		int c;
		ratio = new Scanner(System.in).nextLine();
		r = Double.parseDouble(ratio);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() != b.length())
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T'))
			{
				System.out.print("error");
				return 0;
			}
		}
		c = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				c = c + 1;
			}
		}
		R = (1.0 * c) / a.length();
		if (R >= r)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}
