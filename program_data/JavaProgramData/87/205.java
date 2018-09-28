package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int[] s = new int[1000];
	i = 0;
	do
	{
	String tempVar = ConsoleInput.scanfRead();
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
	d = d + 12;
	if (f < c)
	{
		f = f + 60;
		e = e-1;
	}
	if (e < b)
	{
		e = e+60;
		d = d - 1;
	}
	s[i] = (d - a) * 3600 + (e - b) * 60 + f - c;
	i++;
	}while (a != 0);
	for (j = 0;j < i - 1;j++)
	{
		System.out.printf("%d\n",s[j]);
	}
	return 0;

	}
}

