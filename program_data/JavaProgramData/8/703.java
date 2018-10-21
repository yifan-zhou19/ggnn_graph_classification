package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int m;
	public static int n;
	public static void gets()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			num2[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu()
	{
		int i;
		int j;
		int a = 0;
		int b = 0;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (num1[j] > num1[j + 1])
				{
					a = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = a;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (num2[j] > num2[j + 1])
				{
					a = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = a;
				}
			}
		}
	}
	public static void hebing()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			num1[m + i] = num2[i];
		}
	}
	public static void shuchu()
	{
		int i;
		System.out.print(num1[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.print(" ");
			System.out.print(num1[i]);
		}
	}
	public static int Main()
	{
		gets();
		paixu();
		hebing();
		shuchu();
			return 0;
	}


}

