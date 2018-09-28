package <missing>;

public class GlobalMembers
{
	public static int time(int a, int b, int c, int d, int e, int f)
	{
	int total;
	total = 60 - c + f + (59 - b + e) * 60 + (d - a + 11) * 3600;
	return total;
	}
	public static int Main()
	{
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] c = new int[1000];
	int[] d = new int[1000];
	int[] e = new int[1000];
	int[] f = new int[1000];
	int i = 0;
	int j;
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(a[i]) = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(b[i]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(c[i]) = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		(d[i]) = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		(e[i]) = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		(f[i]) = Integer.parseInt(tempVar6);
	}
	i++;
	if (a[i - 1] == 0 && b[i - 1] == 0 && c[i - 1] == 0 && d[i - 1] == 0 && e[i - 1] == 0 && f[i - 1] == 0)
	{
	break;
	}
	}
	for (j = 0;j < i - 1;j++)
	{
	System.out.printf("%d\n",time(a[j], b[j], c[j], d[j], e[j], f[j]));
	}
	return 0;
	}
}

