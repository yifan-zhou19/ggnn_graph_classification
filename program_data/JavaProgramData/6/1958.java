package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int m;
		int n;
		int k;
		int i;
		int j;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			p = a;
			if (m * n > 1)
			{
			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p = Integer.parseInt(tempVar4);
				}
				p++;
			}
			for (p = a;p < a + n;p++)
			{
				sum = sum + (*p);
			}
			for (p = a + n;p <= a + (m - 2) * n;p = p + n)
			{
				sum = sum + (*p);
			}
			for (p = a + 2 * n - 1;p <= a + (m - 1) * n - 1;p = p + n)
			{
				sum = sum + (*p);
			}
			for (p = a + (m - 1) * n;p <= a + m * n - 1;p++)
			{
				sum = sum + (*p);
			}
			System.out.printf("%d\n",sum);
			}
			else
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p = Integer.parseInt(tempVar5);
				}
				System.out.printf("%d",*p);
			}
		}

	}
}

