package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void reverse(int num);
		int num;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			if (num > 0)
			{
				reverse(num);
			}
			else if (num == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("-");
				reverse(-num);
			}
		}
		return 0;
	}
	public static void reverse(int num)
	{
		int a;
		while (num > 0)
		{
			if (num % 10 == 0)
			{
				num /= 10;
			}
			else
			{
				break;
			}
		}
		while (num > 0)
		{
			System.out.printf("%d",num % 10);
			num /= 10;
		}
		System.out.print("\n");
	}
}

