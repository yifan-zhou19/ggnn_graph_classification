package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int w;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int[] num = new int[100];
	for (w = 0;w < 50;w++)
	{
		num[w] = 0;
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
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	if (a == 0)
	{
	break;
	}
	if (f < c)
	{
	f = f + 60;
	e--;
	}
	if (e < b)
	{
	e = e+60;
	d--;
	}
	num[w] = f - c + 60 * (e - b) + 3600 * (d + 12 - a);
	}
	   for (w = 0;num[w] != 0;w++)
	   {
			System.out.printf("%d\n",num[w]);
	   }

	return 0;
	}

}

