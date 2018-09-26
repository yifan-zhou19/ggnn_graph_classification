package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		sort(n, tempRef_p);
		p = tempRef_p.argValue;
		for (;p < num + n - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		   System.out.printf("%d",*p);
	}
	public static void sort(int m, tangible.RefObject<Integer> p1)
	{
		int i;
		int t;
	  for (i = 0;i < m / 2;i++)
	  {
			 t = (p1.argValue + i);
		  *(p1.argValue + i) = *(p1.argValue + m - 1 - i);
		  *(p1.argValue + m - 1 - i) = t;
	  }
	}
}

