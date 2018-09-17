package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  do
	  {
		 if (a == b)
		 {
			  break;
		 }
		  if (a > b)
		  {
			  a = a / 2;
		  }
		  else
		  {
			  b = b / 2;
		  }

	  } while (1 != 0);
	  System.out.printf("%d",a);
	  return 0;
	}
}

