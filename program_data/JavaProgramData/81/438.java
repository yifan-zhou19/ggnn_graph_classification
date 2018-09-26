package <missing>;

public class GlobalMembers
{
	public static int hanshu(int[][] a, int m, int n, tangible.RefObject<Integer> a_p)
	{
		int i;
		int y;
		a_p.argValue = a[0][0];
		if (m < 5 && m >= 0 && n < 5 && n >= 0)
		{
			int[] z = new int[5];
			for (i = 0;i < 5;i++)
			{
				z[i] = (a_p.argValue+5 * m + i);
				*(a_p.argValue+5 * m + i) = *(a_p.argValue+5 * n + i);
				*(a_p.argValue+5 * n + i) = z[i];
			}
			y = 1;
		}
		else
		{
			y = 0;
		}
		return (y);
	}
	public static int Main()
	{
		int hanshu = new int(int a[5][5],int m,int n,int * a_p);
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a_p;
		int a_p;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		a_p = a[0][0];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	tangible.RefObject<Integer> tempRef_a_p = new tangible.RefObject<Integer>(a_p);
		y = hanshu(a, m, n, tempRef_a_p);
		a_p = tempRef_a_p.argValue;
		if (y == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j == 4)
					{
						System.out.print("\n");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}

}

