package <missing>;

public class GlobalMembers
{
	public static int cal(int x,int y)
	{
	   int i;
	   int sum;
	   if ((x < 0) || (y == 0))
	   {
		   return 0;
	   }

	   if (x == 0)
	   {
		   return 1;
	   }
	   if (y == 1)
	   {
		   return 1;
	   }

	   else
	   {
		   return cal(x - y, y) + cal(x, y - 1);
	   }

	   return sum;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= l;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  System.out.printf("%d",cal(m, n));
		  if (i != l)
		  {
			  System.out.print("\n");
		  }
		}

		return 0;
	}

}

