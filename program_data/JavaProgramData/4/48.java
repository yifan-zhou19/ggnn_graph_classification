package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p0;
		int p0;
		int i;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(m * n,(Integer.SIZE / Byte.SIZE));

		p0 = p;
		for (p = p0;p < p0 + m * n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}

		if (m < n)
		{
			for (p = p0;p < p0 + m;p++)
			{
				for (i = 0;i < p - p0 + 1;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
			for (p = p0 + m;p < p0 + n - 1;p++)
			{
				for (i = 0;i < m;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
			for (p = p0 + n - 1;p < p0 + m * n;p += n)
			{
				for (i = 0;i < m - (p - p0) / n;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
		}

		if (m == n)
		{
			for (p = p0;p < p0 + n - 1;p++)
			{
				for (i = 0;i < p - p0 + 1;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
			for (p = p0 + n - 1;p < p0 + m * n;p += n)
			{
				for (i = 0;i < m + 1 - (p - p0 + 1) / n;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
		}

		if (m > n)
		{
			for (p = p0;p < p0 + n - 1;p++)
			{
				for (i = 0;i < p - p0 + 1;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
			 for (p = p0 + n - 1;p <= p0 + (m - n + 1) * n - 1;p += n)
			 {
				for (i = 0;i < n;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			 }
			for (p = p0 + (m - n + 2) * n - 1;p <= p0 + m * n - 1;p += n)
			{
				for (i = 0;i < m - (p - p0 + 1) / n + 1;i++)
				{
					System.out.printf("%d\n",*(p + i * (n - 1)));
				}
			}
		}
	}

}

