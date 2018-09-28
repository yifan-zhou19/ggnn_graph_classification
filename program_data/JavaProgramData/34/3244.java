package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num1;
		int num2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = Integer.parseInt(tempVar);
		}
		if (num1 == 1)
		{
			System.out.print("End");
		}
		else
		{
			if (num1 % 2 == 0)
			{
				num2 = num1 / 2;
			}
			else
			{
				num2 = num1 * 3 + 1;
			}
			while (num2 != 1)
			{
				if (num1 % 2 == 0)
				{
					System.out.printf("%d/2=%d\n",num1,num2);
				}
				else
				{
					System.out.printf("%d*3+1=%d\n",num1,num2);
				}
				num1 = num2;
				if (num1 % 2 == 0)
				{
					num2 = num1 / 2;
				}
				else
				{
					num2 = num1 * 3 + 1;
				}
			}
			if (num1 % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",num1,num2);
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",num1,num2);
			}
			System.out.print("End");
		}
		return 0;
	}
}

