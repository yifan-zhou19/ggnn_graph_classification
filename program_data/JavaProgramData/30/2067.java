package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			if (n % 7 != 0 && n % 10 != 7 && (n > 79 || n < 70))
			{
				sum += Math.pow(n,2);
			}
			n--;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

