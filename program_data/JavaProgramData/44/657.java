package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num1;
		int num1;
		int num2 = 0;
		while ((num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			num2 = reverse(num1);
			System.out.print(num2);
			System.out.print("\n");
		}
		return 0;
	}

	public static int reverse(int num1)
	{
		int[] num = new int[1000];
		int i;
		int j;
		int num2 = 0;
		for (i = 0;;i++)
		{
			if (num1 / 10 == 0)
			{
				num[i] = num1;
				break;
			}
			else
			{
					num[i] = num1 % 10;
					num1 = num1 / 10;
			}
		}
		for (j = 0;j <= i;j++)
		{
			num2 = 10 * num2 + num[j];
		}
		return (num2);
	}
}

