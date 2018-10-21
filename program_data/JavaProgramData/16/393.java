package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int g;
	 int h;
	 int i;
	 int f;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 f = Integer.parseInt(tempVar);
	 }
	 a = f / 10000;
	 g = f % 10000;
	 b = g / 1000;
	 h = g % 1000;
	 c = h / 100;
	 i = h % 100;
	 d = i / 10;
	 e = i % 10;
	 if (a > 0)
	 {
	 System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	 }
	 else
	 {
	  if (b > 0)
	  {
	  System.out.printf("%d%d%d%d",e,d,c,b);
	  }
	  else
	  {
	   if (c > 0)
	   {
	   System.out.printf("%d%d%d",e,d,c);
	   }
	   else
	   {
		if (d > 0)
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
}

