package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int m;
		m = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}


	   if (a % 3 == 0)
	   {

	   m = m + 1;
	   }
	   if (a % 5 == 0)
	   {

	   m = m + 10;
	   }
	   if (a % 7 == 0)
	   {

	   m = m + 100;
	   }
	   if (m == 0)
	   {
		System.out.print("n");
	   }
	   if (m == 1)
	   {
	   System.out.print("3");
	   }
	   if (m == 10)
	   {
		   System.out.print("5");
	   }
	   if (m == 100)
	   {
	   System.out.print("7");
	   }
	   if (m == 11)
	   {
	   System.out.print("3 5");
	   }
	   if (m == 101)
	   {
	   System.out.print("3 7");
	   }
	   if (m == 110)
	   {
	   System.out.print("5 7");
	   }
	   if (m == 111)
	   {
		   System.out.print("3 5 7");
	   }

	}

}

