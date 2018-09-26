package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char x = '=';
		int i = 0;
		int m;
		int n;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() > b.length())
		{
			n = a.length();
		}
		else
		{
			n = b.length();
		}
		while (true)
		{
		if (i == n)
		{
			if (a.length() > b.length())
			{
				x = '>';
				break;
			}
			if (a.length() < b.length())
			{
				x = '<';
				break;
			}
			if (a.length() == b.length())
			{
				x = '=';
				break;
			}
		}
		if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' && b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
		{
			b.charAt(i) -= 32;
		}
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
		{
			a.charAt(i) -= 32;
		}
		if (a.charAt(i) < b.charAt(i))
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' && b.charAt(i) >= 'a' && b.charAt(i) <= 'z' && ((b.charAt(i) - 32) - a.charAt(i) == 32))
			{
				i++;
				continue;
			}
			else
			{
				x = '<';
				break;
			}
		}
			if (a.charAt(i) > b.charAt(i))
			{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && b.charAt(i) >= 'A' && b.charAt(i) <= 'Z' && (b.charAt(i) - a.charAt(i) == -32))
			{
				i++;
				continue;
			}
			else
			{
				x = '>';
				break;
			}
			}
		i++;
		}
		System.out.printf("%c",x);


		return 0;
	}

}
