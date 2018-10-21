package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int week = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int i;
	   int[] day = new int[13];
	   int sum = 0;
	   for (i = 1;i <= 12;i++)
	   {
		   day[i] = sum + 13;
		   sum += d[i];
		   week = (day[i] % 7 + n - 1) % 7;

		   if (week == 5)
		   {
			   System.out.printf("%d\n",i);
		   }
	   }
	   return 0;
	}


}

