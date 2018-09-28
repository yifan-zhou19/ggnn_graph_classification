package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		q = (int)calloc(10001,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (p = q;p < q + n * m;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		if (m == 1)
		{
			for (p = q;p < q + n * m;p++)
			{
			System.out.printf("%d\n",*p);
			}
		}
		else
		{
		for (i = 0;i < m;i++)
		{
			for (p = q + i;(p <= q + i + (m - 1) * i) && (p < q + n * m);p = p + m - 1)
			{
				System.out.printf("%d\n",*p);
			}
		}
		for (i = 2;i <= n;i++)
		{
			for (p = q + m * i - 1;(p <= q + m * i - 1 + (m - 1) * (m - 1)) && (p < q + n * m);p = p + m - 1)
			{
				System.out.printf("%d\n",*p);
			}
		}
		}
	}
}

