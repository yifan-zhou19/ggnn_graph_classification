package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static void shuru()
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	public static void paixu1()
	{
		int i;
		int j;
		int t;
		int[] c = new int[100];
		for (i = 0;i < a;i++)
		{
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < a - 1;i++)
		{
			for (j = 0;j < a - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;



				}
			}
		}
			for (i = 0;i < a;i++)
			{
				System.out.print(c[i]);
				System.out.print(" ");
			}
	}
	public static void paixu2()
	{
		int i;
		int j;
		int t;
		int[] c = new int[100];
		for (i = 0;i < b;i++)
		{
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < b - 1;i++)
		{
			for (j = 0;j < b - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;



				}
			}
		}
			for (i = 0;i < b - 1;i++)
			{
				System.out.print(c[i]);
				System.out.print(" ");
			}
			System.out.print(c[b - 1]);
	}
	public static int Main()
	{
	shuru();
	paixu1();
	paixu2();




	return 0;











	}
}

