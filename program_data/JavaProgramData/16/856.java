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
		   e = Integer.parseInt(tempVar);
	   }
	   if (e < 10)
	   {
		   a = e;
		  System.out.printf("%d",a);
	   }
		else
		{
	   if (e < 100)
	   {
			 a = e % 10;
			 b = (e - a) / 10;
		  System.out.printf("%d%d",a,b);
	   }
		else
		{
	   if (e < 1000)
	   {
				 a = e % 10;
				 b = ((e - a) / 10) % 10;
				 c = (int)(e / 100);
			 System.out.printf("%d%d%d",a,b,c);
	   }
		else
		{
				 a = e % 10;
				 b = ((e - a) / 10) % 10;
				 c = ((e - b * 10 - a) / 100) % 10;
				 d = (int)(e / 1000);
				System.out.printf("%d%d%d%d",a,b,c,d);
		}
		}
		}
	return 0;






	}

}

