package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
		int flag = 0;
		for (i = 2;i <= x - 1;i++)
		{
			if (x % i == 0)
			{
				flag = 1;
			}
		}
		if (flag == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int hw(int x)
	{
		int[] b = new int[10];
		int flag;
		int judge = 0;
		int i;
		b[1] = x % 10;
		b[2] = x / 10 % 10;
		b[3] = x / 100 % 10;
		b[4] = x / 1000 % 10;
		b[5] = x / 10000 % 10;
		b[6] = x / 100000 % 10;
		for (i = 1;i <= 6;i++)
		{
			if (b[i] != 0)
			{
				flag = i;
			}
		}
		for (i = 1;i <= flag;i++)
		{
			if (b[flag + 1 - i] != b[i])
			{
				judge = 1;
			}
		}
		if (judge == 0)
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
		int count = 0;
		int[] a = new int[100];
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
			if (ss(i) == 1 && hw(i) == 1)
			{
				a[count] = i;
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i <= count - 2;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[count - 1]);
		}
	}
}

