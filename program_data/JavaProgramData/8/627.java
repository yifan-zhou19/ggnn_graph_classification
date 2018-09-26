package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int tem;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		p = a;
		q = b;
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}


		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (*(p + j) > *(p + j + 1))
				{
					tem = (p + j);
					*(p + j) = *(p + j + 1);
					*(p + j + 1) = tem;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (*(q + j) > *(q + j + 1))
				{
					tem = (q + j);
					*(q + j) = *(q + j + 1);
					*(q + j + 1) = tem;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}
}

