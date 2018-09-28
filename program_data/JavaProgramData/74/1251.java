package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//





	public static int isround(int num)
	{
		int temp;
		int mid;
		temp = 0;
	  mid = num;
	  while (mid != 0)
	  {
	   temp = temp * 10 + mid % 10;
	   mid /= 10;
	  }
		if (temp == num)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}

	public static int isprime(int n)
	{
		int i;
		int count = 0;
		for (i = 2;i <= n - 1;i++)
		{
			if (n % i == 0)
			{
				count++;
			}
		}
		if (count == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}




	public static int Main()
	{
		int m;
		int n;
		int i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (isprime(i) == 1 && isround(i) == 1)
			{
				if (count == 0)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
				count++;
			}
		}
		 if (count == 0)
		 {
			 System.out.print("no");
		 }

		return 0;
	}


}

