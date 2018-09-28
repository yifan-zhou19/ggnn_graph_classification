package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		x = (double)b / a;
		for (i = 1;i < n;i++)
		{
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  b = Integer.parseInt(tempVar5);
		  }
		  y = (double)b / a;
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
			 System.out.print("same");
			 System.out.print("\n");
		 }
		}
	   return 0;
	}


}

