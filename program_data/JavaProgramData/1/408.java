package <missing>;

public class GlobalMembers
{
	public static int yinshu(int be,int by) //???????
	{
		int i;
		int sum = 0;
		for (i = by;i * i <= be;i++)
		{
						   if (be % i == 0)
						   {
									  sum = sum + 1 + yinshu(be / i, i);
						   } //be?i?????????????????be/i
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0) //???
		{
						int num; //sign??????
						int sign;
						num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						for (int j = num;j > 1;j--)
						{
								if (num % j == 0)
								{
								sign = j;
								}
						} //??????
						System.out.print(yinshu(num, sign) + 1);
						System.out.print("\n");
		}
		return 0;
	}



}

