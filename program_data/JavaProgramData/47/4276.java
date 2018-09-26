package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1 = null;
		int temp;
		int n;
		int s;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;p < n + a;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		p1 = a + n - 1;
		s = n / 2;
		for (i = 0;i < s;i++)
		{
			temp = p;
			*p = p1;
			*p1 = temp;
			p++;
			p1--;
		}
		p = a;
		for (;p < n + a - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
	}

}

