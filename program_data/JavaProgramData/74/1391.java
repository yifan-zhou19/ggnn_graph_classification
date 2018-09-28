package <missing>;

public class GlobalMembers
{
	public static int funa(int x)
	{
		int j;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				break;
			}
		}
		if (j == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int funb(int y)
	{
		int temp;
		int a;
		int n;
		temp = y;
		n = 0;
		while (temp > 0)
		{
			a = temp % 10;
			n = n * 10 + a;
			temp = temp / 10;
		}
		if (n == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		int[] a = new int[100];
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
			if (funb(i) == 1)
			{
				if (funa(i) == 1)
				{
					a[k] = i;
					k++;
				}
			}
		}
		if (a[0] == 0)
		{
			System.out.print("no\n");
		}
			else
			{
				System.out.printf("%d",a[0]);
				for (i = 1;a[i] != 0;i++)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		return 0;
	}

}

