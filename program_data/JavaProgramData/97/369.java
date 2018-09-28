package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			if (n - 100 >= 0)
			{
				sum1++;
				n = n - 100;
			}
			else if (n - 50 >= 0 && n - 50 < 50)
			{
				sum2++;
				n = n - 50;
			}
			else if (n - 20 >= 0 && n - 20 < 30)
			{
				sum3++;
				n = n - 20;
			}
			else if (n - 10 >= 0 && n - 10 < 10)
			{
				sum4++;
				n = n - 10;
			}
			else if (n - 5 >= 0 && n - 5 < 5)
			{
				sum5++;
				n = n - 5;
			}
			else if (n - 1 >= 0 && n - 1 < 4)
			{
				sum6++;
				n = n - 1;
			}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",sum1,sum2,sum3,sum4,sum5,sum6);
		return 0;
	}



}

