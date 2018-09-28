package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  int[] b = new int[101];
		  int s;
		  int m;
		  int n;
		  int c = 0;
		  int i;
		  int p;
		  int q = 1;
		  int sum = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
		  c++;
		  }
		  c++;
		  for (i = 0;i < c - 1;i++)
		  {
		  b[i] = a.charAt(i) - '0';
		  }
		  if (c >= 10)
		  {
			  s = 100 * b[0] + 10 * b[1] + b[2];
		  m = s / 13;
		  n = s % 13;
		  System.out.printf("%d",m);
		  i = 3;
		  do
		  {
				   s = 100 * b[i] + 10 * b[i + 1] + b[2 + i];
				   m = (n * 1000 + s) / 13;
				   n = (n * 1000 + s) % 13;
				   if (m > 99)
				   {
				   System.out.printf("%d",m);
				   }
				   else if (m > 9)
				   {
				   System.out.printf("0%d",m);
				   }
				   else
				   {
				   System.out.printf("00%d",m);
				   }
				   i = i + 3;
		  }while (i + 3 <= c - 1);
				   if (i == c - 3)
				   {
					   s = n * 100 + 10 * b[c - 3] + b[c - 2];
				   m = s / 13;
				   n = s % 13;
				   if (m > 9)
				   {
				   System.out.printf("%d\n%d",m,n);
				   }
				   else
				   {
				   System.out.printf("0%d\n%d",m,n);
				   }
				   }
				   if (i == c - 2)
				   {
							 s = 10 * n + b[c - 2];
							 m = s / 13;
							 n = s % 13;
							 System.out.printf("%d\n%d",m,n);
				   }
							 if (i == c - 1)
							 {
									 System.out.printf("\n%d",n);
							 }
		  }
									 else
									 {
										for (i = c - 2;i >= 0;i--)
										{
														p = b[i] * q;
														q = q * 10;
														sum = sum + p;
										}
														System.out.printf("%d\n%d",sum / 13,sum % 13);
									 }

	}



}

