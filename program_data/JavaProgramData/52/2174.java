package <missing>;

public class GlobalMembers
{
	public static void Move(int[] num, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = num + n - 1;p >= num;p--)
		{
			*(p + 1) = *p;
		}
		num[0] = num[n];
	}

	public static int Main()
	{
		int m;
		int n;
		int[] num = new int[101];
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
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   num + i = tempVar3;
		   }
		}
		for (i = 0;i < m;i++)
		{
		   Move(num, n);
		}
		for (i = 0;i < n - 1;i++)
		{
		   System.out.printf("%d ",num[i]);
		}
		System.out.printf("%d",num[i]);
		return 1;
	}


}

