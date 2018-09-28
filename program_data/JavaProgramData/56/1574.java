package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int s;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int l = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = Integer.parseInt(tempVar);
	   }
	   if (s != 0)
	   {
		   l++;
		   a = s % 10;
		   s /= 10;
	   }
	   if (s != 0)
	   {
		   l++;
		   b = s % 10;
		   s /= 10;
	   }
	   if (s != 0)
	   {
		   l++;
		   c = s % 10;
		   s /= 10;
	   }
	   if (s != 0)
	   {
		   l++;
		   d = s % 10;
		   s /= 10;
	   }
	   if (s != 0)
	   {
		   l++;
		   e = s % 10;
		   s /= 10;
	   }
	   switch (l)
	   {
	   case 5:
		   System.out.printf("%d%d%d%d%d",a,b,c,d,e);
			  break;
	   case 4:
		   System.out.printf("%d%d%d%d",a,b,c,d);
			  break;
	   case 3:
		   System.out.printf("%d%d%d",a,b,c);
			  break;
	   case 2:
		   System.out.printf("%d%d",a,b);
			  break;
	   case 1:
		   System.out.printf("%d",a);
			  break;
	   }
	}
}

