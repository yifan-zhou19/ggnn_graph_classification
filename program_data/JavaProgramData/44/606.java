package <missing>;

public class GlobalMembers
{
	public static int flag = 0;
	public static void reverse(int num)
	{
		if (flag == 1 || num % 10 != 0) //flag ??????????0??
		{
			if (num % 10 != 0)
			{
				flag = 1;
			}
			System.out.print(num % 10);
		}
		if (num / 10 != 0)
		{
			reverse(num / 10); //??
		}
	}
	public static int Main()
	{
		int i;
		for (i = 0;i < 6;i++)
		{
			flag = 0;
			int n;
			int u;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n < 0)
			{
				System.out.print('-');
				reverse(-n);
				System.out.print("\n");
			}
			else if (n > 0)
			{
				reverse(n);
				System.out.print("\n");
			}
			else if (n == 0)
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}

}

