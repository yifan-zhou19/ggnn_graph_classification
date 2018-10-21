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
		b = 2;
		if (a > 1)
		{
		do
		{
			c = a % b;
			if (c == 1)
			{
			d = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,d);
			a = d;
			}
			else
			{
				d = a / 2;
			   if (d >= 1)
			   {
					System.out.printf("%d/2=%d\n",a,d);
				a = d;
			   }
			   else
			   {
				a = d;
			   }
			}

		} while (a > 1);
	  System.out.print("End");
		}
	  else
	  {
	  System.out.print("End");
	  }
	}
}

