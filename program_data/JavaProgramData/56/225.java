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
			 int i = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		if (i <= 4)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 x = Integer.parseInt(tempVar);
			 }
		a = x / 10000;
		b = (x - a * 10000) / 1000;
		c = (x - a * 10000 - b * 1000) / 100;
		d = (x - a * 10000 - b * 1000 - c * 100) / 10;
		e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			System.out.printf("%d\n",e);
		}
		else if (a == 0 && b == 0 && c == 0)
		{
			System.out.printf("%d%d\n",e,d);
		}
		else if (a == 0 && b == 0)
		{
			System.out.printf("%d%d%d\n",e,d,c);
		}
		else if (a == 0)
		{
			System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		else
		{
				   System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
			 i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
		}
		return 0;
	}
}

