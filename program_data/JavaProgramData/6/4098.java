package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*b,*c,*d;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * d;
		int i;
		int j;
		int n;
		int m;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (int)calloc(1000000,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		b = (int)calloc(10,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		c = a;
		d = b;
		for (i = 0;i < k;i++)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < n * m;j++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c + j = Integer.parseInt(tempVar4);
			}
			}
			for (j = 0;j < m;j++)
			{
			sum += *(c + j);
			}
			for (j = m * (n - 1);j < n * m;j++)
			{
			sum += *(c + j);
			}
			for (j = m;j < (n - 1) * m;)
			{
				sum += *(c + j);
				j += m;
			}
			for (j = m + m - 1;j < (n - 1) * m;)
			{
				sum += *(c + j);
				j += m;
			}
			*(d++) = sum;
		}
		for (d = b;d < b + k;d++)
		{
			System.out.printf("%d",*d);
			System.out.print("\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
	}
}

