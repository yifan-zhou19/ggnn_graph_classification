package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??half???????s1,s2??????????????????????????????
		int number;
		int half;
		int s1 = 0;
		int s2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int j;
		int m;
		int k1;
		int k2;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		half = number / 2;
			for (s1 = 3;s1 <= half;s1++)
			{
				sum1 = 0;
				sum2 = 0;
				s2 = number - s1; //?????????
				for (j = 2;j < s1;j++) //??s1?????
				{
					k1 = s1 % j;
					{
						if (k1 == 0)
						{
						sum1 = sum1 + 1;
						}
					}
				}
				for (m = 2;m < s2;m++) //??s2?????
				{
					k2 = s2 % m;
					{
						if (k2 == 0)
						{
						sum2 = sum2 + 1;
						}
					}
				}
				if (sum1 == 0 && sum2 == 0)
				{
					System.out.print(s1);
					System.out.print(" ");
					System.out.print(s2);
					System.out.print("\n");
				}
			}

			return 0;



	}



}

