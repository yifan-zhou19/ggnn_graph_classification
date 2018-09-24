package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * e = p + (n - 1);
		for (i = 0;i < n;i++,p++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p = Integer.parseInt(tempVar2);
			 }
		}
		for (i = 0;i < n - 1;i++,e = e-1)
		{
			System.out.printf("%d ",*e);
		}
		System.out.printf("%d",*e);
	}
}

