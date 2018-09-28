package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void nixu(int num,int sign);
		int i;
		int num;
		int sign = 0;
		for (i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			nixu(num, sign);
			System.out.print("\n");
		}
		return 0;
	}
	public static void nixu(int num,int sign)
	{
		int[] sum = new int[10000];
		int i = 0;
		int temp;
		int j;
		if (num == 0)
		{
		System.out.print(0);
		}
		else
		{
			 if (num < 0)
			 {
				 num = 0 - num;
				 System.out.print('-');
			 }
			 if (num % 10 != 0)
			 {
			 sign = 1;
			 }
			 if (sign != 0)
			 {
			 System.out.print(num % 10);
			 }
			 if (num / 10 != 0)
			 {
				 nixu(num / 10, sign);
			 }
		}

	}
}

