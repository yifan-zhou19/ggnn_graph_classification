package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int x;
	 int y;
	 int z;
	 int[] sz = new int[10000];
	 int m = 0;
	 int i;
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
		x = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		z = Integer.parseInt(tempVar6);
	}
	while (a != 0 || b != 0 || c != 0 && x != 0 || y != 0 || z != 0)
	{
	sz[m] = 3600 * (x + 12 - a) + 60 * (y - b) + (z - c);
	m++;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		a = Integer.parseInt(tempVar7);
	}
	String tempVar8 = ConsoleInput.scanfRead(" ");
	if (tempVar8 != null)
	{
		b = Integer.parseInt(tempVar8);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ");
	if (tempVar9 != null)
	{
		c = Integer.parseInt(tempVar9);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		x = Integer.parseInt(tempVar10);
	}
	String tempVar11 = ConsoleInput.scanfRead(" ");
	if (tempVar11 != null)
	{
		y = Integer.parseInt(tempVar11);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ");
	if (tempVar12 != null)
	{
		z = Integer.parseInt(tempVar12);
	}
	}
	for (i = 0;i < m;i++)
	{
	System.out.printf("%d\n",sz[i]);
	}

		return 0;
	}

}

