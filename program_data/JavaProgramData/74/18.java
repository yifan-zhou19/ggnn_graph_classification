package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int;
		int huiwen = int;
		int i;
		int m;
		int n;
		int s = 0;
		int[] a = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
			a[s] = i;
			s = s + 1;
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < s - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[s - 1]);
		}
	}

	public static int sushu(int m)
	{
		int i;
		int k;
		k = Math.sqrt(m);
		for (i = 2;i <= k;i++)
		{
			if (m % i == 0)
			{
				break;
			}

		}
		if (i > k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int huiwen(int m)
	{
		int i;
		int n;
		int f;
		int v = 0;
		n = m;
		for (i = 0;n != 0;i++)
		{
			f = n % 10;
			v = v * 10 + f;
			n = n / 10;
		}
		if (v == m)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}


}

