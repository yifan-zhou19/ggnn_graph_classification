package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n; //????n?????m
	   int m = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (n;n >= 100;n = n - 100) //?????????????100
	   {
			m = m + 1; //100?????
	   }
	   System.out.print(m);
	   System.out.print("\n");
	   m = 0; //???m??????????
	   for (n;n >= 50;n = n - 50)
	   {
			m = m + 1;
	   }
	   System.out.print(m);
	   System.out.print("\n");
	   m = 0;
		  for (n;n >= 20;n = n - 20)
		  {
			m = m + 1;
		  }
	   System.out.print(m);
	   System.out.print("\n");
	   m = 0;
	   for (n;n >= 10;n = n - 10)
	   {
			m = m + 1;
	   }
	   System.out.print(m);
	   System.out.print("\n");
	   m = 0;
	   for (n;n >= 5;n = n - 5)
	   {
			m = m + 1;
	   }
	   System.out.print(m);
	   System.out.print("\n");
	   m = 0;
	   for (n;n >= 1;n = n - 1)
	   {
			m = m + 1;
	   }
	   System.out.print(m);
	   System.out.print("\n");
	   return 0;
	}
}

