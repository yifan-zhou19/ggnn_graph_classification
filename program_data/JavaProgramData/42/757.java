package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(100000 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) = tempVar2;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (*(a + i) == m)
			{
				for (k = i;k < n - 1;k++)
				{
					j = (a + k);
					*(a + k) = *(a + k + 1);
					*(a + k + 1) = j;
				}
				i--;
				n--;
			}
		}
		if (*(a + 0) != m)
		{
			System.out.printf("%d",*(a + 0));
		}
		for (i = 1;i < n;i++)
		{
			if (*(a + i) != m)
			{
				System.out.printf(" %d",*(a + i));
			}
		}

	}
}

