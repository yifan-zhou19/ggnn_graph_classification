package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		q = b;
		for (i = 0;i < n;i++)
		{
			if (*(q + i))
			{
				continue;
			}
			m = 0;
			for (j = 0;j < n;j++)
			{
				if (*(q + j))
				{
					continue;
				}
				if (*(p + i) == *(p + j))
				{
					m++;
					if (m > 1)
					{
						*(q + j) = 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(q + i))
			{
				continue;
			}
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",*(p + i));
		}
		System.out.print("\n");
	}
}

