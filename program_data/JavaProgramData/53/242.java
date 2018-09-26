package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *flag;
		int flag;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	flag = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	for (i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		*(flag + i) = 0;
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if (*(p + i) == *(p + j))
			{
				*(flag + j) = 1;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (*(flag + i) == 0)
		{
				if (m == 1)
				{
				System.out.print(',');
				m--;
				}
		System.out.printf("%d",*(p + i));
		m++;
		}
	}
	}
}

