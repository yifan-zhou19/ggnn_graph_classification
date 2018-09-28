package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int sum;
		int sun;
		int x;
		i = 1;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (i <= a)
		{
		sum += i * i;
		i++;
		}

	sun = 0;
	while (a > 0)
	{
		if ((a % 7 == 0) || (a / 10 == 7) || (a % 10 == 7))
		{
			sun += a * a;
		a--;
		}
		else
		{
			a--;
		}
	}
	x = sum - sun;
		System.out.printf("%d",x);
		return 0;

	}
}

