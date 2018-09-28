package <missing>;

public class GlobalMembers
{
	public static int[][] b = new int[2][10];
	public static int[] e = new int[20];
	public static int c = 0;
	public static int d = 0;
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static scanning()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static scanning_array(int y,int x)
	{
		int i;
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[y][i] = Integer.parseInt(tempVar);
			}
		}
	}

	public static void arrange(int m, int[] a)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static combine(int[] x, int[] y)
	{
		int i;
		for (i = 0;i < c;i++)
		{
			e[i] = b[1][i];
		}
		for (i = c;i < c + d;i++)
		{
			e[i] = b[2][i - c];
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static print()
	{
		int i;
		for (i = 0;i < c + d;i++)
		{
			System.out.printf("%d",e[i]);
			if (i != c + d - 1)
			{
			System.out.print(" ");
			}
		}
	}

	public static void Main()
	{
		scanning();
		scanning_array(1, c);
		scanning_array(2, d);
		arrange(c, b[1]);
		arrange(d, b[2]);
		combine(b[1], b[2]);
		print();
	}






}

