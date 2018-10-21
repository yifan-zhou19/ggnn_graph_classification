package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] b = new int[100];
		  int[] c = new int[100];
		  int n;
		  int i;
		  int m;
		  int j;
		  int k;
		  int t;
		  String a = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  k = a.length() - 1;

		  b[0] = 0;
		  b[1] = 0;
		   for (j = 0;j <= k;j++)
		   {
			   b[j] = a.charAt(j) - '0';
		   }
	 c[1] = 0;
		t = b[0] * 10 + b[1];
		   if (k < 1)
		   {
			System.out.printf("0\n%d\n",b[0]);
		   }

	   if (k == 1 && t < 13)
	   {
	  System.out.printf("0\n%d\n",t);
	   }
	  else if (k == 1 && t >= 13)
	  {
	  System.out.printf("%d\n%d\n",t / 13,t % 13);
	  }
			  else if (k > 1 && (10 * b[0] + b[1]) < 13)
			  {
				  for (m = 2;m <= k;m++)
				  {
				  t = t * 10 + b[m];
				  c[m] = t / 13;
				  t = t % 13;
				  }
				  for (m = 2;m <= k;m++)
				  {
				System.out.printf("%d",c[m]);
				  }
				System.out.print("\n");
				System.out.printf("%d\n",t);
			  }

			else if (k > 1 && (10 * b[0] + b[1]) >= 13)
			{
				  for (m = 1,t = b[0];m <= k;m++)
				  {
				  t = t * 10 + b[m];
				  c[m] = t / 13;
				  t = t % 13;
				  }
				for (m = 1;m <= k;m++)
				{
				System.out.printf("%d",c[m]);
				}
				System.out.print("\n");
				System.out.printf("%d\n",t);
			}

			   else
			   {
				   return 0;
			   }



	}



}
