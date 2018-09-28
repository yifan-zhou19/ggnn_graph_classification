package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int ans;
	for (i = 0;i < 1000;i++)
	{
	String tempVar = ConsoleInput.scanfRead(" ");
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
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
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
	{
		return 0;
	}
	else if (c <= f != 0 && b <= e)
	{
		ans = (12 + d - a) * 3600 + (e - b) * 60 + (f - c) * 1;
	}
	else if (c >= f != 0 && b <= e)
	{
		ans = (12 + d - a) * 3600 + (e - b) * 60 + (f - c) * 1;
	}
	else if (c <= f != 0 && b >= e)
	{
		ans = (12 + d - a) * 3600 + (e - b) * 60 + (f - c) * 1;
	}
	else if (c >= f != 0 && b >= e)
	{
		ans = (12 + d - a) * 3600 + (e - b) * 60 + (f - c) * 1;
	}
	System.out.printf("%d\n",ans);
	}
	return 0;
	}
}

