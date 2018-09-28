package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int same = 0;
		int flag = 1;
		double n;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		n = Double.parseDouble(c);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				flag = 0;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				same++;
			}
		}
		double m;
		m = 1.0 * same / a.length();
		if ((a.length() != b.length()) || flag == 0)
		{
			System.out.print("error");
		}
		else if (m <= n)
		{
			System.out.print("no");
		}
		else if (m > n)
		{
			System.out.print("yes");
		}
		return 0;
	}


}
