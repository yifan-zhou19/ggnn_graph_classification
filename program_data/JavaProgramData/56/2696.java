package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void a(int x,int y);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a(n, 10000);
			return 0;
	}


	public static void a(int x,int y)
	{
		 int t;
		 int k;
		 int p;

		 t = x / y;
		 x = x - t * y;
		 if (y == 1)
		 {
			 System.out.printf("%d",t);
		 }
		 else
		 {
			 a(x, y / 10);
			 if (t == 0)
			 {
				 ;
			 }
			 else
			 {
				 System.out.printf("%d",t);
			 }
		 }

	}
}

