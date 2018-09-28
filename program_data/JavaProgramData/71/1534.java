package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int temp;
		int sum = 0;
		int run = int x;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}

				if (run(y) == 1)
				{
				day[1] = 29;
				}
				else
				{
				day[1] = 28;
				}

				if (m1 > m2)
				{
					temp = m1;
				m1 = m2;
				m2 = temp;
				}
				for (j = m1 - 1;j < m2 - 1;j++)
				{
				sum = sum + day[j];
				}

				if (sum % 7 == 0)
				{
				System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}

				sum = 0;
				temp = 0;



		}

	}
	public static int run(int x)
	{
			 if (x % 4 == 0)
			 {
				if (x % 100 == 0)
				{
						if (x % 400 == 0)
						{
							return 1;
						}
							 else
							 {
								 return 0;
							 }
				}
			else
			{
				return 1;
			}
			 }
			else
			{
				return 0;
			}


	}

}

