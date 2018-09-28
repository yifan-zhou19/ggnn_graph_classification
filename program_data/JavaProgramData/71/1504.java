package <missing>;

public class GlobalMembers
{
	public static int s(int year,int month,int date)
	{
		int s = 0;
		int i;
		if ((year % 400 == 0) || ((year % 100 != 0) & (year % 4 == 0)))
		{
		   int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		   for (i = 0;(i + 1) < month;i++)
		   {
			 s += n[i];
		   }
		   s = s + date;
		}
		else
		{
		   int[] n = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		   for (i = 0;(i + 1) < month;i++)
		   {
			 s += n[i];
		   }
		   s = s + date;
		}

		return s;
	}




	public static void Main(String[] args)
	{
		int n;
		int i;
		int year;
		int month1;
		int month2;
		int a;
		int b;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			a = s(year, month1, 1);
			b = s(year, month2, 1);
			if ((a - b) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

