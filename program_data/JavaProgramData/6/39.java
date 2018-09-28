package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * sum;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sum = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		q = sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++,sum++)
		{
			*sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
			int p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (int)calloc(1000,100 * (Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			p1 = p;
			for (i = 0;i < m * n;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p++ = Integer.parseInt(tempVar4);
				}
			}
			for (i = 0,p = p1;i < m * n;i++,p++)
			{
				if (i < n || i % n == 0 || (i + 1) % n == 0 || (i < n * m && i>(n * (m - 1) - 1)))
				{
					*sum = sum + *p;
				}
			}
		}
		for (i = 0,sum = q;i < k - 1;i++)
		{
			System.out.printf("%d\n",*sum++);
		}
		System.out.printf("%d",*sum);
	}
}

