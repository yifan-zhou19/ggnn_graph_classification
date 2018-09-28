package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
	int m;
	int i;
	int j;
	int tmp;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	m = (int)malloc((Integer.SIZE / Byte.SIZE) * n);

	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m + i = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0,j = n - 1;i < j;i++,j--)
	{
	tmp = m[i];
	m[i] = m[j];
	m[j] = tmp;
	}
	System.out.printf("%d",m[0]);
	for (i = 1;i < n;i++)
	{
	System.out.printf(" %d",m[i]);
	}
	return 0;
	}

}

