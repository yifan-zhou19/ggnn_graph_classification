package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		int r;
		int x;
		int y;
		int z;
		int n;
	String a = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	for (i = 2;i <= n;i++)
	{
		for (r = 0;r <= n - i;r++)
		{
		z = 0;
	for (y = 0;y <= i / 2;y++)
	{
		if (a.charAt(r + y) != a.charAt(r + i - 1 - y))
		{
			z = 1;
			break;
		}

	}
	if (z == 0)
	{
	for (b = r;b <= r + i - 1;b++)
	{
	System.out.printf("%c",a.charAt(b));
	}
	}
	if (b == r + i - 1)
	{
		System.out.print("\n");
		b = 0;
	}
		}
	}
	}
}

