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
	 int f;
	 int g;
	 int h;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 b = a % 1000;
	 c = (a - b) / 1000;
	 d = b % 100;
	 e = (b - d) / 100;
	 f = d % 10;
	 g = (d - f) / 10;
	 if (c == 0)
	 {
		if (e == 0)
		{
		   if (g == 0)
		   {
			  if (f == 0)
			  {
			   System.out.print("0");
			  }
			  else
			  {
			   System.out.printf("%d",f);
			  }
		   }
		   else
		   {
			 System.out.printf("%d%d",f,g);
		   }
		}
		 else
		 {
			System.out.printf("%d%d%d",f,g,e);
		 }
	 }
	 else
	 {
	 System.out.printf("%d%d%d%d",f,g,e,c);
	 }
	}
}

