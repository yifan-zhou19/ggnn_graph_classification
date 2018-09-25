package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[1000]);
		char a;
		int size;
		int i = 0;
		int b;
		int lonth;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = ch.charAt(0);
		if (a >= 'a' && a <= 'z')
		{
			a += ('A' - 'a');
		}
		size = 0;
		lonth = ch.length();
		for (i = 0; i <= lonth;)
		{
			b = ch.charAt(i) - a;
			if (b == 0 || b == ('a' - 'A'))
			{
				size++;
				i++;
			}
			else
			{
				System.out.print("(");
				System.out.print(a);
				System.out.print(",");
				System.out.print(size);
				System.out.print(")");
				a = ch.charAt(i);
				if (a >= 'a' && a <= 'z')
				{
					a = 'A' + a - 'a';
				}
				size = 0;
			}
		}
		return 0;
	}


}

