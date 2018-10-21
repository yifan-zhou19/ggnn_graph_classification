package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] x = {3, 5, 7, 1000, 1000};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 3; i++)
		{
			if (n % x[i] == 0 && n % x[i + 1] != 0 && n % x[i + 2] != 0)
			{
				System.out.printf("%d",x[i]);
			}
			else if (n % x[i] == 0 && (n % x[i + 1] == 0 || n % x[i + 2] == 0))
			{
				System.out.printf("%d ", x[i]);
			}
		}
		if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

