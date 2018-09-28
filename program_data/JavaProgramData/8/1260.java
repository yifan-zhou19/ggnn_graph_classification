package <missing>;

public class GlobalMembers
{
		public static int N1;
		public static int N2;
		public static int N3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=(int *)malloc(100 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		public static int p1 = (int *)malloc(100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=(int *)malloc(100 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		public static int p2 = (int *)malloc(100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3=(int *)malloc(100 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		public static int p3 = (int *)malloc(100 * (Integer.SIZE / Byte.SIZE));

	public static void inputnumbers()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			N2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1 = Integer.parseInt(tempVar3);
		}
		for (int i = 1;i <= N1 - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1 + i = Integer.parseInt(tempVar4);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			p2 = Integer.parseInt(tempVar5);
		}
		for (int i = 1;i <= N2 - 1;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p2 + i = Integer.parseInt(tempVar6);
			}
		}
	}

	public static void seperatesort()
	{
		for (int i = 1;i <= N1 - 1;i++)
		{
			for (int j = i + 1;j <= N1;j++)
			{
				if (*(p1 + i - 1) > *(p1 + j - 1))
				{
				int temp = (p1 + i - 1);
				*(p1 + i - 1) = *(p1 + j - 1);
				*(p1 + j - 1) = temp;
				}
			}
		}
		for (int i = 1;i <= N2 - 1;i++)
		{
			for (int j = i + 1;j <= N2;j++)
			{
				if (*(p2 + i - 1) > *(p2 + j - 1))
				{
				int temp = (p2 + i - 1);
				*(p2 + i - 1) = *(p2 + j - 1);
				*(p2 + j - 1) = temp;
				}
			}
		}
	}

	public static void combine()
	{
		N3 = N1 + N2;
		for (int i = 0;i <= N1 - 1;i++)
		{
			*(p3 + i) = *(p1 + i);
		}
		for (int i = 0;i <= N2 - 1;i++)
		{
			*(p3 + N1 + i) = *(p2 + i);
		}
	}

	public static void printresult2()
	{
		System.out.printf("%d", p3);
		for (int i = 1;i <= N3 - 1;i++)
		{
			System.out.printf(" %d",*(p3 + i));
		}
	}
	public static void printresult1()
	{
		System.out.printf("%d", p1);
		for (int i = 1;i <= N1 - 1;i++)
		{
			System.out.printf(" %d",*(p1 + i));
		}
		for (int i = 0;i <= N2 - 1;i++)
		{
			System.out.printf(" %d",*(p2 + i));
		}
	}

	public static int Main()
	{
		inputnumbers();
		seperatesort();
		combine();
		printresult2();
	}
}

