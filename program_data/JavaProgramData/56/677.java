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
		int x;
		String tempVar = ConsoleInput.scanfRead(null, 5);
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = x % 10000 / 1000;
		c = x % 1000 / 100;
		d = x % 100 / 10;
		e = x % 10;
		x = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (x % 10 == 0)
	{
			 x = x / 10;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
	}
		 else
		 {
			 System.out.printf("%d\n",x);
		 }
	}
}

