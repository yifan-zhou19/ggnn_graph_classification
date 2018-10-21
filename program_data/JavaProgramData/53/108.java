package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = a;
	for (;p < a + n;p++)
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
		for (j = i + 1;j < n;j++)
		{
		if (*(p + i) == *(p + j))
		{
		for (k = j + 1;k < n;k++)
		{
	*(p + k - 1) = *(p + k);
		}
	n = n - 1;
	j = j - 1;
		}
		}
	}
	System.out.printf("%d",*p);
	for (i = 1;i < n;i++)
	{
	System.out.printf(",%d",*(p + i));
	}

	return 0;
	}
}

