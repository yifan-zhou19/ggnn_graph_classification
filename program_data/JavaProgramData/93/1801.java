package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i = 0;
		int j = 0;
		int k = 0;
		int m;
		int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  if (m % 3 == 0)
	  {
		  i = 1;
	  }
	  if (m % 5 == 0)
	  {
		  j = 1;
	  }
	  if (m % 7 == 0)
	  {
		  k = 1;
	  }
	  if (i == 1 && j == 1 & k == 1)
	  {
		  System.out.print("3 5 7");
	  }
	  else if (i == 1 && j == 1 && k == 0)
	  {
		  System.out.print("3 5");
	  }
	  else if (i == 1 && j == 0 && k == 1)
	  {
		  System.out.print("3 7");
	  }
	  else if (i == 0 && j == 1 && k == 1)
	  {
		  System.out.print("5 7");
	  }
	  else if (i == 1 && j == 0 && k == 0)
	  {
		  System.out.print("3");
	  }
	  else if (i == 0 && j == 1 && k == 0)
	  {
		  System.out.print("5");
	  }
	  else if (i == 0 && j == 0 && k == 1)
	  {
		  System.out.print("7");
	  }
	  else if (i == 0 && j == 0 && k == 0)
	  {
		  System.out.print("n");
	  }


	}
}

