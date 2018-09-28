package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  double x;
		  double y;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int i = 0;i < n;i++)
		  {
			 int a;
			 int b;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 if (i == 0)
			 {
				x = (double)b / a;
				continue;
			 }
			 else
			 {
				  y = (double)b / a;
			 }
			 if (y - x > 0.05)
			 {
			 System.out.print("better\n");
			 }
			 else if (x - y > 0.05)
			 {
			 System.out.print("worse\n");
			 }
			 else
			 {
			  System.out.print("same\n");
			 }
		  }
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

