package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 int w;
		 int l;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n - 10 < 0)
		 {
			 System.out.printf("%d",n);
		 }
		 else
		 {
			 if (n - 100 < 0)
			 {
				 i = n % 10;
				 j = (n - i) / 10;
				 System.out.printf("%d%d",i,j);
			 }
			 else
			 {
				 if (n - 1000 < 0)
				 {
					 i = n % 10;
					 j = ((n - i) / 10) % 10;
					 k = (n - i - 10 * j) / 100;
					 System.out.printf("%d%d%d",i,j,k);
				 }
				 else
				 {
					 if (n - 10000 < 0)
					 {
						 i = n % 10;
						 j = ((n - i) % 100) / 10;
						 k = ((n - i - 10 * j) % 1000) / 100;
						 w = (n - i - 10 * j - 100 * k) / 1000;
						 System.out.printf("%d%d%d%d",i,j,k,w);
					 }
				 }

			 }
		 }
		 return 0;
	}
}

