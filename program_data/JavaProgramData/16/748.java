package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[4];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (n == 10000)
	   {
		   System.out.print("00001");
		   System.out.print("\n");
	   }
	   else if (n == 1000)
	   {
		   System.out.print("0001");
		   System.out.print("\n");
	   }
	   else if (n > 1000 && n < 10000)
	   {
			  a[3] = n / 1000;
		a[2] = (n % 1000) / 100;
		a[1] = (n - a[3] * 1000 - a[2] * 100) / 10;
		a[0] = n - a[3] * 1000 - a[2] * 100 - a[1] * 10;
		System.out.print(a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3]);
		System.out.print("\n");
	   }
	   else if (n == 100)
	   {
		   System.out.print("001");
	   }
	   else if (n > 100 && n < 1000)
	   {
		  a[2] = n / 100;
		  a[1] = (n % 100) / 10;
		  a[0] = n - a[2] * 100 - a[1] * 10;
		  System.out.print(a[0] * 100 + a[1] * 10 + a[2]);
	   }
	   else if (n == 10)
	   {
		   System.out.print("01");
	   }
	   else if (n > 10 && n < 100)
	   {
		a[1] = n / 10;
		a[0] = n - a[1] * 10;
		System.out.print(a[0] * 10 + a[1]);
	   }
	   else if (n >= 0 && n < 10)
	   {
		   System.out.print(n);
	   }
	   return 0;
	}

}

