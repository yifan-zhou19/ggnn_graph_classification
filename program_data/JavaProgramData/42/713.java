package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int m;
		int j;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = a;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p++ = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	p = a;

	for (i = 0;i < n;i++)
	{
		if (*(p + i) == m)
		{
		for (j = i;j < n;j++)
		{
	*(p + j) = *(p + j + 1);
		}
	i = i - 1;
	n = n - 1;
		}
	}
	p = a;

	for (i = 0;i < n - 1;i++,p++)
	{
	System.out.printf("%d ",*p);
	}
	System.out.printf("%d",*p);
	}




}

