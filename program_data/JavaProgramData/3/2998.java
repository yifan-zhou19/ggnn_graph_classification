package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int[] a = new int[1000];
	int i;
	int j;
	int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * pt;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (p = a;p < n + a;p++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p = Integer.parseInt(tempVar3);
	}
	}
	for (p = a;p < n - 1 + a;p++)
	{
		for (pt = p + 1;pt < n + a;pt++)
		{
	if ((*p) + (*pt) == k)
	{
	t = 1;
	}
		}
	}
	if (t == 1)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}


}

