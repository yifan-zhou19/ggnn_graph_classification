package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int s;
		if (m >= 1)
		{
			if (m >= n != 0 && n != 1)
			{
				s = f(m - n, n) + f(m, n - 1);
			}
			else if (m < n && n != 1)
			{
				s = f(m, n - 1);
			}
		}
		if (m == 0 || n == 1)
		{
			s = 1;
		}
		return s;
	}


	public static void Main()
	{
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int s;
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
			s = f(m[i], n[i]);
			System.out.printf("%d\n",s);
		}
	}

}

