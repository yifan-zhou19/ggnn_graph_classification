package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ?  ?: ???                                      *
	//*  ?  ?: ???  1200012861                          *
	//*  ?  ?: 2012?10?21?                              *
	//********************************************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int min;
		int max;
		int sum;
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			min = m1 < m2 != 0 ? m1 : m2;
			max = m1 > m2 != 0 ? m1 : m2;
			if (((y % 100 != 0) && (y % 4 == 0)) || (y % 400 == 0))
			{
														 //?????????
				sum = 0; //???????????sum
				month[1] = 29; //???2????????29
				for (j = min; j < max; j++)
				{
					sum = sum + month[j - 1]; //??????????sum
				}
				if (sum % 7 == 0) //??sum??7???????
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			else //?????????
			{
				sum = 0; //???????????sum
				month[1] = 28; //???2????????28
				for (j = min; j < max; j++)
				{
					sum = sum + month[j - 1]; //??????????sum
				}
				if (sum % 7 == 0) //??sum??7???????
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}






}

