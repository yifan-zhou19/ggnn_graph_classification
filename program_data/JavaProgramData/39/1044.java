package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[20]);
	String p = new String(new char[20]);
	char a;
	char b;
	int n;
	int i;
	int num = 0;
	int sum = 0;
	int c;
	int d;
	int e;
	int m = 0;
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
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		a = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		b = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		e = Integer.parseInt(tempVar7);
	}
	if (c > 80 && e >= 1)
	{
	num = num + 8000;
	}
	if (c > 85 && d > 80)
	{
	num = num + 4000;
	}
	if (c > 90)
	{
	num = num + 2000;
	}
	if (b == 'Y' && c > 85)
	{
	num = num + 1000;
	}
	if (a == 'Y' && d > 80)
	{
	num = num + 850;
	}
	if (num > m)
	{
	m = num;
	p = s;
	}
	sum = sum + num;
	num = 0;
	}
	System.out.printf("%s\n%d\n%d\n",p,m,sum);
	}


}

