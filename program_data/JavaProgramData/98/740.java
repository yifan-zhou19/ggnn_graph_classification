package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][42];
	   int sum;
	   int i;
	   int j;
	   int k;
	   int n;
	   int m;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   sum = 0;
	   for (i = 1;i <= n;i++)
	   {
				a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 m = String.valueOf(a[i]).length();
			 if (sum + m + 1 <= 80)
			 {
				 if (sum != 0)
				 {
						  System.out.print(" ");
						  System.out.print(a[i]);
						sum = sum + m + 1;
				 }
				  else
				  {
					  System.out.print(a[i]);
						 sum = sum + m;
				  }
			 }
			 else
			 {
				 System.out.print("\n");
					System.out.print(a[i]);
					sum = 0;
					sum = sum + m;
			 }
	   }
		return 0;






	}

}

