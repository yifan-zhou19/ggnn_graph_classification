package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a1;
	   int a2;
	   int a3;
	   int a4;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a1 = n / 1000;
	   a2 = (n - 1000 * a1) / 100;
	   a3 = (n - 1000 * a1 - 100 * a2) / 10;
	   a4 = (n - 1000 * a1 - 100 * a2 - 10 * a3);
		if (a1 == 0 & a2 == 0 & a3 == 0)
		{
	   System.out.printf("%d",a4);
		}
	   if (a1 == 0 & a2 != 0)
	   {
		System.out.printf("%d%d%d",a4,a3,a2);
	   }
	   if (a1 != 0 & a2 != 0 & a3 != 0)
	   {
		System.out.printf("%d%d%d%d",a4,a3,a2,a1);
	   }


		return 0;
	}

}

