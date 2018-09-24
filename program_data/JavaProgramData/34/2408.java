package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int r;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
		System.out.print("End");
		}
		else
		{
			   if (a % 2 == 0)
			   {
			   r = a / 2;
		   b = r;
		System.out.printf("%d/2=%d\n",a,r);
			   }
		else
		{
			r = (a * 3) + 1;
		b = r;
		System.out.printf("%d*3+1=%d\n",a,r);
		}
	while (b != 1)
	{
			if (b % 2 == 0)
			{
					  r = b / 2;

		System.out.printf("%d/2=%d\n",b,r);
		b = r;
			}
		else
		{
			r = b * 3 + 1;

		System.out.printf("%d*3+1=%d\n",b,r);
		 b = r;
		}

	}
		System.out.print("End");
		}
		System.in.read();
		System.in.read();
	}
}

