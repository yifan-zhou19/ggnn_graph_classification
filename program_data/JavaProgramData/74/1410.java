package <missing>;

public class GlobalMembers
{
	public static int num(int x)
	{
		int i;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int averse(int x)
	{
		int i;
		int j;
		int[] a = new int[100];
		for (i = 0,j = 10;;i++)
		{
			a[i] = x % 10;
			x = x / 10;
			if (x == 0)
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] != a[i - j])
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int x;
		int m;
		int n;
		int enter = 1;
		int mark = 0;
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
		for (x = m;x <= n;x++)
		{
			if (num(x) == 1 && averse(x) == 1)
			{
				mark = 1;
				if (enter == 1)
				{
					enter = 0;
					System.out.printf("%d",x);
				}
				else
				{
					System.out.printf(",%d",x);
				}
			}
		}
		if (mark == 0)
		{
			System.out.print("no");
		}
	}
}

