package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int a;
	  int b;
	  int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  a = n % 3;
	  b = n % 5;
	  c = n % 7;
	  if (a == 0 && b == 0)
	  {
		System.out.print("3 5");
		if (c == 0)
		{
		  System.out.print(" 7");
		}
	  }
	  if (a == 0 && b != 0)
	  {
		System.out.print("3");
		if (c == 0)
		{
		  System.out.print(" 7");
		}
	  }
	  if (a != 0 && b == 0)
	  {
		System.out.print("5");
		if (c == 0)
		{
		  System.out.print(" 7");
		}
	  }
	  if (a != 0 && b != 0)
	  {
		if (c == 0)
		{
		  System.out.print("7");
		}
		else
		{
		  System.out.print("n");
		}
	  }
	}

}

