package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[6];
		int i;
		int[] y = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 5;i++)
		{
			x[i] = n % y[i];
		 x[i] = (n - x[i]) / y[i];
		 n = n - x[i] * y[i];
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",x[i]);
		}
	  return 0;

	}
}

