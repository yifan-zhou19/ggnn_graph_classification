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
		int i = 1;
		int k;
		int sum = 0;
		int[] x = new int[10];
		if (n == 0)
		{
		System.out.print("0");
		}
		else
		{
		while (n != 0)
		{

				   x[i] = n % 10;
				   n = n / 10;
				   i++;
		}
		i = i - 1;

		for (k = 1;k <= i;k++)
		{
						 System.out.printf("%d", x[k]);
		}
		}

		return 0;
	}

}

