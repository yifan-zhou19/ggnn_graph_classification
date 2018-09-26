package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	int m;
	int n;
	int i;
	int[] a = new int[200];
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
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	p = a;
	for (p = a + n + m - 1;p >= a;p--)
	{
		*p = (p - m);
	}
	for (p = a;p < a + m;p++)
	{
		*p = (p + n);
	}
	for (p = a;p < a + n - 1;p++)
	{
		System.out.printf("%d ",*p);
	}
	System.out.printf("%d",*p);
	}
}

