package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int m = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n % 7 == 0)
	  {
		  m++;
	  }
	  if (n % 5 == 0)
	  {
		  m += 10;
	  }
	  if (n % 3 == 0)
	  {
		  m += 100;
	  }
	  switch (m)
	  {
		  case 111:
			  System.out.print("3 5 7");
			  break;
		  case 11:
			  System.out.print("5 7");
			  break;
		  case 101:
			  System.out.print("3 7");
			  break;
		  case 110:
			  System.out.print("3 5");
			  break;
		  case 100:
			  System.out.print("3");
			  break;
		  case 10:
			  System.out.print("5");
			  break;
		  case 1:
			  System.out.print("7");
			  break;
		  case 0:
			  System.out.print("n");
	  }

	}

}

