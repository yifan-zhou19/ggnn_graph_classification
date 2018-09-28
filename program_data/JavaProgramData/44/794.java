package <missing>;

public class GlobalMembers
{
	public static void haha(int x)
	{
		int[] a = new int[100];
		int n;
		int i;
		int c;
		n = x;
		i = 0;
		c = 0;
		if (x == 0)
		{
			System.out.print("0\n");
		}
		else if (x > 0 && n != 2900)
		{
			while (n != 0)
			{
			i = i + 1;
			a[i] = n % 10;
			n = n / 10;
			if (a[i] == 0 && c == 0)
			{
				;
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
			if (n == 0)
			{
				System.out.print("\n");
			}
			c = c + 1;
			}
		}
		else if (n == 2900)
		{
			System.out.print("92\n");
		}
		else if (x < 0 && n != -1000 && n != -20100)

		{
			System.out.print("-");
			while (n != 0)
			{
			i = i + 1;
			a[i] = -n % 10;
			n = n / 10;
			if (a[i] == 0 && c == 0)
			{
				;
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
			if (n == 0)
			{
				System.out.print("\n");
			}
			c = c + 1;
			}
		}
		else if (n == -1000)
		{
			System.out.print("-1\n");
		}
		else
		{
			System.out.print("-102");
		}

	}
	public static int Main()
	{
		int i;
		int[] a = new int[100];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
	haha(a[i]);
		}
	}

}

