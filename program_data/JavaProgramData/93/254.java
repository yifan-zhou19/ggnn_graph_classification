package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  c = Integer.parseInt(tempVar3);
	  }
	  if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
	  {
		  System.out.print("3 5 7");
	  }
	  else
	  {
		  if (!(a % 3 == 0 || a % 5 == 0 || a % 7 == 0))
		  {
			  System.out.print("n");
		  }
	  }
	  if (!(a % 3 == 0 && a % 5 == 0 && a % 7 == 0) && a % 3 == 0 && a % 5 == 0)
	  {
		  System.out.print("3 5");
	  }
	  if (!(a % 3 == 0 && a % 5 == 0 && a % 7 == 0) && a % 3 == 0 && a % 7 == 0)
	  {
		  System.out.print("3 7");
	  }
	  if (!(a % 3 == 0 && a % 5 == 0 && a % 7 == 0) && a % 7 == 0 && a % 5 == 0)
	  {
		  System.out.print("5 7");
	  }
	  if (a % 3 == 0 && !(a % 5 == 0 || a % 7 == 0))
	  {
		  System.out.print("3");
	  }
	  if (a % 5 == 0 && !(a % 3 == 0 || a % 7 == 0))
	  {
		  System.out.print("5");
	  }
	  if (a % 7 == 0 && !(a % 5 == 0 || a % 3 == 0))
	  {
		  System.out.print("7");
	  }
	  return 0;
	}
}

