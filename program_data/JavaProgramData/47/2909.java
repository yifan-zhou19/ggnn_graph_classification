package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int[] a = new int[100];
		int n;
		int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (p = a;p < n + a;p++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p = Integer.parseInt(tempVar2);
	}
	}
	p = a;
	for (i = 0;i < n - 1;i++)
	{
		t = a[n - 1];
	for (p = a + n - 1;p >= a + i + 1;p--)
	{
		*p = (p - 1);
	}
	a[i] = t;
	}
	System.out.printf("%d",a[0]);
	for (p = a + 1;p < (a + n);p++)
	{
	System.out.printf(" %d",*p);
	}
	}
}

