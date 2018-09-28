package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{

		int b = 0;
		int i;

			if (num >= 0)
			{
				for (i = 0;;i++)
				{
					b = num % 10 + 10 * b;
					num = num / 10;
					if (num == 0)
					{
						break;
					}
				}
			}
			else
			{
				num = Math.abs(num);
				for (i = 0;;i++)
				{
					b = num % 10 + 10 * b;
					num = num / 10;
					if (num == 0)
					{
						break;
					}
				}
				b = -b;

			}

		return b;

	}

	public static void Main(String[] args)
	{
		int i;
		int num;
		int result;

		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}

			result = reverse(num);

			System.out.printf("%d\n",result);
		}

	}

}

