package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         ????
	*/

	public static int i;
	public static int fenjie(int x, int t)
	{
		int j;
		if (x == 1 || x == 2)
		{
			return 1;
		}
		int s = 1;
		for (j = t; j <= Math.sqrt(x); j++)
		{
			if (x % j == 0)
			{
				s += fenjie((x / j), j);
			}
		}
		return s;
	}

	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int x;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = fenjie(x, 2);
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

