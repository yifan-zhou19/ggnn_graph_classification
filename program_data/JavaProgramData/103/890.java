package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char b;
		int i;
		int l = 0;
		int m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = a.length();
	for (i = 0 ; i < m ; i++)
	{
		if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) + 32 == a.charAt(i + 1) || a.charAt(i) - 32 == a.charAt(i + 1))
		{
			l++;
			continue;
		}
		else
		{
			if (a.charAt(i) - 'Z' > 0)
			{
				b = a.charAt(i) - 32;
			}
			else
			{
				b = a.charAt(i);
			}
		System.out.print("(");
		System.out.print(b);
		System.out.print(",");
		System.out.print(l + 1);
		System.out.print(")");
		l = 0;
		}
	}
	return 0;
	}

}

