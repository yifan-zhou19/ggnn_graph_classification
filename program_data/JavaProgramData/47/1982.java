package <missing>;

public class GlobalMembers
{
	public static void diverse(int x) //??
	{
		int c;
		int p = x;
		char ch;
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.get(ch);
		if (ch == '\n')
		{
			System.out.print(c);
			if (x != 0)
			{
				System.out.print(' ');
			}
			return;
		}
		else
		{
			p++;
			diverse(p);
		}
		System.out.print(c);
		if (x != 0)
		{
			System.out.print(' ');
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //???
		int x = 0;
		diverse(0);
		return 0;
	}
}

