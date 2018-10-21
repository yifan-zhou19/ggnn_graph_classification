package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int m;
	int n;
	int j;
	int k;
	int sum;
	sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	m = (a - 1) / 4;
	n = (a - 1) / 100;
	k = (a - 1) / 400;
	sum += 1 * (a - 1) + m + k - n;
	for (j = 1;j < b;j++)
	{
	if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
	{
	sum += 3;
	}
	if (j == 4 || j == 6 || j == 9 || j == 11)
	{
	sum += 2;
	}
	if (a % 4 == 0 && a % 100 != 0 && j == 2)
	{
	sum += 1;
	}
	if (a % 400 == 0 && j == 2)
	{
	sum += 1;
	}
	else
	{
	sum += 0;
	}
	}
	sum += c;
	if (sum % 7 == 0)
	{
	System.out.print("Sun.");
	}
	if (sum % 7 == 1)
	{
	System.out.print("Mon.");
	}
	if (sum % 7 == 2)
	{
	System.out.print("Tue.");
	}
	if (sum % 7 == 3)
	{
	System.out.print("Wed.");
	}
	if (sum % 7 == 4)
	{
	System.out.print("Thu.");
	}
	if (sum % 7 == 5)
	{
	System.out.print("Fri.");
	}
	if (sum % 7 == 6)
	{
	System.out.print("Sat.");
	}
	return 0;
	}

}

