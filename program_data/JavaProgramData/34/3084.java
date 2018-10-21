package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a != 1)
		{
				do
				{
					   if (a % 2 == 1)
					   {
								   b = a * 3 + 1;
								   System.out.printf("%d*3+1=%d\n",a,b);
					   }
					   else if (a % 2 == 0)
					   {
								   b = a / 2;
								   System.out.printf("%d/2=%d\n",a,b);
					   }
					   a = b;
				} while (a != 1);
				System.out.print("End");
		}
		else
		{
			System.out.print("End");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

