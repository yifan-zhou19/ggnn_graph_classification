package <missing>;

public class GlobalMembers
{
	//???????????????????��
	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int[] num = new int[2000];
	public static int n1;
	public static int n2;
	public static void read()
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n1 ; i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0 ; i < n2 ; i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void range()
	{
		for (int i = 0 ; i < n1 - 1 ; i++)
		{
			for (int j = 0 ; j < n1 - 1 - i ; j++)
			{
				if (num1[j] > num1[j + 1])
				{
					int temp = 0;
					temp = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = temp;
				}
			}
		}
		for (int i = 0 ; i < n2 - 1 ; i++)
		{
			for (int j = 0 ; j < n2 - 1 - i ; j++)
			{
				if (num2[j] > num2[j + 1])
				{
					int temp = 0;
					temp = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = temp;
				}
			}
		}
	}
	public static void combine()
	{
		for (int i = 0 ; i < n1 ; i++)
		{
			num[i] = num1[i];
		}
		for (int i = 0 ; i < n2 ; i++)
		{
			num[n1 + i] = num2[i];
		}
	}
	public static void print()
	{ //??????????
		for (int i = 0 ; i < n1 + n2 - 1 ; i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n1 + n2 - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		read();
		range();
		combine();
		print();

		return 0;
	}
	// ( > w < ) finished~
}

