package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double x;
	  double y;
	  int[] zs = new int[100];
	  int[] yx = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  zs[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  yx[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  x = 1.0 * yx[0] / zs[0];
	   for (i = 1;i < n;i++)
	   {
		   y = 1.0 * yx[i] / zs[i];
		  if (y - x > 0.05)
		  {
			  System.out.print("better");
			  System.out.print("\n");
		  }
		  else if (x - y > 0.05)
		  {
			  System.out.print("worse");
			  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print("same\n");
		  }
	   }
	return 0;
	}
}

