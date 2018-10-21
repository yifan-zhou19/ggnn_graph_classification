package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100;i++)
		{
			a[i] = -1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p1 = a + n - k;
		for (p = p1; * p != -1;p++)
		{
			System.out.printf("%d ",*p);
		}
		for (p = a;p != p1;p++)
		{
			System.out.printf("%d",*p);
			if ((p + 1) != p1)
			{
				System.out.print(" ");
			}
		}
	}
}

