package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int k;
	int a;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (k = 1;k <= m;k++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a = Integer.parseInt(tempVar3);
	}
	if ((a + k * 3) <= 60)
	{
	s = a + (60 - a - 3 * k);
	}
	if ((a + k * 3) > 60 && (a + k * 3) <= 63)
	{
	s = a;
	}
	}
	if (m == 0)
	{
	s = 60;
	}
	System.out.printf("%d\n",s);
	}
	return 0;
	}



}

