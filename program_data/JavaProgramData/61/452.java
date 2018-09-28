package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int one = 1;
		int two = 1;
		int count;
		int num;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}
		while (count -- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num == 1 || num == 2)
			{
				System.out.print("1\n");
				continue;
			}
			num -= 2;
			one = 1, two = 1;
			sum = 0;
			for (i = 0; i < num; i++)
			{
				sum = one + two;
				one = two;
				two = sum;
			}
			System.out.printf("%d\n", sum);
		}
		return 0;
	}
}

