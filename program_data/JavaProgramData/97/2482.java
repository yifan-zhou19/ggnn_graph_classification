package <missing>;

public class GlobalMembers
{
	//??????????
	//?????2011?1?
	//???????
	public static int Main()
	{
	int a; //????
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int sum;
	sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = sum / 100; //??100???
	b = (sum - 100 * a) / 50; //??50???
	if (b < 0)
	{
	b = 0;
	}
	c = (sum - a * 100 - b * 50) / 20; //??20???
	if (c < 0)
	{
	c = 0;
	}
	d = (sum - a * 100 - b * 50 - c * 20) / 10; //??10???
	if (d < 0)
	{
	d = 0;
	}
	e = (sum - a * 100 - b * 50 - c * 20 - d * 10) / 5; //??5???
	if (e < 0)
	{
	e = 0;
	}
	f = sum - a * 100 - b * 50 - c * 20 - d * 10 - e * 5; //??1???
	if (f < 0)
	{
	f = 0;
	}
	System.out.print(a);
	System.out.print("\n");
	System.out.print(b);
	System.out.print("\n");
	System.out.print(c);
	System.out.print("\n");
	System.out.print(d);
	System.out.print("\n");
	System.out.print(e);
	System.out.print("\n");
	System.out.print(f);
	System.out.print("\n");
	return 0;
	}

}

