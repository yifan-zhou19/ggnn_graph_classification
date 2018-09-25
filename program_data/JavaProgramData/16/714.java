package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  if (a == 0)
	  {
		  System.out.print("0");
	  }
	  while (a != 0)
	  {
		System.out.printf("%d",a - (a / 10) * 10);
		a = a / 10;
	  }
	}
}

