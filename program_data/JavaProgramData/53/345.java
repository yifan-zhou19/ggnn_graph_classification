package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int i;
	int j;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
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
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < i;j++)
	{
	if (a[i] == a[j])
	{
	a[i] = 0;
	}
	}
	}
	p = a;
	System.out.printf("%d", p);
	for (i = 1;i < n;i++)
	{
	if (*(p + i) != 0)
	{
	System.out.printf(",%d",*(p + i));
	}
	}



	}
}

