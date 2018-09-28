package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int a = 0;
		int b;
		int c;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		e = (y - 1) / 400;
		f = (y - 1) / 4 - (y - 1) / 100 + e;
		a = f + y - 1;
			if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
			{
			if (m == 1)
			{
				b = d;
			}
		 if (m == 2)
		 {
			 b = 3 + d;
		 }
		 if (m == 3)
		 {
			 b = 4 + d;
		 }
		 if (m == 4)
		 {
			 b = d;
		 }
		 if (m == 5)
		 {
			 b = 121 + d;
		 }
		 if (m == 6)
		 {
			 b = 12 + d;
		 }
		 if (m == 7)
		 {
			b = 42 + d;
		 }
		 if (m == 8)
		 {
			 b = 3 + d;
		 }
		 if (m == 9)
		 {
				 b = 34 + d;
		 }
		 if (m == 10)
		 {
			b = d + 1;
		 }
		 if (m == 11)
		 {
			 b = 4 + d;
		 }
		 if (m == 12)
		 {
				 b = 6 + d;
		 }
			}
		 if (y % 4 != 0 || (y % 400 != 0 && y % 100 == 0))
		 {
			 if (m == 1)
			 {
				 b = d;
			 }
		 if (m == 2)
		 {
			 b = 3 + d;
		 }
		 if (m == 3)
		 {
			 b = 3 + d;
		 }
		 if (m == 4)
		 {
			 b = d + 6;
		 }
		 if (m == 5)
		 {
			 b = 1 + d;
		 }
		 if (m == 6)
		 {
			 b = 11 + d;
		 }
		 if (m == 7)
		 {
			b = 6 + d;
		 }
		 if (m == 8)
		 {
			 b = 2 + d;
		 }
		 if (m == 9)
		 {
				 b = 5 + d;
		 }
		 if (m == 10)
		 {
			b = d + 1;
		 }
		 if (m == 11)
		 {
			 b = 3 + d;
		 }
		 if (m == 12)
		 {
				 b = 5 + d;
		 }
		 }
		 c = (a + b) % 7;
			 if (c == 1)
			 {
			System.out.print("Mon.");
			 }
		 if (c == 2)
		 {
			 System.out.print("Tue.");
		 }
		 if (c == 3)
		 {
			 System.out.print("Wed.");
		 }
		 if (c == 4)
		 {
			 System.out.print("Thu.");
		 }
		  if (c == 5)
		  {
			  System.out.print("Fri.");
		  }
		 if (c == 6)
		 {
			 System.out.print("Sat.");
		 }

		if (c == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

