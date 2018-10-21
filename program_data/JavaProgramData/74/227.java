package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int su = int x;
		int hw = int y;
		int m;
		int n;
		int i;
		int sum = 0;
		int[] b = new int[100];
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
		if (su(i) != 0 && hw(i) != 0)
		{
			b[sum] = i;
			sum++;
		}
		}

		if (sum == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = 0;i < sum - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[sum - 1]);
		}
	}

	public static int su(int x)
	{
		int i;
		int flag = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			flag = x % i;
			if (flag == 0)
			{
				break;
			}
		}
		return (flag);
	}

	public static int hw(int y)
	{
		int[] a = new int[100];
		int i = 0;
		int l;
		int flag;
		int mul = 1;
		while (y > 0)
		{
			a[i] = y % 10;
			y = (y - a[i]) / 10;
			i++;
		}
		l = i;
		for (i = 0;i < l / 2;i++)
		{
			if (a[i] == a[l - i - 1])
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
			mul *= flag;
		}
		return (mul);
	}











}

