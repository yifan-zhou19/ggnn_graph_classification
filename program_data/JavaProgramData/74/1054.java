package <missing>;

public class GlobalMembers
{
	public static int turn(int m)
	{
		int n;
		int k;
		n = m;
		int i = 0;
		int[] a = new int[100];
		while (n != 0)
		{
			a[i] = n % 10;
			i++;
			n /= 10;
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			n *= 10;
			n += a[i];
		}
		if (n == m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}




	public static int check(int m)
	{
		int i;
		int test1 = 1;
		int test = 0;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				test1 = 0;
			}
		}
		if (test1 != 0)
		{
			test += 1;
		}
		if (turn(m) != 0)
		{
			test += 1;
		}
		if (test == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int t = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (check(i) != 0 && t == 0)
			{
				System.out.printf("%d",i);
				t = 1;
			}
			else if (check(i))
			{
				System.out.printf(",%d",i);
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}

}

