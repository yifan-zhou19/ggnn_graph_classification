package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] a = new int[100];
	int[] p = a;
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
		p++ = Integer.parseInt(tempVar2);
	}
	}
	p--;
	for (i = 0;i < n;i++,p--)
	{
	if (i == 0)
	{
	System.out.printf("%d",p[0]);
	}
	else
	{
	System.out.printf(" %d",p[0]);
	}
	}
	return 0;
	}


}

