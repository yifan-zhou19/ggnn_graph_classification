package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n != 1)
		{
		if (n % 2 == 0)
		{
			n = n / 2;
			x = n * 2;
			System.out.printf("%d/2=%d\n",x,n);
		}
		else
		{
			n = n * 3 + 1;
			y = (n - 1) / 3;
			System.out.printf("%d*3+1=%d\n",y,n);
		}
		}

		if (n == 1)
		{
		System.out.print("End\n");
		}

	}

}

