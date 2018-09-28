package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p + i = Integer.parseInt(tempVar3);
	}
	}
	for (i = n - m;i < 2 * n - m;i++)
	{
		System.out.printf("%d",*(p + i % n));
	if (i == 2 * n - m - 1)
	{
	break;
	}
	else
	{
		System.out.print(" ");
	}
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(p);
	}
}

