package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  if (a == 10000)
		  {
		  System.out.print("00001");
		  }
		  b = a / 1000;
		  c = (a - b * 1000) / 100;
		  d = (a - b * 1000 - c * 100) / 10;
		  e = a - b * 1000 - c * 100 - d * 10;
		  if (b != 0)
		  {
		  System.out.printf("%d%d%d%d",e,d,c,b);
		  }
		  else
		  {
			  if (c != 0)
			  {
		  System.out.printf("%d%d%d",e,d,c);
			  }
		  else
		  {
			  if (d != 0)
			  {
		  System.out.printf("%d%d",e,d);
			  }
		  else
		  {
		  System.out.printf("%d",e);
		  }
		  }
		  }
	}
}

