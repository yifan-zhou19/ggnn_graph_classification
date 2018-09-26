package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		int c = 0;
		int d;
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}

			 if (a > c)
			 {
				c = a;

			 }

			 if (b < c)
			 {
				d = b;
				b = c;
				c = d;
				d = 0;
			 }
		}
		 System.out.printf("%d\n%d",b,c);
		return 0;
	}
}

