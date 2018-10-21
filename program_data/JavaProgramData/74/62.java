package <missing>;

public class GlobalMembers
{
	public static int hw(int n)
	{
		int m = 0;
		int i;
		if (n / 10 == 0)
		{
			return 1;
		}
		else
		{
			i = n;
			do
			{
				m = m * 10 + n % 10;
				n = n / 10;
			}while (n != 0);
			if (m == i)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static int ss(int n)
	{
		int i;
		for (i = 2;i <= n;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i == n)
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
		int j = 0;
		int[] a = new int[100];
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
			if (hw(i) != 0 && ss(i) != 0)
			{
				a[j++] = i;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[i]);
		}
	}
}

