package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int y;
		int m;
		int d;
		int w;
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
			 if (m == 1)
			 {
			 m = 13;
			 y--;
			 }
			 if (m == 2)
			 {
			 m = 14;
			 y--;
			 }
		b = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;
				if (b == 1)
				{
			System.out.print("Mon.");
				}
		if (b == 2)
		{
			System.out.print("Tue.");
		}
		if (b == 3)
		{
			System.out.print("Wed.");
		}
		if (b == 4)
		{
			System.out.print("Thu.");
		}
		if (b == 5)
		{
			System.out.print("Fri.");
		}
		if (b == 6)
		{
			System.out.print("Sat.");
		}
		if (b == 0)
		{
			System.out.print("Sun.");
		}
	return 0;
	}



}

