package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int i;
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * point;
		//for(i=n-m;i<n;i++)
		//{
		  //  printf("%d",a[i]);
		//}
		//for(i=0;i<n-m-1;i++)
		//{
		//	printf("%d",a[i]);
		//}
		//printf("%d\n",a[n-m-1]);
		for (point = a[n - m];point < a + n;point++)
		{
			System.out.printf("%d ",*point);
		}
		for (point = a;point < a + n - m - 1;point++)
		{
			System.out.printf("%d ",*point);
		}
		System.out.printf("%d\n",a[n - m - 1]);
		return 0;
	}

}

