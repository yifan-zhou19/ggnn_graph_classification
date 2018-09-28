package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		double s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
			  s *= 2;
			}
			System.out.printf("%.0f",s);
		}

		return 0;
	}

}

