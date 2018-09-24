package <missing>;

public class GlobalMembers
{
	public static void tries(String k)
	{
	int a;
	int b;
	int c;
	int aa;
	int bb;
	int cc;
	if (k[0].equals('A'))
	{
		a = 3;
	}
	if (k[1].equals('A'))
	{
		a = 2;
	}
	if (k[2].equals('A'))
	{
		a = 1;
	}
	if (k[0].equals('B'))
	{
		b = 3;
	}
	if (k[1].equals('B'))
	{
		b = 2;
	}
	if (k[2].equals('B'))
	{
		b = 1;
	}
	if (k[0].equals('C'))
	{
		c = 3;
	}
	if (k[1].equals('C'))
	{
		c = 2;
	}
	if (k[2].equals('C'))
	{
		c = 1;
	}
	aa = (b > a) + (c == a);
	bb = (a > b) + (a > c);
	cc = (c > b) + (b > a);
	if ((a + aa == 3) && (b + bb == 3) && (c + cc == 3))
	{
		System.out.print(k[2]);
		System.out.print(k[1]);
		System.out.print(k[0]);
		System.out.print("\n");
	}
	}
	public static int Main()
	{
	tries("ABC");
	tries("ACB");
	tries("BAC");
	tries("BCA");
	tries("CAB");
	tries("CBA");
	}
}
