package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int operate = int n;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
		n = operate(n);
		}

		System.out.print("End");

		return 0;

	}

	public static int operate(int n)
	{
		int nn;
		if (n % 2 == 0)
		{
			 nn = n / 2;
			 System.out.printf("%d/2=%d\n", n, nn);
		}
		else
		{
			 nn = 3 * n + 1;
			 System.out.printf("%d*3+1=%d\n", n, nn);
		}
		return nn;
	}




}

