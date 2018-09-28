package <missing>;

public class GlobalMembers
{
	public static int Test1(int n)
	{
		int d = 0;
		int m = n;
		while (m != 0)
		{
			d = d * 10 + m % 10;
			m /= 10;
		}
		return d == n;
	}
	public static int Test2(int n)
	{
	int m = (int)Math.sqrt(n);
	int i;
	for (i = 2;i <= m;i++)
	{
	if (n % i == 0)
	{
	break;
	}
	}
	if (i == m + 1)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public static int Main()
	{
	int n;
	int m;
	int nCount = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (int i = n;i <= m;i++)
	{
	if (Test1(i) != 0 && Test2(i) != 0)
	{
	if (nCount == 0)
	{
	System.out.printf("%d",i);
	}
	else
	{
	System.out.printf(",%d",i);
	}
	nCount++;
	}
	}
	if (nCount == 0)
	{
	System.out.print("no");
	}
	System.out.print("\n");

	}
}

