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
		 int x;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x = Integer.parseInt(tempVar);
		 }
			 e = x % 10;
			 d = ((x - e) / 10) % 10;

		c = ((x - d * 10 - e) / 100) % 10;

	 b = ((x - 10 * d - e-100 * c) / 1000) % 10;
		a = ((x - b * 1000 - c * 100 - d * 10 - e) / 10000) % 10;

	if (a != 0)
	{
		System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	}
		else if (b != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
	 else if (c != 0)
	 {
			System.out.printf("%d%d%d",e,d,c);
	 }



	 else if (d != 0)
	 {
			System.out.printf("%d%d",e,d);
	 }
	 else if (e != 0)
	 {
			System.out.printf("%d",e);
	 }

		else
		{
			System.out.print("0");
		}





	  }
}

