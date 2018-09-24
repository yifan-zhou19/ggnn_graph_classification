package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int*)malloc(sizeof(int)*x1 *y1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int a = (int)malloc((Integer.SIZE / Byte.SIZE) * x1 * y1);
		int i;
		int j;
		int k;
		for (i = 0;i < x1 * y1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=(int*)malloc(sizeof(int)*x2 *y2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int b = (int)malloc((Integer.SIZE / Byte.SIZE) * x2 * y2);
		for (i = 0;i < x2 * y2;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b + i = Integer.parseInt(tempVar6);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c=(int*)malloc(sizeof(int)*x1 *y2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int c = (int)malloc((Integer.SIZE / Byte.SIZE) * x1 * y2);
		for (j = 0;j < x1;j++)
		{
			for (i = 0;i < y2;i++)
			{
				for (k = 0;k < y1;k++)
				{
					*(c + i + j * y2) += *(a + j * y1 + k) * (*(b + k * y2 + i));
				}
			}
		}
		for (j = 0;j < x1;j++)
		{
			System.out.printf("%d",*(c + j * y2));
	if (y2 == 1)
	{
	System.out.print("\n");
	}
			for (i = 1;i < y2;i++)
			{
				System.out.printf(" %d",*(c + i + j * y2));
				if (i == y2 - 1)
				{
					System.out.print("\n");
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(c);
		return 0;
	}

}

