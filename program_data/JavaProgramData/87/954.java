package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		while (true)
		{
		   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s;
		s = (d + 12 - a) * 3600;
		if (b >= e)
		{
		   s -= (b - e) * 60;
		}
		else
		{
		   s += (e - b) * 60;
		}
		if (c >= f)
		{
		   s -= c - f;
		}
		else
		{
		   s += f - c;
		}
		if (a == 0 && b == 0 && c == 0 & d == 0 && e == 0 && f == 0)
		{
		   break;
		}
		else
		{
		   System.out.print(s);
		   System.out.print("\n");
		}
		}
		return (0);
	}
}

