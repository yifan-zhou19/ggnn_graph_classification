package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int k;
	int c;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n-- != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *shuzu=(int*)malloc(sizeof(int)*m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int shuzu = (int)malloc((Integer.SIZE / Byte.SIZE) * m);
	c = 0;
	for (int i = 0;i < m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	if (c + k < 60)
	{
	if (c + k + 3 < 60)
	{
	c += 3;
	}
	else
	{
	c = 60 - k;
	}
	}
	}
	System.out.printf("%d\n",60 - c);

	}
	return 0;
	}
}

