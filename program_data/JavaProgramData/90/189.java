package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",f(m[i], n[i]));
		}
	}
	public static int f(int m,int n)
	{
		int result;
		if (m == 0)
		{
			result = 1;
		}
		else
		{
		if (m == 1 || n == 1)
		{
			result = 1;
		}
		if (n > 1 && m > 1 && m >= n)
		{
			result = f(m, n - 1) + f(m - n, n);
		}
		if (n > 1 && m > 1 && m < n)
		{
			result = f(m, n - 1);
		}
		}
		return result;

	}


}

