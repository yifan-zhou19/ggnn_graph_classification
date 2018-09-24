package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int i;
	   int d1;
	   int day = 0;
	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= 12;i++)
	   {
			   if (((day + 12) % 7 + a) % 7 == 5)
			   {
				   System.out.print(i);
				   System.out.print("\n");
			   }
			   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			   {
				   day += 31;
			   }
			 else if (i == 2)
			 {
				 day += 28;
			 }
			 else
			 {
				 day += 30;
			 }
	   }
	   return 0;
	}

}

