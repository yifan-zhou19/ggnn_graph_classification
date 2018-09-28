package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = {'\0', 0, 0, 0, 0};
		int number;
		int i;
		int place = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		do
		{
		place = 1;
		for (i = 0;i <= 4;i++)
		{
			num[i] = number % 10;
			number /= 10;
			if (number != 0)
			{
				place += 1;
			}
		}
		for (i = 0;i < place;i++)
		{
			System.out.printf("%d",num[i]);
		}
		System.out.print("\n");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			number = Integer.parseInt(tempVar2);
		}
		}while (number != 0);
		return 0;
	}

}

