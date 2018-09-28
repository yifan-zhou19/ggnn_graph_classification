package <missing>;

public class GlobalMembers
{
	public static int pan1(int a)
	{
		int b = 0;
		int c = a;

		while (c != 0)
		{
			b = 10 * b + c % 10;
			c = c / 10;
		}
		if (a == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int pan2(int a)
	{
		int i;
		int y = 1;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				y = 0;
			}
		}
		return (y);
	}
	public static void Main()
	{
		int a;
		int b;
		int[] c = new int[100];
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			if (pan1(i) != 0 && pan2(i) != 0)
			{
				c[j] = i;
				j = j + 1;
			}
		}
		if (c[0] != 0)
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",c[i]);
			}
		System.out.printf("%d\n",c[j - 1]);
		}
	else
	{
		System.out.print("no");
	}
	}
}

