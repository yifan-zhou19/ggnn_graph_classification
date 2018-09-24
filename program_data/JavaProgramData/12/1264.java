package <missing>;

public class GlobalMembers
{
	//***********???????*************************
	//***********???????*************************
	//***********?????2012?10?30?***************
	//***********???1200062701**********************


	public static int Main()
	{
		int[] x = new int[15];
		int sum = 0;
		int n;
		while (true)
		{
			for (n = 0; ; n++) // n?????
			{
				x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (x[n] <= 0)
				{
					break; //??????0 ? -1 ????
				}
			}
			if (x[n] == -1)
			{
				break; // ???-1 ????
			}
			for (int i = 0; i < n; i++) // ?????????
			{
				for (int j = 0; j < n; j++)
				{
					if (x[j] == x[i] * 2)
					{
						sum = sum + 1;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
					   sum = 0;
		}

		return 0;
	}
}

