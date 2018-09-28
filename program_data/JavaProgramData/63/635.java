package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*b,*c,x1,x2,y1,y2,i,j,m,q;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c;
		int c;
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int m;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (int)malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
		for (j = 0;j < y1;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(a + y1 * i + j) = Integer.parseInt(tempVar3);
		}
		}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < x2;i++)
		{
		for (j = 0;j < y2;j++)
		{
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			(b + i * y2 + j) = Integer.parseInt(tempVar6);
		}
		}
		}
		m = x2 <= y1 != 0?x2:y1;
		for (i = 0;i < x1;i++)
		{
		for (j = 0;j < y2;j++)
		{
		for (q = 0;q < m;q++)
		{
			if (q == 0)
			{
				*(c + i * y2 + j) = 0;
			}
			*(c + i * y2 + j) += *(a + y1 * i + q) * *(b + q * y2 + j);
		}
		}
		}
		for (i = 0;i < x1 - 1;i++)
		{
			for (j = 0;j < y2 - 1;j++)
			{
			System.out.printf("%d ", c++);
			}
			System.out.printf("%d\n", c++);
		}
		for (j = 0;j < y2 - 1;j++)
		{
		System.out.printf("%d ", c++);
		}
		System.out.printf("%d", c);
	}
}

