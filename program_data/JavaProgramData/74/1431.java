package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i = 2;
		int s = 0;
		while (i < x)
		{
			 if ((x % i) == 0)
			 {
				 s++;
				 x = x / i;
			 }
			 else
			 {
			 i++;
			 }
		}

		if (s == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}

	public static int huiwenshu(int x)
	{
		int y = 0;
		int w;
		int ori;
		ori = x;

		while (x > 0)
		{
			   w = x % 10;
			   y = y * 10 + w;
			   x = (x - w) / 10;
		}
		if (ori == y)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}



	public static int Main()
	{
		  int m;
		  int n;
		  int s = 0;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  while (m <= n)
		  {
			   if (sushu(m) != 0)
			   {
				   if (huiwenshu(m) != 0)
				   {
					   if (s == 0)
					   {
						   System.out.printf("%d",m);
						   s++;
					   }
					   else
					   {
					   System.out.printf(",%d",m);
					   }
				   }
			   }
			   m++;
		  }

		  if (s == 0)
		  {
		  System.out.print("no");
		  }

	}


}

