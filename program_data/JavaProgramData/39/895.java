package <missing>;

public class GlobalMembers
{
	public static String ansn = new String(new char[80]);
	public static String nm = new String(new char[80]);
	public static int ansm = 0;
	public static int summ = 0;
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	int a;
	int b;
	int e;
	char c;
	char d;
	nm = ConsoleInput.readToWhiteSpace(true).charAt(0);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	c = ConsoleInput.readToWhiteSpace(true).charAt(0);
	d = ConsoleInput.readToWhiteSpace(true).charAt(0);
	e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int s = 0;
	if ((a > 80) && (e) != 0)
	{
		s += 8000;
	}
	if ((a > 85) && (b > 80))
	{
		s += 4000;
	}
	if (a > 90)
	{
		s += 2000;
	}
	if ((a > 85) && (d == 'Y'))
	{
		s += 1000;
	}
	if ((b > 80) && (c == 'Y'))
	{
		s += 850;
	}
	if (s > ansm)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	memcpy(ansn,nm,(Character.SIZE / Byte.SIZE));
	ansm = s;
	}
	summ += s;
	}
	System.out.print(ansn);
	System.out.print("\n");
	System.out.print(ansm);
	System.out.print("\n");
	System.out.print(summ);
	System.out.print("\n");
	return 0;
	}

}

