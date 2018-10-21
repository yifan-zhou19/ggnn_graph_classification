package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int day;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day--;
		for (i = 1 ; i <= 12 ; i++)
		{
		 for (j = 1 ; j <= f[i] ; j++)
		 {
		   day++;
		   if (day > 7)
		   {
			   day = 1;
		   }
		   if (j == 13 && day == 5)
		   {
			   System.out.print(i);
			   System.out.print("\n");
		   }
		 }
		}
	}

}

