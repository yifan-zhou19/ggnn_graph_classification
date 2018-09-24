package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int a;
		 int b;
		 int c;
		 int d;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n < 10)
		 {
			 System.out.printf("%d",n);
		 }
		 if (n > 10 && n < 100)
		 {
			 a = n % 10;
			 b = n / 10;
			 n = 10 * a + b;
		 System.out.printf("%d",n);
		 }
		 if (n > 100 && n < 1000)
		 {
			 a = n % 10;
			 b = (n % 100 - a) / 10;
			 c = n / 100;
			 n = 100 * a + 10 * b + c;
			 System.out.printf("%d",n);
		 }
		 if (n > 1000 && n < 10000)
		 {
			 a = n % 10;
			 b = (n % 100 - a) / 10;
			 c = (n % 1000 - 10 * b - a) / 100;
			 d = n / 1000;
			 n = 1000 * a + 100 * b + 10 * c + d;
			 System.out.printf("%d",n);
		 }
			 if (n == 10)
			 {
				 System.out.print("01");
			 }
			 if (n == 100)
			 {
				 System.out.print("001");
			 }
			 if (n == 1000)
			 {
				 System.out.print("0001");
			 }
			 if (n == 10000)
			 {
				 System.out.print("00001");
			 }

		return 0;
	}





}

