package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int date;
	   int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   //printf("%d",a);
	   int i;
	   int b = a - 1;
	   for (i = 1;i <= 12;i++)
	   {
		   date = 0;
		   while (date < m[i])
		   {
				   date++;
			if (b < 7)
			{
				b++;
			}
			else
			{
				b = 1;
			}
			//printf("%d %d\n",date,b);
			if (date == 13 && b == 5)
			{
				System.out.printf("%d\n",i);
			}
		   }
	   }
	   return 0;
	}
}

