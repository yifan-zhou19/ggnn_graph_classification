package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
		int pb;
		int i;
		int j;
		int im = 0;
		int m = 0;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pa = a[0];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pa = Integer.parseInt(tempVar2);
			}
			pa++;
		}
		pa = a[0];
		pb = b[0];
		pb = *pa;
		pb++;
		for (i = 1;i < n;i++)
		{
			pa++;
			im = 0;
			temp = (pa);
			pa = a[0];
			for (j = 0;j < i;j++)
			{
				if (temp == *pa)
				{
					im++;
				}
				pa++;
			}

			if (im == 0)
			{
				pb = temp;
				pb++;
				m++;

			}

		}
		pb = b[0];
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d,", pb);
			pb++;
		}
		System.out.printf("%d", pb);
	}
}

