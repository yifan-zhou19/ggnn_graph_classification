package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 2;
		c = 3 * a + 1;
		d = a / 2;
		if (a == 1)
		{
			System.out.print("End");
		}
		else
		{
			for (;a != 1;)
			{
			 for (;b == 0 && a != 1 ;)
			 {
			 d = a / 2;
			 System.out.printf("%d/2=%d\n",a,d);
			 a = d;
			 b = a % 2;
			 }
			 for (;b == 1 && a != 1 ;)
			 {
			 c = 3 * a + 1;
			 System.out.printf("%d*3+1=%d\n",a,c);
			 a = c;
			 b = a % 2;
			 }
			}
		 System.out.print("End");
		}
		return 0;
	}

}

