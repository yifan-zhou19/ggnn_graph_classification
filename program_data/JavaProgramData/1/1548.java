package <missing>;

public class GlobalMembers
{
	public static int cal(int y,int x)
	{
	   int i;
	   int sum;
	   if (x == 1)
	   {
		   return 1;
	   }
	   else
	   {
		  sum = 0;
		  for (i = y;i <= x;i++)
		  {
		  if ((x % i == 0) && ((x / i == 1) || (x / i > y)))
		  {
			  sum += cal(i, x / i);
		  }

		  }
		  return sum;
	   }
	}
	public static int Main()
	{
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 l = Integer.parseInt(tempVar2);
		 }
		System.out.printf("%d",cal(2, l));
		if (i != n)
		{
			System.out.print("\n");
		}
		}

		return 0;
	}

}

