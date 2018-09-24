package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int sum = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 for (n = 1;n <= a;n++)
		 {
			 if (n % 7 == 0)
			 {
				 sum = sum;
			 }

			 else if (n % 10 == 7)
			 {
				 sum = sum;
			 }



			 else if (n % 10 != 7 && (n / 10) % 10 == 7)
			 {
				 sum = sum;
			 }
			 else
			 {
				 sum += n * n;
			 }
		 }
		System.out.printf("%d",sum);
		return 0;
	}
}

