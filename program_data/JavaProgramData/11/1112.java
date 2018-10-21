package <missing>;

public class GlobalMembers
{
	/*?? - ??(10.1) ????	
	??
	??????????
	????
	?????????????a(0 < a < 3000)?
	????
	???????a??????Y?????N?
	????
	2006
	????
	N*/
	public static int Main()

	{
		int just = int y;



		int y;
		int m;
		int d;
		int t = 0;

		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   if (just(y) == 1)
	   {
			if (m == 1)
			{
		 t = 0;
			}
		 else
		 {
		 for (int i = 0; i <= m - 2 ; i++)
		 {
		 t += b[i];
		 }
		 }

	   }
		  else
		  {
			if (m == 1)
			{
		 t = 0;
			}
		 else
		 {
		 for (int i = 0; i <= m - 2 ; i++)
		 {
		 t += a[i];
		 }
		 }

		  }
		 System.out.print(t + d);

		 return 0;
	}


		 public static int just(int y)
		 {
		   int m = 0;

		if (y % 4 == 0 && y % 100 != 0)
		{
			return 1;
		}
		if (y % 400 == 0)
		{
			return 1;
		}
		 return 0;
		 }


}

