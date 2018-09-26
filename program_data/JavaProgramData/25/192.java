package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double sum = 1;
		for (int i = 1;i <= n;i++)
		{
		sum = sum * 2;
		}

		System.out.printf("%.lf",sum);

	}

}

