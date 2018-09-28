package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa[5];
		int[] pa = new int[5];
		int fun = int * pa[];
		for (i = 0;i < 5;i++)
		{
			pa[i] = a[i];
			for (p = a[i];p < a[i] + 5;p++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p = Integer.parseInt(tempVar);
				}
			}
		}
		y = fun(pa);
		if (y == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (p = pa[i];p < pa[i] + 5;p++)
				{
					System.out.printf("%d%c",*p,(p - pa[i] == 4)?'\n':' ');
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static int fun(int[][] pa)
	{
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *i;
		int i;
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
		if (n > 4 || m > 4)
		{
			return 0;
		}
		else
		{
			i = pa[n];
			pa[n] = pa[m];
			pa[m] = i;
			return 1;
		}
	}
}

