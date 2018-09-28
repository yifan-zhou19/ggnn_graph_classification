package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int flag = 0;
	if (x == 1)
	{
	return (1);
	}
	else if (x == 2 || x == 3)
	{
			return (0);
	}
		else
		{
			for (int i = 2;i < x;i++)
			{
				if (x % i == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				return (0);
			}
			else
			{
				return (1);
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int num = 0;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n;i <= m;i++)
		{
			int[] a = new int[10];
			int count = 0;
			int flag = 0;
			int l;
		l = i;
		while (l > 0)
		{
		   a[count++] = l % 10;
		   l = l / 10;
		}
		for (j = 0;j < count;j++)
		{
			if (a[j] != a[count - j - 1])
			{
				flag = 1;
				break;
			}

		}
		if (flag == 0 && prime(i) == 0)
		{
			b[num++] = i;
		}
		}
		if (num == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < num;i++)
			{
				if (i == num - 1)
				{
					System.out.print(b[i]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(b[i]);
					System.out.print(",");
				}
			}
		}
		return 0;
	}
}

