package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: void *malloc(unsigned int size);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//Object malloc(uint size);
	public static void Main()
	{
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(200 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + (i++) = tempVar3;
			}
		}
		p = a + n,i = 0;
		while (i < n - m)
		{
			*(p + i++) = *(a + i);
		}
		p = a + n - m;
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",*(p + i));
		}
	}
}

