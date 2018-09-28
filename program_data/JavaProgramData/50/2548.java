package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m = 1;
		int day;
		int a;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = 12;
		do
		{
			if (m == 3)
			{
				day += 28;
			}
			else
			{
			   if (m == 5 || m == 7 || m == 10 || m == 12)
			   {
				  day += 30;
			   }
			   else
			   {
				  if (m != 1)
				  {
				  day += 31;
				  }
			   }
			}
			a = day % 7;
			if ((a + w) % 7 == 5)
			{
				System.out.print(m);
				System.out.print("\n");
			}
			m++;
		}while (m <= 12);
		return 0;
	}

}

