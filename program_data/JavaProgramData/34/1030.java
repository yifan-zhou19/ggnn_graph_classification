package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		}
		else
		{
		int a;
		int b;
		a = n;
		int i = 1;
		while (a != 1)
		{
			b = a;
			if (a % 2 != 0)
			{
				a = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n", b, a);
			}
			else
			{
				a = a / 2;
				System.out.printf("%d/2=%d\n", b, a);
			}
			i++;
		}
		}
		System.out.print("End");
		return 0;
	}
}

