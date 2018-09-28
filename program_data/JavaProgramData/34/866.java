package <missing>;

public class GlobalMembers
{
	public static int xx(int k)
	{
		int c;
		if (k % 2 == 0)
		{
				c = k / 2;

		}
			if (k % 2 == 1)
			{
				c = k * 3 + 1;

			}
			return c;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			for (i = n;i > 1;i = xx(i))
			{
				if (i % 2 == 0)
				{

					System.out.printf("%d/2=%d\n",i,i / 2);
				}
				if (i % 2 == 1)
				{

					System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
				}
			}
			System.out.print("End");
		}
		return 0;
	}
}

