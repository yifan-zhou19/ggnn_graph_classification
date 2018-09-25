package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int l;
		l = a.length();
		int i;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}
		int t;
		t = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
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
			else if (a.charAt(i) == b.charAt(i))
			{
				t++;
			}
		}
		if (t == l)
		{
			System.out.print("=");
		}
	}
}
