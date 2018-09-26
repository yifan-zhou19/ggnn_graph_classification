package <missing>;

public class GlobalMembers
{
	public static int f(int n, int m, tangible.RefObject<Integer> point)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			int i;
			int b;
			for (i = 0;i < 5;i++)
			{
				b = (point.argValue + i + n * 5);
				*(point.argValue + i + n * 5) = *(point.argValue + i + m * 5);
				*(point.argValue + i + m * 5) = b;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] point = a[0];
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
	tangible.RefObject<Integer> tempRef_point = new tangible.RefObject<Integer>(point);
		if (f(n, m, tempRef_point) == 0)
		{
			point = tempRef_point.argValue;
			System.out.print("error");
		}
		else
		{
			point = tempRef_point.argValue;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][4]);
		}
		}
	}
}

