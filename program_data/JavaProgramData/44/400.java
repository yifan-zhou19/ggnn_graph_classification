package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int a;
		int b = 1;
		int[] z = new int[10];
		int max;
		if (n < 0)
		{
			n = -n;
			System.out.print("-");
		}
		if (n == 0)
		{
			System.out.print("0\n");
			return 0;
		}
		for (a = 0;a <= 9;a++)
		{
			z[a] = n / b;
			b = b * 10;
		}
		for (a = 0;a <= 9;a++)
		{
			b = z[a] / 10;
			z[a] = z[a] - b * 10;
		}
		b = 0;
		for (a = 9;a >= 0;a--)
		{
			if ((z[a - 1] != 0) && (b == 0))
			{
				max = a - 1;
				b = 1;
				continue;
			}
			//if(b==1) printf("%d",z[a]);
		}
		b = 0;
		for (a = 0;a <= max;a++)
		{
			if ((z[a] != 0) && (b == 0))
			{
				b = 1;
				System.out.printf("%d",z[a]);
				continue;
			}
			if (b == 1)
			{
				System.out.printf("%d",z[a]);
			}
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int a;
		int n;
		for (a = 0;a <= 5;a++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			n = reverse(n);
			//printf("%d",n);
		}
		return 0;
	}
}

