package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int convert = new int(int *,int n,int m);
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[5][5];
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
		p = a[0][0];
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		c = convert(tempRef_p, n, m);
		p = tempRef_p.argValue;
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				if (i != 4)
				{
				System.out.printf("%d\n",a[i][4]);
				}
				else
				{
					System.out.printf("%d",a[i][4]);
				}
			}
		}
		return 0;
	}
	public static int convert(tangible.RefObject<Integer> p, int n, int m)
	{
		int t;
		int j;
		if (n > 4 || m > 4 || n < 0 || m < 0)
		{
			return 0;
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				t = (p.argValue+5 * n + j);
				*(p.argValue+5 * n + j) = *(p.argValue+5 * m + j);
				*(p.argValue+5 * m + j) = t;
			}
		  return 1;
		}
	}
}

