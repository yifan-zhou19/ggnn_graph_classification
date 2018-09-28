package <missing>;

public class GlobalMembers
{
	public static void tz(int[] a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = a + n - m + 1;p <= a + n;p++)
		{
			System.out.printf("%d ",*p);
		}
		for (p = a + 1;p < a + n - m;p++)
		{
			System.out.printf("%d ",*p);
		}
			 System.out.printf("%d\n",*p);
	}
	public static void Main()
	{
		int[] a = new int[20];
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		tz(a, n, m);
	}

}

