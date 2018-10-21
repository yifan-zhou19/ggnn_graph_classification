package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;)
		{
			if (i % 7 == 0 || (i - 7) % 10 == 0)
			{
				i++;
				continue;
			}
			else if (i > 70 && i < 80)
			{
				i++;
				continue;
			}
			else
			{
			sum += Math.pow(i,2);
			i++;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

