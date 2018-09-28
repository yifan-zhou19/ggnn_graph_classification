package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num1 = new int(int m,int n);
		int t;
		int m;
		int n;
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
			System.out.printf("%d\n",num1(m, n));
		}
	}
	public static int num1(int m,int n)
	{
		int b;
		int c;
		int z;
		if (m == 1 || n == 1 || m == 0)
		{
			z = 1;
		}
		else
		{
			if (m < n)
			{
				z = num1(m, m);
			}
			else
			{
				b = num1(m, n - 1);
				c = num1(m - n, n);
				z = b + c;
			}
		}
			return (z);
	}
}

