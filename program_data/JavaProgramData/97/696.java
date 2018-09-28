package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int[] num = {0, 0, 0, 0, 0, 0};
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}

		if (sum >= 100)
		{
			num[0] = sum / 100;
			sum = sum % 100;
		}
		if (sum >= 50)
		{
			num[1] = sum / 50;
			sum = sum % 50;
		}
		if (sum >= 20)
		{
			num[2] = sum / 20;
			sum = sum % 20;
		}
		if (sum >= 10)
		{
			num[3] = sum / 10;
			sum = sum % 10;
		}
		if (sum >= 5)
		{
			num[4] = sum / 5;
			sum = sum % 5;
		}
		if (sum >= 1)
		{
			num[5] = sum / 1;
			sum = sum % 1;
		}

		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",num[i]);
		}

		return 0;
	}

}

