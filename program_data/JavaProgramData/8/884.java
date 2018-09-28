package <missing>;

public class GlobalMembers
{
	public static void mode(int x, int y)
	{
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int[] num3 = new int[200];
		int i;
		int j;
		int k;
		for (i = 0; i < x; i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < x - 1; j++)
		{
			for (k = 0; k < x - 1 - j; k++)
			{
				if (num1[k] > num1[k + 1])
				{
					swap(num1[k], num1[k + 1]);
				}
			}
		}
		for (i = 0; i < y; i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < y - 1; j++)
		{
			for (k = 0; k < y - 1 - j; k++)
			{
				if (num2[k] > num2[k + 1])
				{
					swap(num2[k], num2[k + 1]);
				}
			}
		}
		for (i = 0; i < x; i++)
		{
			num3[i] = num1[i];
		}
		for (i = x; i < (x + y); i++)
		{
			num3[i] = num2[i - x];
		}
		for (i = 0; i < x + y - 1; i++)
		{
			System.out.print(num3[i]);
			System.out.print(" ");
		}
		System.out.print(num3[x + y - 1]);
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mode(x, y);
		return 0;
	}


}

