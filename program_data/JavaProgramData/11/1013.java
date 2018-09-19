package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = int a;
		int count = new int(int x[], int w, int y);
		int year;
		int month;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		int k;
		int sum;
		k = check(year);
		if (k == 1)
		{
			   int[] days1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			   sum = count(days1, month, day);
			   System.out.printf("%d", sum);
		}
		else
		{
			  int[] days2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			  sum = count(days2, month, day);
			   System.out.printf("%d", sum);
		}


		return 0;
	}

		public static int check(int a)
		{
			int b;
			int c;
			int d;
			b = a % 4;
			c = a % 100;
			d = a % 400;
			if (b != 0)
			{
				 return 1;
			}
			else if (c == 0 && d != 0)
			{
				 return 1;
			}
			else
			{
				return 0;
			}

		}

		 public static int count(int[] x, int w, int y)
		 {
			 int sum = 0;
			 int i;
			 for (i = 1;i < w;i++)
			 {
							  sum = sum + x[i];
			 }
			 sum = sum + y;
			 return sum;
		 }


}

