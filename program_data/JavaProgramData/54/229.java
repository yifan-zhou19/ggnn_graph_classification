package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int k;
	 int i;
	 int m;
	 int p = 1;
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
	 m = n + k;
	 while (true)
	 {
	 for (i = 1;i < n;i++)
	 {
	 m = (m - k) * (n - 1) / n;
	 if (m % n != k)
	 {
		 break;
	 }
	 }
	 if (i != n || (m - k) / n < 1 || m % n != k)
	 {
		 p++;
		 m = n * p + k;
	 }
	 else
	 {
		 break;
	 }
	 }
	 System.out.printf("%d",n * p + k);
	}

}

