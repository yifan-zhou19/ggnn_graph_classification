package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int[] a = new int[100000];
		int m;
		int chongfu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (p = a;p < a + n;p++)
		{

			if (*p == m)
			{
				chongfu++;
			}

			 else if (*p != m)
			 {
				 *(p - chongfu) = *p;
			 }

		}
		for (p = a;p < a + n - chongfu - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[n - chongfu - 1]);
	}

}

