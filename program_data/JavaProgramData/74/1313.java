package <missing>;

public class GlobalMembers
{
	public static int s(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
			return 1;
	}
	public static int h(int n)
	{
		int a = 0;
		int k = n;
		while (n != 0)
		{
			a = a * 10 + n % 10;
			n = n / 10;
		}
		if (a == k)
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
		int i;
		int[] j = new int[100];
		int k = 0;
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
			if (s(i) == 1 && h(i) == 1)
			{
				j[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
			 System.out.printf("%d,",j[i]);
			}
		   System.out.printf("%d",j[k - 1]);
		}

	}

}

