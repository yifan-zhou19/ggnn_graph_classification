package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[1000001];
	public static int i;
	public static int j;
	public static int flag;
	public static int check(int i)
	{
		int[] s = new int[100];
		int m;
		int flag;
		int t;
		m = i;
		t = 0;
		while (m > 0)
		{
			t++;
			s[t] = m % 10;
			m = m / 10;
		}
		flag = 0;
		for (m = 1;m <= t / 2;m++)
		{
			if (s[m] != s[t - m + 1])
			{
			flag = 1;
			return (0);
			break;
			}
		}
		if (flag == 0)
		{
			return (1);
		}
	}
	public static int Main()
	{
		for (i = 1;i <= 1000000;i++)
		{
			a[i] = 1;
		}
		a[1] = 0;
		for (i = 2;i <= 1000000;i++)
		{
			if (a[i] == 1)
			{
			for (j = 2;j <= 1000000 / i;j++)
			{
				a[i * j] = 0;
			}
			}
		}
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
		flag = 0;
		for (i = m;i <= n;i++)
		{
			if ((a[i] != 0) && check(i) != 0)
			{
			if (flag == 0)
			{
				System.out.printf("%ld",i);
			}
			else
			{
				System.out.printf(",%ld",i);
			}
			flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}

}

