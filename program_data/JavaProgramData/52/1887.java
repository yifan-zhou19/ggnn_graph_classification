package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int i;
	int[] a = new int[200];
	int[] p = a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	p = p + m;
	for (i = 1;i <= n - m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p = Integer.parseInt(tempVar3);
	}
	p++;
	}
	p = a;
	for (i = 1;i <= m;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		p = Integer.parseInt(tempVar4);
	}
	p++;
	}
			p = a;
	for (i = 0;i <= n - 2;i++)
	{
	System.out.printf("%d ",p[0]);
					p++;
	}
	System.out.printf("%d",p[0]);
	}

}

