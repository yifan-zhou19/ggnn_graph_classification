package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int i;
	int begin;
	int end;
	int flag = 0;
	int x1;
	int x2;
	int y1;
	int y2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n * n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	if (a == 0)
	{
	if (flag == 0)
	{
		begin = i;
	}
	flag = 1;
	end = i;
	}
	}
	x1 = (begin + n - 1) / n;
	y1 = begin % n;
	x2 = (end + n - 1) / n;
	y2 = end - n * (x2 - 1);

	System.out.printf("%d\n",(x2 - x1 - 1) * (y2 - y1 - 1));
	return 0;
	}

}

