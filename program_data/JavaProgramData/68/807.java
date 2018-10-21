package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int n;
		  int a;
		  int b;
		  int y1;
		  int y2;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 6;i <= n;i = i + 2)
		  {
				for (a = 3;a <= i - 3;a = a + 2)
				{
					   b = i - a;
						   if (a % 2 == 0)
						   {
							   y1 = 0;
						   }
						   else
						   {
								 y1 = 1;
								 for (j = 3;j <= Math.sqrt(a);j = j + 2)
								 {
								 if (a % j == 0)
								 {
								 y1 = 0;
								 break;
								 }
								 }

						   }


						   if (b % 2 == 0)
						   {
							   y2 = 0;
						   }
						   else
						   {
								 y2 = 1;
								 for (j = 3;j <= Math.sqrt(b);j = j + 2)
								 {
								 if (b % j == 0)
								 {
								 y2 = 0;
								 break;
								 }
								 }

						   }
						   if (y1 * y2 == 1)
						   {
									 System.out.printf("%ld=%ld+%ld\n",i,a,b);
									 break;
						   }
				}

		  }

	}

}

