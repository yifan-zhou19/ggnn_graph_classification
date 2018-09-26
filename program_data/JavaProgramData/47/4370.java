package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (p = a;p <= a + n - 1;p++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p = Integer.parseInt(tempVar2);
	}
	}
	for (p = a,t = b + n - 1;p <= a + n - 1;p++,t--)
	{
	*t = p;
	}
	for (t = b;t < b + n - 1;t++)
	{
	System.out.printf("%d ",*t);
	}
	System.out.printf("%d",*t);

	}
}

