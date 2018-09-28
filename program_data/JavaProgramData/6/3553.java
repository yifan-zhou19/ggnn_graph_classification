package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pi;
		int i = 0;
		int j = 0;
		int k = 1;
		int sum = 0;
		int n;
		int m;
		int z;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}

	for (t = 0;t < k;t++)
	{
		sum = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)malloc((n *m)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int p = (int)malloc((n * m) * (Integer.SIZE / Byte.SIZE));
	pi = p;
	for (z = 0;z < m * n;z++,pi++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		pi = Integer.parseInt(tempVar4);
	}
	}
	pi = p;

	for (j = 0;j < m * n;pi++)
	{
		j++;
	if (j < n + 1 || j>((m - 1) * n) || j % n == 1 || j % n == 0)
	{
	sum = sum + *pi;
	}
	}
	System.out.printf("%d\n",sum);

	}

	}
}

