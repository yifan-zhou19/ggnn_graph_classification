package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m;
	int i;
	int k;
	int l;
	int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	int[] a = new int[100000];
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
	p = a;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n - j;i++)
	{
	if (*(p + i) == m)
	{
	j++;
	{
		for (l = i;l < n;l++)
		{
	*(p + l) = *(p + l + 1);
		}
	}

	i--;
	}
	}
	for (i = 0;i < n - j - 1;i++)
	{
		System.out.printf("%d ",*p);
		p++;
	}
	p = a;
	System.out.printf("%d",*(p + n - j - 1));
	}
}

