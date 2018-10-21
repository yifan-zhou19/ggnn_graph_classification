package <missing>;

public class GlobalMembers
{
	//??????NOI??????????~~
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int s;
	while (true)
	{
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = (d - a) * 3600 + (e - b) * 60 + (f - c);
	if (s == 0)
	{
		return 0;
	}
	s += 43200;
	System.out.print(s);
	System.out.print("\n");
	}
	}
}

