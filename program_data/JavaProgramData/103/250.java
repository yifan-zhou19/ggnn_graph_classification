package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1005]);
		char t;
		int n;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = 0;
		if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		{
			t = a.charAt(i);
		}
		else
		{
			t = a.charAt(i) - 32;
		}
		n = 1;
		for (int i = 1;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != t && a.charAt(i) - 32 != t)
			{
				System.out.print('(');
				System.out.print(t);
				System.out.print(',');
				System.out.print(n);
				System.out.print(')');
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
				{
					t = a.charAt(i);
				}
				else
				{
					t = a.charAt(i) - 32;
				}
				n = 1;
			}
			else
			{
				n++;
			}
		}
		System.out.print('(');
		System.out.print(t);
		System.out.print(',');
		System.out.print(n);
		System.out.print(')');
		return 0;
	}
}

