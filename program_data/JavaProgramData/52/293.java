package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int m;
	int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
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


	for (p = a + m + n;p >= a + m;p--)
	{
	*p = (p - m);
	}

	for (p = a + m - 1;p >= a;p--)
	{
	*p = (p + n);
	}

	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	}
}

