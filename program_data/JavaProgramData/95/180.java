package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int m = a.length();
		String b = new String(new char[100]);
		b = new Scanner(System.in).nextLine();
		int n = b.length();
		int c;
		if (m > n)
		{
			c = m;
		}
		else
		{
			c = n;
		}


		int i;
		for (i = 0;i < c;i++)
		{

			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				a.charAt(i) += 32;
			}
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b.charAt(i) += 32;
			}
			 if (a.charAt(i) > b.charAt(i))
			 {
				System.out.print(">");
				break;
			 }
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
			else
			{
				continue;
			}
		}
		if (i >= c)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
