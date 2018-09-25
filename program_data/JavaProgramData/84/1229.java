package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int b;
	 int w = 0;
	 int q = 0;
	 int i = 1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (i <= n)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 if (b >= w)
		 {
			 q = w;
			 w = b;
		 }
		 else
		 {
			 if (b < w && b >= q)
			 {
				 w = w;
				 q = b;
			 }
		 }
		 i++;
	 }
	 System.out.printf("%d\n%d\n",w,q);
	 return 0;
	}
}

