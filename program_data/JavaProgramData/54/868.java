package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int k;
	 int t;
	 int x;
	 int y;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (t = 1,x = 1,y = 1;t <= n;t++)
	 {
		 m = n * x + k;
		if (t != n)
		{
		 if (m % (n - 1) == 0)
		 {
		 x = m / (n - 1);
		 }
		 else
		 {
			 m = 0;
			 t = 0;
			 ;
			 y++;
			 x = y;
		 }
		}
	 }
	 System.out.printf("%d",m);
	return 0;
	}
}

