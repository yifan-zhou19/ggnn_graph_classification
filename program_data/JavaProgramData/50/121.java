package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int day;
	   int yu;
	   int i;
	   int k;
	   int sum = 0;
	   int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			sum = 0;
			for (k = 0;k < i;k++)
			{
				sum = sum + monthday[k];
			}
			sum = sum + 12;
			yu = sum % 7;
			if (yu + n <= 7)
			{
				day = yu + n;
			}
			else if (yu + n > 7)
			{
				day = n - (7 - yu);
			}
			else
			{
				;
			}
			if (day == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}



	}


}

