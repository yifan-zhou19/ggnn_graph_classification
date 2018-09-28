package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int a;
	  int m;
	  int n;
	  int i;
	  int p;
	  int q;
	  int b;
	  int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  i = 6;
	  m = 3;

	  while (i <= a)

	  {
			while (m <= i / 2)
			{
					   q = 3;
					 while (q <= Math.sqrt(m))
					 {
						   c = m % q;
						   if (c != 0)
						   {
							   q = q + 1;
						   }
						   else
						   {
							   m = m + 2;
							   q = 3;
						   }
					 }



					p = 2;
					n = i - m;
					while (p <= Math.sqrt(n))
					{
						   b = n % p;
						   if (b == 0)
						   {
							   break;
						   }
						   else
						   {
							   p = p + 1;
						   }
					}
			 if (b != 0)
			 {
				 System.out.printf("%ld=%ld+%ld\n",i,m,n);
				 break;
			 }
			 else
			 {
				 m = m + 2;
			 }
			}
		  i = i + 2;
		  m = 3;
	  }
	}

}

