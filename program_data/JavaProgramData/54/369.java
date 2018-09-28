package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int k;
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
		 if (n > 2)
		 {
			m = (int)Math.pow(n,n) - (n - 1) * k;
		 }
		 else
		 {
			m = 7;
		 }
		 System.out.printf("%d\n",m);
		 return 0;
	}

}

