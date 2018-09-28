package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[301];
		int[] a = new int[301];
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p4;
		int p4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1 + i = Integer.parseInt(tempVar2);
			}
		}
		p3 = b;
		for (p1 = a;p1 < a + n;p1++)
		{
			for (p2 = a;p2 < p1;p2++)
			{
				if (*p1 == *p2)
				{
					break;
				}
			}
			if (p1 == p2)
			{
				*p3 = p1;
				p3++;
			}
		}
		for (p4 = b;p4 < p3 - 1;p4++)
		{
			System.out.printf("%d,", p4);
		}
		System.out.printf("%d\n", p4);
	}


}

