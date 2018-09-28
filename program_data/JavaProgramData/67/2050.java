package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 float a;
	 float b;
	 float c;
	 float x;
	 float y;
	 float z;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = Float.parseFloat(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 y = Float.parseFloat(tempVar3);
	 }
	 z = y / x;
	 for (i = 0;i < n - 1;i++)
	 {
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  a = Float.parseFloat(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  b = Float.parseFloat(tempVar5);
	  }
	  c = b / a;
	  if (20 * (c - z) > 1)
	  {
	  System.out.print("better\n");
	  }
	  else
	  {
		  if (20 * (z - c) > 1)
		  {
	  System.out.print("worse\n");
		  }
	  else
	  {
	  System.out.print("same\n");
	  }
	  }
	 }
	}

}

