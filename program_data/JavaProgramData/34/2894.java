package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (n != 1)
	 {
		 if (n % 2 == 0)
		 {
			 m = n;
			 n = m / 2;
			 System.out.printf("%d/2=%d\n",m,n);
			 continue;
		 }
	 if (n % 2 != 0 && n != 1)
	 {
		 m = n;
		 n = m * 3 + 1;
		 System.out.printf("%d*3+1=%d\n",m,n);
		 continue;
	 }
	 }
	 System.out.print("End\n");
	return 0;
	}
}

