package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int;
		int sushu = int;
		int n;
		int m;
		int i;
		int k = 0;
		int[] a = new int[300];
		int flag = 0;
		int temp = 0;
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
			flag = huiwen(i);
			if (flag == 1)
			{
				flag = sushu(i);
				if (flag == 1)
				{
				   a[k] = i;
				   k = k + 1;
				   temp = 1;
				}
			}
		}
		if (temp == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
	}
	public static int huiwen(int a)
	{
		int temp = 0;
		int x = 0;
		int b;
		int i;
		int t;
		if (a / 10 == 0)
		{
			temp = 1;
		}
		else
		{
			t = a;
			for (i = 0;a != 0;i++)
			{
				b = a % 10;
				x = 10 * x + b;
				a = a / 10;
			}
			if (x == t)
			{
				temp = 1;
			}
		}
		return (temp);
	}
	public static int sushu(int a)
	{
		int i;
		int temp = 1;
		for (i = 2;i < a / 2;i++)
		{
			if (a % i == 0)
			{
				temp = 0;
				break;
			}

		}
		return (temp);
	}
}

