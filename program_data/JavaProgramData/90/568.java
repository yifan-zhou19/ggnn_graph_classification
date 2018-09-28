package <missing>;

public class GlobalMembers
{
	public static int digui(int x,int y)

	{

		   int z;

		   if (x == 1 || x == 0)
		   {
			z = 1;
		   }
		   else if (y == 1)
		   {
			   z = 1;
		   }
		   else if (x >= y)
		   {
			   z = digui(x - y, y) + digui(x, y - 1);
		   }
		   else
		   {
			   z = digui(x, x);
		   }
		   return z;

	}

	public static int Main()

	{

		   int t;
		   int n;
		   int m;

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   t = Integer.parseInt(tempVar);
		   }

		   while (t-- != 0)

		   {

				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  m = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  n = Integer.parseInt(tempVar3);
				  }

				  System.out.printf("%d\n",digui(m, n));

		   }

		   return 0;

	}

}

