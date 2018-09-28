package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int runnian = int year;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int year;
		int x;
		int y;
		int boolean_Renamed;
		int sum;
		int temp;
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
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				y = Integer.parseInt(tempVar4);
			}
		 boolean_Renamed = runnian(year);
		 if (x > y)
		 {
			 temp = x;
			 x = y;
			 y = temp;
		 }
		 sum = 0;
		 if (boolean_Renamed != 0)
		 {
		   for (j = x;j < y;j++)
		   {
			   sum = sum + a[j - 1];
		   }
		 }
		 if (boolean_Renamed == 0)
		 {
		   for (j = x;j < y;j++)
		   {
			   sum = sum + b[j - 1];
		   }
		 }

		 if (sum % 7 == 0)
		 {
			 System.out.print("YES\n");
		 }
		 else
		 {
			 System.out.print("NO\n");
		 }

		}
		return 0;

	}
	public static int runnian(int year)
	{
		int b;
	 if (year % 400 == 0)
	 {
		 return (0);
	 }
	 if (year % 4 == 0 && year % 100 != 0)
	 {
		 return (0);
	 }
	 return (1);


	}

}

