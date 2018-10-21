package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int[] num1 = new int[7];
		int[] num2 = new int[7];
		for (int i = 1;i <= 6;i++)
		{
		   num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   num2[i] = reverse(num1[i]);
		}

		   return 0;
	}

	public static int reverse(int num)
	{
		int i = 0;
		int p = 0;
		if (num > 0)
		{
		   while (num != 0)
		   {
				i = num % 10;
				num = num / 10;
				if (i != 0)
				{
				p = 1;
				}
				if (i == 0 && p == 0)
				{
					continue;
				}
				else
				{
				System.out.print(i);
				}
		   }
			System.out.print("\n");
		}
		else if (num == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else if (num < 0)
		{
			num = -num;
			System.out.print("-");
			while (num != 0)
			{
				i = num % 10;
				num = num / 10;
				if (i != 0)
				{
				p = 1;
				}
				if (i == 0 && p == 0)
				{
				   continue;
				}
				else
				{

				System.out.print(i);
				}
			}
		  System.out.print("\n");
		}
		return (num);
	}



}

