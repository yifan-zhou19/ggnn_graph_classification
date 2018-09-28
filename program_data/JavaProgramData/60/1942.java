package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int x = 0;
		for (int i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				x = 1;
			}
		}
		return x;
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int x;
		int y;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		for (i = 3;i <= n - 2;i++)
		{
			a = i;
			b = i + 2;
			x = sushu(a);
			y = sushu(b);
			if (x + y == 0)
			{
				System.out.printf("%d %d\n",a,b);
				s = 1;
			}
			if (s == 0)
			{
				System.out.print("empty");
			}
		}
		return 0;
	}

}

