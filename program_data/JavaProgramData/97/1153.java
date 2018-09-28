package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	int t5 = 0;
	int t6 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n >= 100)
	{
	n -= 100;
	t1++;
	}
	while (n >= 50)
	{
	n -= 50;
	t2++;
	}
	while (n >= 20)
	{
	n -= 20;
	t3++;
	}
	while (n >= 10)
	{
	n -= 10;
	t4++;
	}
	while (n >= 5)
	{
	n -= 5;
	t5++;
	}
	while (n >= 1)
	{
	n -= 1;
	t6++;
	}
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n", t1,t2,t3,t4, t5, t6);
	}
}

