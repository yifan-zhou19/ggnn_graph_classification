package <missing>;

public class GlobalMembers
{
	public static int a = 0;

	public static int Main()
	{
	 for (int i = 1;i <= 6;i++)
	 {
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (a == 0)
	  {
		  System.out.print(0);
	  }
	  else
	  {
	  if (a < 0)
	  {
		  System.out.print('-');
		  a = -a;
	  }

	   int k = 0;
	   k = a % 10;
	   while (k == 0)
	   {
		   a = a / 10;
		   k = a % 10;
	   }
	   while (a != 0)
	   {
		   System.out.print(k);
		   a = a / 10;
		   k = a % 10;
	   }
	  }
	   System.out.print("\n");
	 }
	return 0;
	}

}

