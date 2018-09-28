package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] num1 = new int[100];
	public static int[] num2 = new int[100];
	public static int[] num3 = new int[1000];
	public static void read()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= m; i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort(int[] num1, int[] num2)
	{
		for (int i = 1; i <= n - 1; i++)
		{
			for (int j = 1; j <= n - i; j++)
			{
				if (num1[j] > num1[j + 1])
				{
					swap(num1[j], num1[j + 1]);
				}
			}
		}
		for (int i = 1; i <= m - 1; i++)
		{
			for (int j = 1; j <= m - i; j++)
			{
				if (num2[j] > num2[j + 1])
				{
					swap(num2[j], num2[j + 1]);
				}
			}
		}
	}
	public static void hebing(int[] num1, int[] num2, int[] num3)
	{
		for (int i = 1; i <= n + m; i++)
		{
			if (i <= n)
			{
				num3[i] = num1[i];
			}
			else
			{
				num3[i] = num2[i - n];
			}
		}
	}
	public static void display(int[] num3)
	{
		for (int i = 1; i <= n + m ; i++)
		{
			if (i == 1)
			{
				System.out.print(num3[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(num3[i]);
			}
		}
	}


	public static int Main()
	{
		read();
		sort(num1, num2);
		hebing(num1, num2, num3);
		display(num3);
		return 0;
	}
}

