package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  int i;
	  int a = 0;
	  int b = 0;
	  int c = 0;

	  if (k % 3 == 0)
	  {
		  System.out.print("3");
		  if (k % 5 == 0)
		  {
			  System.out.print(" 5");
		  }
		  if (k % 7 == 0)
		  {
			  System.out.print(" 7");
		  }
	  }
	  else if (k % 5 == 0)
	  {
		  System.out.print("5");
		  if (k % 7 == 0)
		  {
			  System.out.print(" 7");
		  }
	  }
	  else if (k % 7 == 0)
	  {
		  System.out.print("7");
	  }
	  else
	  {
		  System.out.print("n");
	  }




	}
}

