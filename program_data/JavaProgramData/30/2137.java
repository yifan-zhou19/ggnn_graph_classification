package <missing>;

public class GlobalMembers
{
	public static int yu7WuGuan(int number)
	{
			if (number % 7 == 0)
			{
				return 0;
			}
			for (int num = number; num > 0; num /= 10)
			{
				if (num % 10 == 7)
				{
					return 0;
				}
			}
			return 1;
	}


	public static int Main()
	{
			int num;
			int result = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}

			for (int i = 1; i <= num; i++)
			{
				if (yu7WuGuan(i) != 0)
				{
					result += i * i;
				}
			}

			System.out.printf("%d", result);
			return 0;
	}
}

