package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2,*p3,*p4;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
		int p3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p4;
		int p4;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p1 = a[0];
		p4 = p2 = a[n - m];
		p3 = a[n - 1];
		System.out.printf("%d", p2);
		p2++;
		for (;p2 <= p3;p2++)
		{
			System.out.printf(" %d", p2);
		}
		for (;p1 < p4;p1++)
		{
			System.out.printf(" %d", p1);
		}
		 return 0;
	}
}

