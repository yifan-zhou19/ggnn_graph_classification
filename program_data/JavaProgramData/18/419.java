//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum:
public enum AnonymousEnum
{
	size(100);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum forValue(int value)
	{
		return getMappings().get(value);
	}
}

package <missing>;

public class GlobalMembers
{
	public static void gotozero(int num, int n, int[][][] a, int[][] minrow, int[][] mincol)
	{
		int i;
		int j;
		int k;

		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
				minrow[i][j] = a[i][j][0];
				for (k = 0;k < n;k++)
				{
					if (minrow[i][j] > a[i][j][k])
					{
						minrow[i][j] = a[i][j][k];
					}
				}
			}
		}

		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[i][j][k] -= minrow[i][j];
				}
			}
		}

		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
				mincol[i][j] = a[i][0][j];
				for (k = 0;k < n;k++)
				{
					if (mincol[i][j] > a[i][k][j])
					{
						mincol[i][j] = a[i][k][j];
					}
				}
			}
		}

		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[i][k][j] -= mincol[i][j];
				}
			}
		}
	}

	public static void cut(int num, int n, int[][][] a, int[][] minrow, int[][] mincol)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 2;k < n;k++)
				{
					a[i][j][k - 1] = a[i][j][k];
				}
			}
		}

		for (i = 0;i < num;i++)
		{
			for (k = 0;k < n;k++)
			{
				for (j = 2;j < n;j++)
				{
					a[i][j - 1][k] = a[i][j][k];
				}
			}
		}
	}

	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int num;
		int[][][] a = new int[AnonymousEnum.size.getValue()][AnonymousEnum.size.getValue()][AnonymousEnum.size.getValue()];
		int[][] minrow = new int[AnonymousEnum.size.getValue()][AnonymousEnum.size.getValue()];
		int[] sum = new int[AnonymousEnum.size.getValue()];
		int[][] mincol = new int[AnonymousEnum.size.getValue()][AnonymousEnum.size.getValue()];

		//&para;&Aacute;&Egrave;&euml;&Ecirc;&yacute;&frac34;&Yacute;	
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
		}

		while (n > 1)
		{
			gotozero(num, n, a, minrow, mincol);
			for (i = 0;i < num;i++)
			{
				sum[i] += a[i][1][1]; //&acute;&aelig;&acute;&cent;
			}
			cut(num, n, a, minrow, mincol);
			n--;
		}

		for (i = 0;i < num;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
	}
}

