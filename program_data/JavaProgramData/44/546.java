package <missing>;

public class GlobalMembers
{
	public static int pow(int n) //??10?n???
	{
		   int a = 1;
		   int i = 0;
		   for (i = 0;i < n;i++)
		   {
		   a = a * 10;
		   }
		   return a;
	}

	public static int reverse(int n) //??????
	{
		int b = 0;
		int k = 0;
		int i;
		int j;
		int[] a = new int[10];
		  if (n < 0)
		  {
				 n = -n;
				 k = 1;
		  }
		  for (i = 0;i < 10;i++)
		  {
				 a[i] = n / pow(9 - i);
				 n = n % pow(9 - i);
		  }
		  for (j = 0;a[j] == 0;j++)
		  {
			  ;
		  }
		  for (i = 9;i >= j;i--)
		  {
				 b = b * 10 + a[i];
		  }
		 if (k == 1)
		 {
			 return -b;
		 }
			else
			{
				return b;
			}
	}



	public static int Main()
	{
		   int i;
		   int n;
		   int b;
		  for (i = 0;i < 6;i++) //?????????????????????
		  {
			   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 b = reverse(n);
			System.out.print(b);
			System.out.print("\n");
		  }
		return 0;
	}

}

