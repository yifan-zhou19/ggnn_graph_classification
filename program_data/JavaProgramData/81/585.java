package <missing>;

public class GlobalMembers
{
	public static int jz(tangible.RefObject<Integer> p, int n, int m)
	{
		int q;
		int i;
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				q = (p.argValue + n * 5 + i);
				*(p.argValue + n * 5 + i) = *(p.argValue + m * 5 + i);
				*(p.argValue + m * 5 + i) = q;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int x;
		int y;
		int r;
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		r = jz(tempRef_a, x, y);
		a = tempRef_a.argValue;
		if (r == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
		return 0;
	}





}

