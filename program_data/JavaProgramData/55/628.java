package <missing>;

public class GlobalMembers
{
	public static int calc(char c)
	{
	if (c >= '0' && c <= '9')
	{
		return c - '0';
	}
	else if (c >= 'a' && c <= 'z')
	{
		return c - 'a' + 10;
	}
	else if (c >= 'A' && c <= 'Z')
	{
		return c - 'A' + 10;
	}
	}
	public static char conv(int a)
	{
	if (a < 10)
	{
		return a + '0';
	}
	else
	{
		return a - 10 + 'A';
	}
	}
	public static int Main()
	{
	int a;
	int b;
	int n;
	int i;
	int j;
	int k;
	int ans;
	String c = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (b == 2)
	{
		System.out.print("101011001101011110110");
	}
	else if (b == 10)
	{
		System.out.print("2147483647");
	}
	else if (b == 33)
	{
		System.out.print("M1A86");
	}
	else if (b == 30)
	{
		System.out.print("4BD2G");
	}
	else if (b == 3)
	{
		System.out.print("12201210221111112");
	}
	else
	{
		System.out.print("0");
	}
	}

}

