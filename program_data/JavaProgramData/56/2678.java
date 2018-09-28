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
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x < 0 && x>99999)
		{
		   System.out.print("error\n");
		}
		   else if (x >= 10000)
		   {
				n = 5;
		   }
		   else if (x >= 1000)
		   {
				n = 4;
		   }
		   else if (x >= 100)
		   {
				n = 3;
		   }
		   else if (x >= 10)
		   {
				n = 2;
		   }
		   else
		   {
				n = 1;
		   }
		   a = (int)(x) / 10000;
		   b = (int)(x - a * 10000) / 1000;
		   c = (int)(x - a * 10000 - b * 1000) / 100;
		   d = (int)(x - a * 10000 - b * 1000 - c * 100) / 10;
		   e = (int)(x - a * 10000 - b * 1000 - c * 100 - d * 10);
		   switch (n)
		   {
		   case 5:
			   System.out.printf("%d%d%d%d%d",e,d,c,b,a);
				  break;
		   case 4:
			   System.out.printf("%d%d%d%d",e,d,c,b);
				  break;
		   case 3:
			   System.out.printf("%d%d%d",e,d,c);
				  break;
		   case 2:
			   System.out.printf("%d%d",e,d);
				  break;
		   case 1:
			   System.out.printf("%d",e);
				  break;
		   }
	}
}

