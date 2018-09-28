package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rev = int;
		int prime = int;
		int m;
		int n;
		int i;
		int first = 1;
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
		for (i = m;i < n + 1;i++)
		{
			if (rev(i) != 0 && prime(i) != 0)
			{
				if (first == 0)
				{
					System.out.print(",");
				}
				System.out.printf("%ld",i);
				if (first != 0)
				{
					first = 0;
				}
			}
		}
		if (first != 0)
		{
			System.out.print("no");
		}
		return 0;
	}

	public static int rev(int n)
	{
		int[] a = new int[10];
		int i = 0;
		int j;
		int flag = 1;
		while (n > 0)
		{
			a[i++] = n % 10;
			n = n / 10;
		}
	//	for (j=0;j<i;j++) printf("%d",a[j]);
		for (j = 0;j < i;j++)
		{
			if (a[j] != a[i - j - 1])
			{
				flag = 0;
				break;
			}
		}
	//	printf("%d\n",flag);
		if (flag != 0)
		{
			return 1;
		}
		return 0;
	}

	public static int prime(int n)
	{
		int x;
		int h = Math.sqrt(n);
		int flag = 1;
	//	printf("%ld",h);
		for (x = 2;x <= h;x++)
		{
	//	printf("%ld",x);

			if (n % x == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			return 1;
		}
		return 0;
	}
}

