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
		a = 1;
		b = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		while (a <= e)
		{
			a++;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		if (d > c)
		{
			b = c;
			 c = d;
		}
		else if (d > b && d <= c)
		{
			b = d;
		}
		else
		{
			b = b;
		}
			 c = c;
		}
		System.out.printf("%d\n%d",c,b);
		return 0;
	 }

}

