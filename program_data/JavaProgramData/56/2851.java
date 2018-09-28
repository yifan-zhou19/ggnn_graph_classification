package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[100];
		for (i = 1;i < 100;i++)
		{
			x[i - 1] = n % 10;
			n = (n - n % 10) / 10;
			if (n == 0)
			{
				break;
			}
		}
		for (o = 1;o <= i;o++)
		{
			System.out.printf("%d",x[o - 1]);
		}
		return 0;
	}

}

