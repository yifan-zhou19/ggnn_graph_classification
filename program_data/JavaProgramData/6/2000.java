package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int n;
		int sum;
		int[] a = new int[10001];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i-- != 0)
		{
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
			for (p = a;p < a + m * n;p++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p = Integer.parseInt(tempVar4);
				}
			}
			sum = 0;
			for (p = a;p < a + n;p++)
			{
				sum += *p;
			}
			if (m != 1)
			{
				for (p = a + (m - 1) * n;p < a + m * n;p++)
				{
					sum += *p;
				}
			}
			for (p = a + n;p < a + (m - 1) * n;p += n)
			{
				sum += *p;
			}
			for (p = a + n * 2 - 1;p < a + m * n - 1;p += n)
			{
				sum += *p;
			}
			System.out.printf("%d\n",sum);
		}
	}
}

