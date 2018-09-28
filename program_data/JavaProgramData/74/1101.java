package <missing>;

public class GlobalMembers
{
	public static int check1(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i <= (int)Math.abs(Math.sqrt(n));i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		return (flag);
	}
	public static int check2(int n)
	{
		int[] a = new int[10];
		int i;
		int l = 0;
		int flag = 1;
		while (n > 0)
		{
			l++;
			a[l] = n % 10;
			n = n / 10;
		}
		for (i = 1;i <= l / 2;i++)
		{
			if (a[i] != a[l + 1 - i])
			{
				flag = 0;
				break;
			}
		}
		return (flag);
	}
	public static void Main()
	{
		int flag = 0;
		int i;
		int m;
		int n;
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
			if (check1(i) != 0 && check2(i) != 0)
			{
				if (flag == 0)
				{
					flag = 1;
					System.out.printf("%d",i);
				}
				else
				{
				  System.out.printf(",%d",i);
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.print("\n");
		}
	}
}

