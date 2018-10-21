package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int flag;
	flag = 0;
	int[] a = new int[10000];
	int[] b = new int[10000];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	if (a[i] % 2 == 1)
	{
	b[a[i]] = 1;
	}
	}
	for (i = 1;i < 10000;i++)
	{
	if (b[i] != 0)
	{
	 if (flag != 0)
	 {
	System.out.printf(",%d",i);
	 }
	else
	{
	System.out.printf("%d",i);
	flag = 1;
	}
	}
	}
	}

}

