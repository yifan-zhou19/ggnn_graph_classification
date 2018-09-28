package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int s = 0;
		int t = 1;
		double x;
		double y;
		double aa;
		double ss;
		String sa = new String(new char[501]);
		String sb = new String(new char[501]);
		sa = new Scanner(System.in).nextLine();
		x = Double.parseDouble(sa);
		sa = new Scanner(System.in).nextLine();
		sb = new Scanner(System.in).nextLine();
		a = sa.length();
		b = sb.length();
		if (a != b)
		{
			t = 0;
		}
		else if (a == b)
		{
			for (i = 0;i < a;i++)
			{
				if ((sa.charAt(i) != 'A' && sa.charAt(i) != 'G' && sa.charAt(i) != 'T' && sa.charAt(i) != 'C') || (sb.charAt(i) != 'A' && sb.charAt(i) != 'G' && sb.charAt(i) != 'T' && sb.charAt(i) != 'C'))
				{
					t = 0;
					break;
				}
				else if (sa.charAt(i) == sb.charAt(i))
				{
					s++;
				}
			}
		}
		aa = a;
		ss = s;
		y = ss / aa;
		if (t == 0)
		{
			System.out.print("error");
		}
		else if (y >= x)
		{
			System.out.print("yes");
		}
		else if (y <= x)
		{
			System.out.print("no");
		}
		return 0;
	}

}
