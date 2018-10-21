package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int con = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
		{
			a.charAt(0) -= 32;
		}
		for (i = 1; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a.charAt(i) -= 32;
			}
			if (a.charAt(i) == a.charAt(i - 1))
			{
				con++;
			}
			else
			{
				System.out.print('(');
				System.out.print(a.charAt(i - 1));
				System.out.print(',');
				System.out.print(con);
				System.out.print(')');
				con = 1;
			}
		}
		System.out.print('(');
		System.out.print(a.charAt(i - 1));
		System.out.print(',');
		System.out.print(con);
		System.out.print(')');
		return 0;
	}
}

