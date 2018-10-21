package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else if (n == 5 || n == 6)
		{
			System.out.print("3 5");
		}
		else
		{
			for (i = 3;i <= n - 2;i++)
			{
				a = 0;
				b = 0;
				p = (i + 2) / 2;
				for (j = 2;j < p;j++)
				{
					if (i % j == 0)
					{
						a = 1;
					}
				}
				for (j = 2;j < p;j++)
				{
					if ((i + 2) % j == 0)
					{
						b = 1;
					}
				}
				if (a != 1 && b != 1)
				{
					System.out.printf("%d",i);
					System.out.print(" ");
					System.out.printf("%d\n",i + 2);
				}
				else
				{
					continue;
				}
			}
		}
	}
}

