package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int max;
		int second;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a = 1;
		max = b;
		second = 0;
		while (a < n)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 c = Integer.parseInt(tempVar3);
			 }
			 if (c >= max)
			 {
				d = max;
				max = c;
				second = d;
			 }
			 if ((max > c) && (c >= second))
			 {

				 second = c;
			 }

			 a += 1;
		}
		System.out.printf("%d\n%d\n",max,second);
		return 0;
	}


}

