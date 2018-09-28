package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= b;a++)
		{
			if (a % 7 == 0)
			{
				continue;
			}
			if (a % 10 == 7)
			{
				continue;
			}
			if (a - a % 10 == 70)
			{
				continue;
			}
			sum += a * a;
		}
		System.out.printf("%d\n",sum);
	}

}

