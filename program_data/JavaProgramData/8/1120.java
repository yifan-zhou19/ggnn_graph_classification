package <missing>;

public class GlobalMembers
{
	public static int na;
	public static int nb;
	public static int[] a;
	public static int[] b;
	public static void input()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		na = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		nb = Integer.parseInt(tempVar2);
	}
	a = new int[na];
	b = new int[nb];
	for (int i = 0;i < na;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (int i = 0;i < nb;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	}

	public static int pfC(Object x, Object y)
	{
		int t;
		t = (int)x - (int)y;
		return t;
	}
	public static void order()
	{
	qsort(a,na,(Integer.SIZE / Byte.SIZE),pfC);
	qsort(b,nb,(Integer.SIZE / Byte.SIZE),pfC);
	}

	public static void print()
	{
	System.out.printf("%d",a[0]);
	for (int i = 1;i < na;i++)
	{
	System.out.printf(" %d",a[i]);
	}
	for (int i = 0;i < nb;i++)
	{
	System.out.printf(" %d",b[i]);
	}
	}

	public static int Main()
	{
	input();
	order();
	print();
	}
}

