package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char c;
		int t = 0;
		int i;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		c = a.charAt(0);
		t = 1;
		if (c >= 'a' && c <= 'z')
		{
			   c = c - 32;
		}
		for (i = 1 ; i <= len - 1 ; i++)
		{
			if (c >= 'a' && c <= 'z')
			{
			   c = c - 32;
			}
			if (a.charAt(i) == c || a.charAt(i) == c + 32)
			{
				t++;
			}
			else
			{
				System.out.print('(');
				System.out.print(c);
				System.out.print(',');
				System.out.print(t);
				System.out.print(')');
				c = a.charAt(i);
				t = 1;
			}
		}
		System.out.print('(');
		System.out.print(c);
		System.out.print(',');
		System.out.print(t);
		System.out.print(')');
		return 0;
	}


}

