package <missing>;

public class GlobalMembers
{
	public static int RevNum(int n)
	{
	   int s = 0;
	   int j = 0;
	   if (n == 0 || -0)
	   {
	   System.out.print("0");
	   }
	   else
	   {
			  if (n > 0)
			  {
				  for (;n % 10 == 0;)
				  {
					n = n / 10;
				  }
				for (;n / 10 != 0;)
				{
				  s = n % 10;
				  n = n / 10;
				  System.out.printf("%d",s);
				}
				System.out.printf("%d\n",n);
			  }
			   if (n < 0)
			   {
				   n = -n;
				   for (;n % 10 == 0;)
				   {
					n = n / 10;
					if (0 < n < 10)
					{
					n = -n;
					}
				   }
				   for (;n / 10 != 0;)
				   {
					 s = n % 10;
					 n = n / 10;
					 if (j == 0)
					 {
					 System.out.print("-");
					 }
					 System.out.printf("%d",s);
					 j++;
				   }

				System.out.printf("%d\n",n);

			   }

	   }
	   j = 0;

	return 0;
	}

	public static int Main()
	{
	  int k;
	  int i;
	  for (i = 0;i < 6;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  RevNum(k);
	  }
		 return 0;
	}

}

