package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] x = new int[301];
		char c;

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
			if (c == 10)
			{
				break;
			}
		}

		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			int a = 0;
			int b = 0;
			int i;
			for (i = 0;i <= n - 1;i++)
			{
				if (a < x[i])
				{
					b = a;
					a = x[i];
				}
				else if (a > x[i] && x[i] > b)
				{
					b = x[i];
				}
			}

			if (a > b && b > 0)
			{
				System.out.printf("%d\n",b);
			}
			else
			{
				System.out.print("No\n");
			}
		}

		return 0;
	}
}

