package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[85]);
		String b = new String(new char[85]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) > 'Z')
			{
				a.charAt(i) -= 32;
			}
		}
		for (int i = 0;i < b.length();i++)
		{
			if (b.charAt(i) > 'Z')
			{
				b.charAt(i) -= 32;
			}
		}
		int key = strcmp(a,b);
		if (key == 0)
		{
			System.out.print("=");
		}
		else if (key == 1)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
	}
}
