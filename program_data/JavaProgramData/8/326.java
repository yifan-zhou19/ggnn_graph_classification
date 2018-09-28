package <missing>;

public class GlobalMembers
{
	public static int[] first = new int[100];
	public static int[] second = new int[100];
	public static int[] combination = new int[200];
	public static int a; //??????
	public static int b;
	public static void cin_number()
	{
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < a;i++)
		{
			first[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < b;i++)
		{
			second[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //?????????????????
	public static void rank()
	{
		int i;
		int j;
		int temp;
		for (i = (a - 1);i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (first[j] > first[j + 1])
				{
					temp = first[j];
					first[j] = first[j + 1];
					first[j + 1] = temp;
				}
			}
		}
		for (i = (b - 1);i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (second[j] > second[j + 1])
				{
					temp = second[j];
					second[j] = second[j + 1];
					second[j + 1] = temp;
				}
			}
		}
	}
	public static void combine()
	{
		int i;
		for (i = 0;i < a;i++)
		{
			combination[i] = first[i];
		}
		for (i = 0;i < b;i++)
		{
			combination[a + i] = second[i];
		}
	}
	public static void cout_combination()
	{
		int i;
		for (i = 0;i < (a + b - 1);i++)
		{
			System.out.print(combination[i]);
			System.out.print(" ");
		}
		System.out.print(combination[i]);
		System.out.print("\n");
	}
	public static int Main()
	{
		cin_number();
		rank();
		combine();
		cout_combination();
		return 0;
	}
}

