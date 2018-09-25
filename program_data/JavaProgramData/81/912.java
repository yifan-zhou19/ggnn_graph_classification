package <missing>;

public class GlobalMembers
{
	public static int check(int n, int m)
	{
		int q = 0;
		if (n < 5 && m < 5)
		{
			q = 1;
		}
		else
		{
			q = 0;
		}
		return (q);
	}
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int temp;
		temp = a.argValue;
		a.argValue = b.argValue;
		b.argValue = temp;
	}

	public static void Main()
	{
		int[][] o = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x,*y;
		int x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *y;
		int y;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					o[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		c = check(n, m);
		if (c == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			 x = o[n][i];
			 y = o[m][i];
		 tangible.RefObject<Integer> tempRef_x = new tangible.RefObject<Integer>(x);
		 tangible.RefObject<Integer> tempRef_y = new tangible.RefObject<Integer>(y);
			 swap(tempRef_x, tempRef_y);
			 y = tempRef_y.argValue;
			 x = tempRef_x.argValue;
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
					System.out.printf("%d ",o[i][j]);
				}
				else
				{
					System.out.printf("%d",o[i][j]);
				}
			}
			System.out.print("\n");
		}
		}
	}
}

