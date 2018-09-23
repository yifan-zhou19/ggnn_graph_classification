package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[1010]);
		char t;
		int c = 1;
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		t = m.charAt(0);
		for (int i = 1; i < m.length(); i++)
		{
			if (m.charAt(i) == t || m.charAt(i) - 32 == t || m.charAt(i) + 32 == t)
			{
				c++;
			}
			else
			{
				if (t >= 'A' && t <= 'Z')
				{
					System.out.print("(");
					System.out.print((char)t);
					System.out.print(",");
					System.out.print(c);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print((char)(t - 32));
					System.out.print(",");
					System.out.print(c);
					System.out.print(")");
				}
				c = 1;
				t = m.charAt(i);
			}
		}
		if (t >= 'A' && t <= 'Z')
		{
			System.out.print("(");
			System.out.print((char)t);
			System.out.print(",");
			System.out.print(c);
			System.out.print(")");
			System.out.print("\n");
		}
		else
		{
			System.out.print("(");
			System.out.print((char)(t - 32));
			System.out.print(",");
			System.out.print(c);
			System.out.print(")");
			System.out.print("\n");
		}
		return 0;
	}

}

