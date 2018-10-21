package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int date;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			date = Integer.parseInt(tempVar3);
		}
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
		System.out.printf("%d\n",s);
	}


}

