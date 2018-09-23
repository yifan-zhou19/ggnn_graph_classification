package <missing>;

public class GlobalMembers
{
	public static int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *h;
	public static int h;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
	public static int m;
	public static int max = 0;

	public static void calc(int num)
	{
	int i;
	*(m + num) = 1;
	for (i = num + 1;i <= n - 1;i++)
	{
	if (*(h + i) <= *(h + num))
	{
	if (*(m + i) + 1 > *(m + num))
	{
	*(m + num) = *(m + i) + 1;
	}
	}
	}
	if (*(m + num) > max)
	{
	max = (m + num);
	}
	}

	public static int Main()
	{
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	h = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	m = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		h + i = Integer.parseInt(tempVar2);
	}
	}
	*(m + n - 1) = 1;
	for (i = n - 2;i >= 0;i--)
	{
	calc(i);
	}
	System.out.printf("%d",max);
	}
}

