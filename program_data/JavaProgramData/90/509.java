package <missing>;

public class GlobalMembers
{
	public static int f1(int m,int n)
	{
		int f = new int(int m,int n);
		if (m == n)
		{
			return 1;
		}
		else if (m < n)
		{
			return 0;
		}
		else if (m == 2 && n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return m / 2;
		}
		else
		{
			return f(m - n, n);
		}
	}
	public static int f2(int m,int n)
	{
		int f = new int(int m,int n);
		if (n == 1)
		{
			return 0;
		}
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			return f(m, n - 1);
		}
	}
	public static int f(int m,int n)
	{
		if (m == 1)
		{
			return 1;
		}
		else if (m == 2)
		{
			return 2;
		}
		else if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return (m / 2 + 1);
		}
		else
		{
			return (f1(m, n) + f2(m, n));
		}
	}
	public static void Main()
	{
		int i;
		int t;
		int[] M = new int[20];
		int[] N = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			N[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",f(M[i], N[i]));
		}
	}



}

