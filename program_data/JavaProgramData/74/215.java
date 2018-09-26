package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int ia;
		int mk;
		mk = 1;
		for (ia = 2;ia <= x / 2;ia++)
		{
			if (x % ia == 0)
			{
				mk = 0;
				break;
			}
		}
		return (mk);
	}
	public static int huiwen(int y)
	{
		int[] a = new int[100];
		int n;
		int m;
		int z;
		int i;
		int b;
		n = 1;
		m = 0;
		i = 1;
		while (n <= y)
		{
			n = 10 * n;
			m++;
		}
		for (i = 1;i <= m;i++)
		{
			b = Math.pow(10,m - i);
			a[i] = y / b;
			y = y % (int)Math.pow(10,m - i);
		}
		z = 1;
		for (i = 1;i <= m;i++)
		{
		if (a[i] != a[m + 1 - i])
		{
			z = 0;
			break;
		}
		}
		return (z);
	}
	public static void Main()
	{
		int ma;
		int na;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ma = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			na = Integer.parseInt(tempVar2);
		}
		t = 0;
		for (j = ma;j <= na;j++)
		{
			if (sushu(j) == 1 && huiwen(j) == 1)
			{
				if (t > 0)
				{
					System.out.print(",");
				}
					System.out.printf("%d",j);
					t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}

}

