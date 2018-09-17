package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char c;
		int n = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
		{
			c = a.charAt(0) - 'a' + 'A';
		}
		else
		{
			c = a.charAt(0);
		}
		System.out.print("(");
		System.out.print(c);
		System.out.print(",");
		for (int i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == c || a.charAt(i) == c - 'A' + 'a')
			{
				n++;
			}
			else
			{
				if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
				{
					c = a.charAt(i) - 'a' + 'A';
				}
				else
				{
					c = a.charAt(i);
				}
				System.out.print(n);
				System.out.print(")(");
				System.out.print(c);
				System.out.print(",");
				n = 1;
			}
		}
		System.out.print(n);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}
}

