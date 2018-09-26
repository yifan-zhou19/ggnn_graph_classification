package <missing>;

public class GlobalMembers
{
	public static int num(int m, int n)
	{
		//printf("num(%d,%d)\n",m,n);
		return num1(m, n) + num2(m, n);
	}
	public static int num1(int m, int n)
	{
		//printf("num1(%d,%d)\n",m,n);
		if (m == 1 || m == 0 || m < n)
		{
			return 0;
		}
		else
		{
		if (n == 1)
		{
			return 1;
		}
		else
		{
		return num(m, n - 1);
		}
		}
	}
	public static int num2(int m, int n)
	{
		//printf("num2(%d,%d)\n",m,n);
		if (n == 1)
		{
			return 0;
		}
		else
		{
		if (m == 0 || m == 1)
		{
			return 1;
		}
		else
		{
		if (m >= n)
		{
			return num(m - n, n);
		}
		else
		{
			return num(m, m);
		}
		}
		}
	}
	public static void Main()
	{
		int t;
		int n;
		int m;
		int i;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int j = num(m, n);
			System.out.printf("%d\n",j);
		}
	}

}

