package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* putin()
	public static int putin()
	{
		int a;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)malloc((a+b+2)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int p = (int)malloc((a + b + 2) * (Integer.SIZE / Byte.SIZE));
		p = a;
		*(p + 1) = b;
		for (n = 2;n <= a + b + 1;n++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(p + n) = Integer.parseInt(tempVar3);
		}
		}
		return p;
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* compare(int* a)
	public static int compare(tangible.RefObject<Integer> a)
	{
		int n;
		int m;
		int p;
		for (n = 2;n <= a.argValue;n++)
		{
			for (m = n + 1;m <= a.argValue+1;m++)
			{
				if ((*(a.argValue + n)) > (*(a.argValue + m)))
				{
					p = (a.argValue + n);
					*(a.argValue + n) = *(a.argValue + m);
					*(a.argValue + m) = p;
				}
			}
		}
		for (n = a.argValue+2;n <= a.argValue + (*(a.argValue+1));n++)
		{
			for (m = n + 1;m <= a.argValue + (*(a.argValue+1)) + 1;m++)
			{
				if ((*(a.argValue + n)) > (*(a.argValue + m)))
				{
					p = (a.argValue + n);
					*(a.argValue + n) = *(a.argValue + m);
					*(a.argValue + m) = p;
				}
			}
		}
		return a.argValue;
	}
	public static void putout(int[] a)
	{
		int x;
		for (x = 2;x <= (*a) + (*(a + 1));x++)
		{
		System.out.printf("%d ",a[x]);
		}
		System.out.printf("%d",a[(*a) + (*(a + 1)) + 1]);
	}
	public static int Main()
	{
		putout(compare(putin()));
	}

}

