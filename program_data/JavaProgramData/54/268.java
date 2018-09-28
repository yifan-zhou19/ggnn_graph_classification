package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int k;
	 int n;
	 int i;
	 int p;
	 int q = 1;
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
	 p = n;
	 for (i = 1;i <= n;i++)
	 {
	  q = q * n;
	 }
	 m = q - p * k + k;
	 System.out.printf("%d",m);
	}
}

