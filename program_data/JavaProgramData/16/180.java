package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i1;
	int m1;
	int i2;
	int m2;
	int i3;
	int m3;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 10)
	{
	System.out.printf("%d", n);
	}
	else
	{
	if (n >= 10 && n < 100)
	{
	i1 = n % 10;
	m1 = n / 10;
	System.out.printf("%d%d", i1, m1);
	}
	else
	{
	if (n >= 100 && n < 1000)
	{
	i1 = n % 10;
	m1 = n / 10;
	i2 = m1 % 10;
	m2 = m1 / 10;
	System.out.printf("%d%d%d", i1, i2, m2);
	}
	else
	{
	if (n >= 1000 && n < 9999)
	{
	i1 = n % 10;
	m1 = n / 10;
	i2 = m1 % 10;
	m2 = m1 / 10;
	i3 = m2 % 10;
	m3 = m2 / 10;
	System.out.printf("%d%d%d%d", i1, i2, i3, m3);
	}
	else
	{
	System.out.print("00001");
	}
	}
	}
	}
	}

}

