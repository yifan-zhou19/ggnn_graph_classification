package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			System.out.printf("%d ",*(p + i - n));
		}
		System.out.printf("%d",*(p - n));
	}





}

