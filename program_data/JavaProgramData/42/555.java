package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int k;
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (p = a,i = 0;i <= n - 1;i++)
		{
			if (a[i] != k)
			{
				*p = a[i];
				p++;
			}
			else
			{
				count++;
			}
		}
		for (p = a;p <= (a + n - 1 - count);p++)
		{
			if (p == a)
			{
				System.out.printf("%d",*p);
			}
			else
			{
				System.out.printf(" %d",*p);
			}
		}
	}
}

