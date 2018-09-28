package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = (x - 10000 * a) / 1000;
		c = (x - 10000 * a - 1000 * b) / 100;
		d = (x - 10000 * a - 1000 * b - 100 * c) / 10;
		e = x % 10;
		y = a + 10 * b + 100 * c + 1000 * d + 10000 * e;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if ((y % 10) != 0)
	{
			 System.out.printf("%d",y);
	}
		 else
		 {
			 y = y / 10;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
		 }
	}

}

