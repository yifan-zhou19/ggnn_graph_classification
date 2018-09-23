package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		char t;
		int i = 0;
		c = System.in.read();
		if (c >= 97)
		{
			c -= 32;
		}
		t = c;
		while (c != '\n')
		{
			if (c >= 97)
			{
				c -= 32;
			}
			if (t == c)
			{
				i++;
			}
			else
			{
				System.out.print("(");
				System.out.print(t);
				System.out.print(",");
				System.out.print(i);
				System.out.print(")");
				i = 1;
				t = c;
			}
			c = System.in.read();
		}
		System.out.print("(");
		System.out.print(t);
		System.out.print(",");
		System.out.print(i);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}

}
