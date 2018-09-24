package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < (a + n);p++)
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
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				for (p = a,j = i;j < n - 1;j++)
				{
					*(p + j) = *(p + j + 1);
				}
				i = i - 1;
				n--;
			}
		}
		for (p = a;p < (a + n - 1);p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

