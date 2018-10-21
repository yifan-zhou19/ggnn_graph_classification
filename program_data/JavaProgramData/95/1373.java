package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int m;
		int n;
		int e;
		e = 1;
		m = a.length();
		n = b.length();
		if (m < n)
		{
			m = n;
		}
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) < 91)
			{
				a.charAt(i) += 32;
			}
			if (b.charAt(i) < 91)
			{
				b.charAt(i) += 32;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				e--;
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				e--;
				break;
			}
		}
		if (e != 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}
