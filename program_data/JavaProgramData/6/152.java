package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int bysum = int z;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m,*n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		for (n = m;n < m + k;n++)
		{
			System.out.printf("%d\n",bysum(*n));
		}
	}
	public static int bysum(int z)
	{
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(m * n * (Integer.SIZE / Byte.SIZE));
		for (b = a;b < a + m * n;b++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		}
		for (b = a;b < a + n;b++)
		{
			sum = sum + *b;
		}
		for (b = a + (m - 1) * n;b < a + m * n;b++)
		{
			sum = sum + *b;
		}
		for (b = a + n;b < a + (m - 2) * n + 1;b = b + n)
		{
			sum = sum + *b;
		}
		for (b = a + n * 2 - 1;b < a + (m - 2) * n + n;b = b + n)
		{
			sum = sum + *b;
		}
		return (sum);
	}
}

