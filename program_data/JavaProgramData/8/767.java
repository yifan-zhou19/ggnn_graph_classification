package <missing>;

public class GlobalMembers
{
	/*
	 *???: model programming.cpp
	 *??????
	 *????: 2012-11-18
	 *??: ?????
	 */


	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int a;
	public static int b;

	public static void cin_array(int[] num1, int[] num2)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < a; i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < b; i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //??a?b?????

	public static void sort(int[] num1, int[] num2)
	{
		int temp;
		for (int i = 1; i <= a; i++)
		{
			for (int j = 0; j < a - i; j++)
			{
				if (num1[j] > num1[j + 1])
				{
					temp = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i <= b; i++)
		{
			for (int j = 0; j < b - i; j++)
			{
				if (num2[j] > num2[j + 1])
				{
					temp = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = temp;
				}
			}
		}
	} //???????????

	public static void connect(int[] num1, int[] num2)
	{
		for (int i = 0; i < b; i++)
		{
			num1[a + i] = num2[i];
		}
	} //??

	public static void cout_array(int[] num)
	{
		for (int i = 0; i < a + b - 1; i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[a + b - 1]);
	} //??

	public static int Main()
	{
		cin_array(num1, num2);
		sort(num1, num2);
		connect(num1, num2);
		cout_array(num1);
		return 0;
	}

}

