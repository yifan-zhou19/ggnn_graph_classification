package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int r1;
		int r2;
		int r3;
		int r4;
		int r5;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = (double)a / 10000;
		if (b >= 1)
		{
			r5 = a / 10000;
			r4 = (a - 10000 * r5) / 1000;
			r3 = (a - 10000 * r5 - 1000 * r4) / 100;
			r2 = (a - 10000 * r5 - 1000 * r4 - 100 * r3) / 10;
			r1 = a - 10000 * r5 - 1000 * r4 - 100 * r3 - 10 * r2;
		System.out.printf("%d%d%d%d%d\n",r1,r2,r3,r4,r5);
		}
		  else if (b >= 0.1)
		  {
			  r4 = a / 1000;
			  r3 = (a - 1000 * r4) / 100;
			  r2 = (a - 1000 * r4 - 100 * r3) / 10;
			  r1 = a - 1000 * r4 - 100 * r3 - 10 * r2;
			  System.out.printf("%d%d%d%d\n",r1,r2,r3,r4);
		  }
		   else if (b >= 0.01)
		   {
			   r3 = a / 100;
			   r2 = (a - 100 * r3) / 10;
			   r1 = a - 100 * r3 - 10 * r2;
			   System.out.printf("%d%d%d\n",r1,r2,r3);
		   }
			else if (b >= 0.001)
			{
				r2 = a / 10;
				r1 = a - 10 * r2;
				System.out.printf("%d%d\n",r1,r2);
			}
			 else
			 {
				 System.out.printf("%d\n",a);
			 }
		return 0;

	}
}

