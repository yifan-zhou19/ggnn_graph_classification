package <missing>;

public class GlobalMembers
{
	public static int su(int num)
	{
		int i;
		for (i = 2;i < num;i++)
		{
			if (num % i == 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static int hui(int num)
	{
		int a;
		int b = 0;
		a = num;
		while (num != 0)
		{
			b = b * 10 + num % 10;
			num /= 10;
		}
		if (a == b)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int flag = 0;
		int i;
		int[] a = new int[20];
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
			if (su(i) == 1 && hui(i) == 1)
			{
				flag = 1;
				a[k++] = i;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[i]);
		}
	}


}

