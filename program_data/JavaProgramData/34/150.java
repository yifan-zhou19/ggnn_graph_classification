package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x != 1)
		{
		  if (x % 2 == 0)
		  {
			  System.out.printf("%ld/2=%ld\n",x,x / 2);
			  x = x / 2;
		  }
		   else
		   {
			   m = x * 3 + 1;
			   System.out.printf("%ld*3+1=%ld\n",x,m);
			   x = m;
		   }

		}
		if (x == 1)
		{
			System.out.print("End");
		}

	}

}

