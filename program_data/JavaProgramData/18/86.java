package <missing>;

public class GlobalMembers
{
	/*-----------------------------------------*
	|? ? ?   ??????????   	        |
	|? ?      ????	                    |
	|? ? ? ??2010 ? 12 ? 01 ?		    |
	|? ?      ?1000012758		            |
	\*-----------------------------------------*/ 
	public static int[][][] a = new int[100][100][100]; //n?n*n???
	public static int Sum(int n, int[][] t)
	{
		int sum = 0;
		int min = 0;
		int i;
		int j;
		int tempi;
		int tempj;
		//??
		for (i = 0; i < n; i++)
		{
			min = t[i][0];
			for (j = 0; j < n; j++)
			{
				if (t[i][j] < min)
				{
					min = t[i][j]; //????
				}
			}
			for (j = 0; j < n; j++)
			{
				t[i][j] -= min; //????????
			}
		}
		//??
		for (j = 0; j < n; j++)
		{
			min = t[0][j];
			for (i = 0; i < n; i++)
			{
				if (t[i][j] < min)
				{
					min = t[i][j]; //???
				}
			}
			for (i = 0; i < n; i++)
			{
				t[i][j] -= min; //???????
			}
		}
		sum = t[1][1];
		if (n == 2) //??2*2?????
		{
			return sum;
		}
		//????????????
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				if (j == 0)
				{
					tempj = j;
				}
				else
				{
					tempj = j + 1;
				}
				if (i == 0)
				{
					tempi = i;
				}
				else
				{
					tempi = i + 1;
				}
				t[i][j] = t[tempi][tempj];
			}
		}
			//???
		return sum += Sum(n - 1, t);
	}
	public static int Main()
	{
		int n;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //??n???
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = Sum(n, a[i]); //??
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

