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
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10000;
		c = (a - 10000 * b) / 1000;
		d = (a - 10000 * b - 1000 * c) / 100;
		e = (a - 10000 * b - 1000 * c - 100 * d) / 10;
		f = a - 10000 * b - 1000 * c - 100 * d - 10 * e;
		if (b != 0 && c != 0 && d != 0 && e != 0 && f != 0)
		{
			System.out.printf("%d%d%d%d%d",f,e,d,c,b);
		}
		else if (b == 0 && c != 0 && d != 0 && e != 0 && f != 0)
		{
			System.out.printf("%d%d%d%d",f,e,d,c);
		}
			 else if (b == 0 && c == 0 && d != 0 && e != 0 && f != 0)
			 {
				 System.out.printf("%d%d%d",f,e,d);
			 }
				  else if (b == 0 && c == 0 && d == 0 && e != 0 && f != 0)
				  {
					  System.out.printf("%d%d",f,e);
				  }
					   else if (b == 0 && c == 0 && d == 0 && e == 0 && f != 0)
					   {
						   System.out.printf("%d",f);
					   }
	}
}

