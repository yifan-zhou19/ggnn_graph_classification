package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[100]);
		  int[] answer = new int[100];
		  int a;
		  int j = 1;
		  int i = 0;
		  int p;
		  int q;
		  int m;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  a = c.length();
		  if (a == 1)
		  {
				   System.out.print("0\n");
				   System.out.printf("%d",c.charAt(0) - '0');
		  }
		  else
		  {
			   while (j < a)
			   {
						  if (j == 1)
						  {
							 p = c.charAt(j - 1) - '0';
						  }
						  q = c.charAt(j) - '0';
						  m = 10 * p + q;
						  if (m <= 12 && j == 1 && a <= 2)
						  {
												System.out.print("0\n");
												System.out.printf("%d",m);
												break;
						  }
						  else
						  {
							   if (m <= 12 && a>2 && j == 1)
							   {
													m = 100 * p + q * 10 + (c.charAt(j + 1) - '0');
													j = j + 1;
							   }
							   answer[i] = m / 13;
							   p = m % 13;
							   i = i + 1;
						  }
						  j = j + 1;
			   }
			   for (l = 0;l < i;l++)
			   {
				  System.out.printf("%d",answer[l]);
			   }
			   if (a != 2 || (a == 2 && i != 0))
			   {
				  System.out.printf("\n%d",p);
			   }
		  }
	}

}

